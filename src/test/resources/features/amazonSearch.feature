Feature: Amazon Search

  Scenario: T01 search in amazon
    Given amazon main page
    Then search mandosi
    And test results contains mandosi
    And close page

  Scenario:
    Given amazon main page
    Then search glass
    And test results contains glass
    And close page
