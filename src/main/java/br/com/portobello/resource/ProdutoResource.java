package br.com.portobello.resource;

import br.com.portobello.entity.Produto;
import br.com.portobello.error.ResourceNotFoundException;
import br.com.portobello.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoResource {

    private ProdutoRepository repository;

    @Autowired
    public ProdutoResource(ProdutoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<?> listAll() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{code}")
    public ResponseEntity<?> getProdutoByCode(@PathVariable("code") Long code) {
        List<Produto> produtos = repository.findByCodigo(code);
        if (produtos.isEmpty()) {
            throw new ResourceNotFoundException("O produto com codigo ".concat(Long.toString(code)).concat(" nao foi encontrado"));
        } else {
            return new ResponseEntity<>(produtos.get(0), HttpStatus.OK);
        }
    }

    @PostMapping
    public ResponseEntity<?> save(@Valid @RequestBody Produto produto) {
        return new ResponseEntity<>(repository.save(produto), HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<?> update(@Valid @RequestBody Produto produto, @PathVariable("id") Long id) {
        verififyProductExist(id);
        repository.save(produto);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        verififyProductExist(id);
        repository.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    private void verififyProductExist(Long id) {
        if (repository.findOne(id) == null) {
            throw new ResourceNotFoundException("O produto com ID ".concat(Long.toString(id)).concat(" nao foi encontrado"));
        }
    }
}
