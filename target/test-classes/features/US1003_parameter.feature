Feature: US1003 searching with parameter

  @parameter
  Scenario: TestCase06 amazon search with parameter
    Given amazon main page
    And search "mandosi"
    And test results contains "mandosi"
    Then close page