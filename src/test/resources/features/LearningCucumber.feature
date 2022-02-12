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