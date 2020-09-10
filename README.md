
# Tech Eval PortoBello

# Introdução 
   voce faz parte do time de integrações da Portobello e recebeu a demanda de integrar dados de produto que estão sendo originados pelo sistema A e precisam ser inputados no sistema B. 
   Sua tarefa é criar uma arquitetura de integração que seja possivel realizar este fluxo com qualidade , escalabilidade e segurança. 

## 1. Objetivo:
        
       - Criar uma API fake ou utilizar alguma api publica que contenha cadastro de produtos. 
       - Criar Uma API fake que exponha um metodo Post para inserção dos dados de produtos consultados do Sistema A
       - Criar uma arquitetura de microserviços orientada a eventos que tem como objetivo pegar os dados da Api de produto e inserir num sistema B que está expondo uma API de inserção de dados.
        
## 2. Regras Gerais:

   <p>
    -   O desenvolvimento dos microserviços devem ser feitos em java (springboot). <br />
    -   Pode-se utilizar banco no-sql ou h2 para armazenar estado. <br />
    -   Para a mensageria você pode utlizar rabbitmq ou kafka. <br />
    -   Pode trabalhar com o banco h2 para armazenar as mensagens enviadas. <br />
    -   Você não possui uma data final para entregar o exame,  mas iremos avaliar o tempo necessário para cumprir a atividade e a qualidade da entrega. <br />
    -   Seu código será avaliado quanto ao cumprimento das tarefas e a qualidade do código escrito. <br />
    -   O código será avaliado segundo os seguintes critérios de avalição: <br />
        a.  Execução; <br />
        b.  Limpeza do código; <br />
        c.  Organização; <br />
        d.  Legibilidade; <br />
        e.  Cobertura de testes; <br />
        f.  Tempo gasto para cumprir a tarefa (será considerado o momento da solicitação do merge request como fim); <br />
</p>
    
## 3. Arquitetura de Referencia:
   Segue abaixo um exemplo de arquitetura que pode ser utilizada como base para o desenvolvimento da integração. <br />
   <p>
   <p align="center">
   <p align="center">
  <img src="imagens/fluxo.jpg" width="350" title="Arquitetura de exemplo">
</p>
    
    
  ## 4. Entregaveis:
    Ao final do desenvolvimento voce deve entregar: 
       - Repositorio com o codigo fonte , contendo orientações de como subir o ambiente. 
       - Breve explicação da solução desenvolvida. 
    
    
    

