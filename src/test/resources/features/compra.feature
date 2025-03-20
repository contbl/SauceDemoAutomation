Feature: Compra de produto

  Scenario: Comprar um produto com sucesso
    Given que estou na página de login
    When insiro usuário "standard_user" e senha "secret_sauce"
    And clico no botão de login
    And adiciono o produto "Sauce Labs Backpack" ao carrinho
    And acesso o carrinho de compras
    And confirmo a compra
    And preencho os dados de envio com nome "Rafael", sobrenome "QA" e CEP "12345-678"
    And finalizo a compra
    Then vejo a mensagem de confirmação "Thank you for your order!"
