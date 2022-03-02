Feature: Learn Cucumber
  As as Student
  I want to learn Cucumber
  So I will be able to automatize acceptance criteria

  Scenario: Must execute the spec
    Given a file is correctly created
    When it is ran
    Then the spec must finish with success

  Scenario: Increment count value
    Given count value is 15
    When we increment count value in 5
    Then count value will be 20

  Scenario: will calculate the new delivery date
    Given delivery is for 05/04/2022
    When delivery delays 2 "days"
    Then delivery will be in 07/04/2022

  Scenario: will calculate China's delivery delay
    Given delivery is for 05/04/2022
    When delivery delays 2 "months"
    Then delivery will be in 05/06/2022

  Scenario: must create generict step for the given ones
    Given ticket number is AF345
    And the ticket value is R$ 230,45
    And passenger name is "Fulano de Tal"
    And passenger phone number is 9999-9999
    When create steps
    Then test gonna work

  Scenario: must deny the previous steps
    Given ticket number is AB167
    And especial ticket number is AB167
    And the ticket value is R$ 1120,23
    And passenger name is "Cicrano de Oliveira"
    And passenger phone number is 9888-8888

  Scenario: must deny the previous steps
    Given ticket number is CD123
    And ticket number is AG1234
    And the ticket value is R$ 11345,56
    And passenger name is "Beltrano Souza Matos de Alcântara Azevedo"
    And passenger phone number is 1234-5678
    And passenger phone number is 999-2223

