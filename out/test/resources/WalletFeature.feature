Feature: Iniciar Wallet-account-creator
  Scenario: crear cuenta y crear un income
    Given pagina_creador_decuentas-crear-cuenta
    Then click-crear-income
    Then entrar-crear-income-en-cuenta
