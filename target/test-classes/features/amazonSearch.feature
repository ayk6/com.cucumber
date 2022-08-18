Feature: Amazon Search

  Scenario: TestCase01 search in amazon

    Given amazon main page
    Then search mandosi
    And test results contains mandosi
    And close page
