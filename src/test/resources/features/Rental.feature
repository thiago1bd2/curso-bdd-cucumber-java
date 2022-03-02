Feature: Video and Movie Rental Company
  As an user, I want to register movies for rent, then I can control rental dates and prices

  Scenario: Successfully rent a movie
    Given a movie has a stock of 2 unities
    And the rental price is R$ 3,00
    When rent
    Then the rental price will be R$ 3,00
    And the return date will be the next day

    Scenario: Cannot rent movie with 0 unities in stock
      Given a movie has a stock of 0 unities
      When rent
      Then will not be possible due to depletion of stock
      And stock will have 0 unities

      Scenario: Must give special condition for extend category
        Given a movie has a stock of 2 unities
        And the rental price will be R$ 4,00
        And the rental category will be extended
        When rent
        Then the rental price will be R$ 8,00
        And the return date will be in 3 days
        And will receive 2 points