@SeuBarriga
Feature: Insert an account
  As an user
  I want to add an account
  So I'll be able to distribute my money in an efficient way

  Scenario: must add an account with success
    Given the user is accessing the application
    And inserts the username "st@st.com"
    And inserts the password "123456"
    And logs-in
    And main page is loaded
    When select option "Contas"
    And select option "Adicionar"
    And insert the account name "Test Account"
    And save the account
    Then the account is saved successfully

  Scenario: cannot save account without a name
    Given the user is accessing the application
    And inserts the username "st@st.com"
    And inserts the password "123456"
    And logs-in
    And main page is loaded
    And select option "Contas"
    And select option "Adicionar"
    When save the account
    Then the account is not saved with message error "Informe o nome da conta"

  Scenario: cannot save account without a name
    Given the user is accessing the application
    And inserts the username "st@st.com"
    And inserts the password "123456"
    And logs-in
    And main page is loaded
    And select option "Contas"
    And select option "Adicionar"
    And insert the account name "Test Account"
    When save the account
    Then the account is not saved with message error "Já existe uma conta com esse nome!"




