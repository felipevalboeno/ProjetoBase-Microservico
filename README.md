# Projeto Base: Microserviços

Aqui temos um microserviço bem básico de uma Pessoa, que se conecta com o Eureka Server e um Gateway, e traz uma pessoa cadastrada no PessoaController.

Para rodar, abra no vsCode e execute na ordem:
- EurekaServiceApplication
- ZuulServiceApplication
- ControleDePessoasApplication

Nota: Apesar do Gateway se chamar ZuulServiceAplication, não é ele que está implementado pois foi descontinuado em 2020.

Para testar o Microserviço execute no navegador a rota: http://localhost:8082/controle-pessoa-ms/api/pessoas
 - localhost:8082 = Gateway
 - controle-pessoa-ms = Eureka Server
 - api/pessoas = Microserviço

 ![ms](https://github.com/felipevalboeno/assets/blob/main/ms.png)

  ![ms](https://github.com/felipevalboeno/assets/blob/main/eureka.png)


## Para que serve o eureka-server?
- Ele é o microsserviço responsável pelo registro dos demais microsserviços, ele é quem sabe quais microsserviços podem ser acessiveis.
Podemos chamar ele de Discovery Server.

## Para que serve o gateway-server?
- Ele é o microsserviço responsável por fazer nosso proxy, ou seja, ele é nossa porta de entrada para receber as requisições e delegar aos microsserviços corretamente.
Ela também faz o papel de load balance, encaminhando de forma balanceada as requisições para os microsserviços registrados no Discovery Service. Podemos chamar ele também de GateWay.
