Feature: US1005 hotelmycamp positive login

  @hmc
  Scenario: TestCase08 positive login test

    Given "hmcUrl" page
    Then click login
    And send valid username
    And send valid password
    And click login button
    Then check logging in
    And close page
