
# Tech Eval PortoBello

# Introdução 
   voce faz parte do time de integrações da Portobello e recebeu a demanda de integrar dados de produto que estão sendo originados pelo sistema A e integrar com o Sistema B. 
   Sua tarefa é criar uma arquitetura de integração que seja possivel realizar este fluxo de integração com qualidade , escalabilidade e segurança. 

### 1. Objetivo:
        
       - Criar uma API fake ou utilizar alguma api publica que contenha cadastro de produtos. 
       - Criar Uma API fake que exponha um metodo Post para inserção dos dados de produtos consultados do Sistema A
       - Criar uma arquitetura de microserviços orientada a eventos que tem como objetivo pegar os dados da Api de produto e inserir num sistema B que está expondo uma API de inserção de dados.
        
### 2. Regras Gerais:

   
    1. O desenvolvimento dos microserviços devem ser feitos em java (springboot)
    2. Pode-se utilizar banco no-sql ou h2 para armazenar estado. 
    3. Para a mensageria você pode utlizar rabbitmq ou kafka
    4. Pode trabalhar com o banco h2 para armazenar as mensagens enviadas
    5. Você não possui uma data final para entregar o exame,  mas iremos avaliar o tempo necessário para cumprir a atividade e a qualidade da entrega. 
    6. Seu código será avaliado quanto ao cumprimento das tarefas e a qualidade do código escrito.
    8. O código será avaliado segundo os seguintes critérios de avalição:
        a. Execução;
        b. Limpeza do código;
        c. Organização;
        d. Legibilidade;
        e. Cobertura de testes;
        f. Tempo gasto para cumprir a tarefa 
        (será considerado o momento da solicitação do merge request como fim).
    9.  Abaixo um exemplo de arquitetura para está integração.
    
   <p align="center">
  <img src="imagens/fluxo.jpg" width="350" title="Arquitetura de exemplo">
</p>
    
    
  ### 3. Entregaveis:
    Ao final do desenvolvimento voce deve entregar: 
       - Repositorio com o codigo fonte , contendo orientações de como subir o ambiente. 
       - Breve explicação da solução desenvolvida. 
    
    
    

