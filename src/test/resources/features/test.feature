Feature: Exemplo de Teste de Integração

  @teste  @validado
  Scenario: Testar integração com CUCUMBER
    Given I have a string with value "hello"
    When I reverse the string
    Then the result should be "olleh"