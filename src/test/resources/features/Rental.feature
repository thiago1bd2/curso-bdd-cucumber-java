@Rental
Feature: Rent a movie
  As an user, I want to register movies for rent, then I can control rental dates and prices

  @Done
  Scenario: Successfully rent a movie
    Given a movie has a stock of 2 unities
    And the rental price is R$ 3
    When rent
    Then the rental price will be R$ 3
    And the return date will be the next day

  @Done
  Scenario: Cannot rent movie with 0 unities in stock
    Given a movie has a stock of 0 unities
    When rent
    Then will not be possible due to depletion of stock
    And stock will have 0 unities

  @Done
  Scenario: Must give special condition for extend category
    Given a movie has a stock of 2 unities
    And the rental price is R$ 4
    And the rental category will be extended
    When rent
    Then the rental price will be R$ 8
    And the return date will be in 3 days
    And will receive 2 points

    Scenario: Rent a movie using the standard rental category
      Given a movie has a stock of 2 unities
      And the rental price is R$ 4
      And the rental category will be standard
      When rent
      Then the rental price will be R$ 4
      And the return date will be the next day
      And will receive 1 points