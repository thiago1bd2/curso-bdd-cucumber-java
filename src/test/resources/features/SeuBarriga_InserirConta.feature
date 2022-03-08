@SeuBarriga
Feature: Insert an account
  As an user
  I want to add an account
  So I'll be able to distribute my money in an efficient way

  Background:
    Given the user is accessing the application
    And inserts the username "st@st.com"
    And inserts the password "123456"
    And logs-in
    And main page is loaded
    And select option "Contas"
    And select option "Adicionar"

  Scenario: must add an account with success
    And insert the account name "Test Account"
    And save the account
    Then the account is saved successfully with message "Conta adicionada com sucesso!"

#  Scenario: cannot save account without a name
#    And insert the account name ""
#    When save the account
#    Then the account is not saved with message error "Informe o nome da conta"
#
#  Scenario: cannot an already registered account
#    And insert the account name "Conta mesmo nome"
#    When save the account
#    Then the account is not saved with message error "Já existe uma conta com esse nome!"

  Scenario Outline: trying to save account when
    And insert the account name "<account_name>"
    When save the account
    Then the account is not saved with message error "<error_message>"
    Examples:
      | account_name     | error_message                      |
      |                  | Informe o nome da conta            |
      | Conta mesmo nome | Já existe uma conta com esse nome! |




