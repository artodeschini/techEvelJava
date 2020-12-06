package br.com.portobello.repository;

import br.com.portobello.entity.Produto;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Long> {

    List<Produto> findByCodigo(Long codigo);

}