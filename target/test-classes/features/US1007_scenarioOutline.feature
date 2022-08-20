# aynı sayfada birden fazla arama yapma


Feature: US1007 amazon multiple search

  @scOutline
  Scenario Outline: TestCase10 amazon multiple search
    Given "amazonUrl" page
    Then search "<requestedWord>"
    And test results contains "<requestedWord>"
    And close page

    Examples:
      | requestedWord |
      | mandosi       |
      | cimen         |
      | gym           |



