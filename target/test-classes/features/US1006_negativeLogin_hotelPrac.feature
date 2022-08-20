Feature: US1006 hotelmycamp negative login

  @hmc2
  Scenario: TestCase09 negative login test

    Given "hmcUrl" page
    Then click login
    And send wrong username
    And send wrong password
    And click login button
    Then check failed logging in
    And close page