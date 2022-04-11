Feature: This feature would be create a calculator for add and substract

  Scenario: To Add
    Given I have a calculator
    When The values 25 and 25 are added
    Then I should get the result as 50

  Scenario: To Sub
    Given I have a calculator
    When The values 25 and 20 are substracted
    Then I should get the result as 5

  Scenario Outline: To Add two numbers using scenario outline
    Given I have a calculator
    When The values <num1> and <num2> are added
    Then I should get the result as <result>

    Examples: 
      | num1 | num2 | result |
      |   20 |   20 |     40 |
      |    5 |    3 |      8 |

  Scenario: Add multiple numbers using cucumber data table
    Given I have a calculator
    When I add below numbers
      | 4 |
      | 5 |
      | 7 |
      | 8 |
    Then I should get the result as 24

  Scenario: Add multiple numbers using cucumber data table
    Given I have a calculator
    When I add below numbers using List
      |  4 |
      |  5 |
      |  7 |
      |  8 |
      | 10 |
    Then I should get the result as 34

  Scenario: To calculate the total bill of the order
    Given I have a calculator
    When I order below items
      | coffee | 23 |
      | tea    | 27 |
      | burger | 50 |
    Then I should get the result as 100

  Scenario: To calculate the total bill of the order using quantity
    Given I have a calculator
    When I order below items and quantity
      | coffee | 1 | 23 |
      | tea    | 2 | 27 |
      | burger | 3 | 50 |
    Then I should get the result as 227
