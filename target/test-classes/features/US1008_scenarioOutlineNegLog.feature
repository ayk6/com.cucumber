Feature: US1008 hotel failed logging

  Scenario Outline: TestCase11 wrong username and passw failed log

    Given "hmcUrl" page
    Then click login
    And send wrong username "<username>"
    And send wrong password "<password>"
    And click login button
    Then check failed logging in
    And close page
    Examples:

      | username | password |
      | manager5 | manager5! |
      | manager6 | manager6! |