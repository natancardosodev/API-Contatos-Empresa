# API de Contatos da Empresa
Projeto para disciplina Aplicações Avançadas Web (P5). Com a arquitetura REST foi feito uma API com Spring Boot para duas entidades: Cliente e Fornecedor. A seguir é explicado cada endpoint:

## Inserir Cliente
Método HTTP: POST | Contexto: /api | Recurso: /clientes 
Identificador de recurso: http://localhost:8090/api/clientes
**Representação de entrada (JSON):** 

    {
    	"nome": "João Diego Moura",
    	"email": "joaodm@gmail.com",
    	"telefone": "(83) 98889-4278",
    	"cpf": "661.615.144-19"
    }

**Representação de resposta (JSON):** 

    {
      "codigo": 1,
      "mensagem": "Cliente salvo com sucesso"
    }

## Atualizar Cliente
Método HTTP: PUT | Contexto: /api | Recurso: /clientes 
Identificador de recurso: http://localhost:8090/api/clientes
**Representação de entrada (JSON):** 

    {
		"id": 1,
    	"nome": "João Diego Moura",
    	"email": "joaodm@gmail.com",
    	"telefone": "(83) 99985-3526",
    	"cpf": "661.615.144-19"
    }

**Representação de resposta (JSON):** 

    {
      "codigo": 1,
      "mensagem": "Cliente atualizado com sucesso"
    }

## Listar Clientes
Método HTTP: GET | Contexto: /api | Recurso: /clientes 
Identificador de recurso: http://localhost:8090/api/clientes
**Representação de entrada (JSON):**  
Nulo
**Representação de resposta (JSON):** 

    [
      {
	        "id": 1,
    	"nome": "João Diego Moura",
    	"email": "joaodm@gmail.com",
    	"telefone": "(83) 99985-3526",
    	"cpf": "661.615.144-19"
      }
    ]  

## Excluir Cliente (id na representação - json)
Método HTTP: DELETE | Contexto: /api | Recurso: /clientes 
Identificador de recurso: http://localhost:8090/api/clientes
**Representação de entrada (JSON):** 

    {
    	"id": 1
    }
**Representação de resposta (JSON):** 

    {
      "codigo": 1,
      "mensagem": "Cliente removido com sucesso"
    }


## Excluir Cliente (id no recurso)
Método HTTP: DELETE | Contexto: /api | Recurso: /clientes | Parâmetro: 1
Identificador de recurso: http://localhost:8090/api/clientes/1
**Representação de entrada (JSON):** 
Nulo
**Representação de resposta (JSON):** 

    {
      "codigo": 1,
      "mensagem": "Cliente removido com sucesso"
    }

## Listar Cliente por nome
Método HTTP: DELETE | Contexto: /api | Recurso: /clientes | Parâmetro: João%20Diego%20Moura
Identificador de recurso: http://localhost:8090/api/clientes/João%20Diego%20Moura
*Observação:* Parâmetros com espaço em branco ao utilizar no recurso deve ser colocado %20, pois a URL não aceita espaço nulo e com isso deve ser inserido um código em ASCII equivalente.
**Representação de entrada (JSON):** 
Nulo
**Representação de resposta (JSON):** 

    {
      "id": 1,
      "nome": "João Diego Moura",
      "email": "joaodm@gmail.com",
      "telefone": "(83) 99985-3526",
      "cpf": "661.615.144-19"
    }

## Listar Cliente por e-mail
Método HTTP: DELETE | Contexto: /api | Recurso: /clientes/email | Parâmetro: joaodm@gmail.com
Identificador de recurso: http://localhost:8090/api/clientes/email/joaodm@gmail.com
*Observação:* Por já existir um identificador de recurso semelhante, foi necessário incluir a query '/email'.
**Representação de entrada (JSON):** 
Nulo
**Representação de resposta (JSON):** 

    {
      "id": 1,
      "nome": "João Diego Moura",
      "email": "joaodm@gmail.com",
      "telefone": "(83) 99985-3526",
      "cpf": "661.615.144-19"
    }

 - **Os mesmos itens de Clientes foram feitos para Fornecedores, a exemplo de Inserir Fornecedor**

## Inserir Fornecedor
Método HTTP: POST | Contexto: /api | Recurso: /fornecedores
Identificador de recurso: http://localhost:8090/api/fornecedores
**Representação de entrada (JSON):** 

    {
    	"nome": "Maitê Construções",
    	"email": "maite@construcoes.com.br",
    	"telefone": "(83) 3238-2559",
    	"cnpj": "53.890.572/0001-50",
    	"razaoSocial": "Maitê Material de Construções ME"
    }

**Representação de resposta (JSON):** 

    {
      "codigo": 1,
      "mensagem": "Fornecedor salvo com sucesso"
    }

## Como executar o projeto

### *Usando o Git Bash*
- Navegue até o seu diretório de projetos de programação
- Faça o clone do projeto para a sua máquina local: ```git clone https://github.com/natancardosodev/API-Contatos-Empresa.git``` 

### *Usando a IDE*
Através do Spring Tool Suite, Eclipse com o plugin STS ou outra IDE Java:
- Depois de importar o projeto deve atualizar as dependências do Maven clicando com o botão direito no projeto, buscando a opção ```Maven``` e clicar em ```Update Project```
- Na janela aberta selecione o projeto e clique no checkbox ```Force Update of Snapshots/Releases``` 
- Clique em ```Ok``` e aguarde
- Finalizada a atualização do Maven, deve clicar com o botão direito no projeto, buscar a opção ```Run As``` e clicar em ```Spring Boot App```

### *Executando no browser*
- Utilize um cliente REST, como: Postman ou Insomnia, para executar os endpoints acima.