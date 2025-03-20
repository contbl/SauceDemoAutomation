Feature: Logout no SauceDemo

Scenario: Logout do usuário
  Given que estou logado no sistema
  When clico no menu lateral
  And clico no botão de logout
  Then sou redirecionado para a página de login
