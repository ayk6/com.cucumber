Feature: US1012 reaching excel data

  Scenario: TestCase16 using excel data

    Given excel data is made available
    And print country whose capital is jakarta
    Then check country number is 190
    And check rows are 191
    Then print 3. row 2.col data