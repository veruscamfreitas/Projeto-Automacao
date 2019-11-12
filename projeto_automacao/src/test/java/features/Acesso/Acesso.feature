@CentroDeTecnologia
Feature: Acesso
  Framework de Automação de Testes

  @First @Scenario
  Scenario: 01_Produto no carrinho
    Given que acesso a página automationpractice
    And clico em Add to cart no produto escolhido
    When clico em Proceed to checkout
    Then clico em Proceed to checkout em shopping-cart summary
  
  @Scenario  
  Scenario: 02_Realizar cadastro
    Given que insiro o email para cadastro "teste@teste.com"
    Then clico em Create an account
    
  @Scenario  
  Scenario: 03_Pagina de cadastro
  	Given que valido pagina de cadastro
  	When seleciono Mrs
  	And insiro o nome "Testando"
  	And insiro o sobrenome "Teste"
  	And insiro a senha "123456"
  	And seleciono o dia de aniversario
  	And insiro o dia
  	And seleciono o mes do aniversario
  	And insiro o mes
  	And seleciono o ano de nascimento
  	And insiro o ano
  	And insiro o nome "Testando"
  	And insiro o sobrenome "Teste"
  	And insiro o endereço "rua xxxxxxx"
  	And insiro a cidade "Cidade"
  	And seleciono o estado
  	And clico no estado
  	And insiro o CEP "06502"
  	And seleciono o pais
  	And insiro o pais
  	And insiro o telefone celular "dd 999999999"
  	And informo um endereco alternativo "yyyyyyyyy"
  	Then clico em register
  	
  @Scenario  
  Scenario: 04_Validando o endereço
    Given clico em Proceed to checkout em Address
    
  @Scenario  
  Scenario: 05_Validando o frete
  	Given selecionar termos de uso
    Then clico em Proceed to checkout no Shippig 
    
  @Scenario  
  Scenario: 05_Finalizar compra
  	Given selecionar Pay by Check
  	Then clicar em I confirm my order
    
    
  	
  	 
  	
  	
    
    
    
    
  	
  	
  @Last
  Scenario: 01_Verificar se o sistema irá apresentar o vídeo tutorial para recuperação de senha
    Given avalio pagina de cadastro