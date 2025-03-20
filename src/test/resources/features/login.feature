Feature: Login no SauceDemo

  @LoginTest
  Scenario: Login com sucesso
    Given que estou na página de login
    When insiro usuário "standard_user" e senha "secret_sauce"
    And clico no botão de login
    Then sou redirecionado para a página de produtos
