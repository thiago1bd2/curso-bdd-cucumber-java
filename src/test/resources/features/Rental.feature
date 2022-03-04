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

  @Done
  Scenario: Rent a movie using the standard rental category
    Given a movie has a stock of 2 unities
    And the rental price is R$ 4
    And the rental category will be standard
    When rent
    Then the rental price will be R$ 4
    And the return date will be the next day
    And will receive 1 points

    # Scenario outline example
  @Done
  Scenario Outline: Renting a movie
    Given a movie has a stock of <quantity> unities
    And the rental price is R$ <rentalPrice>
    And the rental category will be <category>
    When rent
    Then the rental price will be R$ <rentalTotal>
    And the return date will be in <days> days
    And will receive <points> points

    Examples:
      | quantity | rentalPrice | category | rentalTotal | days | points |
      | 2        | 2           | standard | 2           | 1    | 1      |
      | 2        | 2           | extended | 4           | 3    | 2      |
      | 3        | 5           | weekly   | 15          | 7    | 3      |

    # DataTable example
  @Done
  Scenario: Successfully rent a movie - DataTable
    Given a movie
      | stock    | 2        |
      | price    | 3        |
      | category | extended |
    When rent
    Then the rental price will be R$ 6
    And the return date will be in 3 days