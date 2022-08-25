Feature: US1011 register

  @registerAuto
  Scenario: TestCase15 valid data register
    Given "automationUrl" page
    And click sign in
    And send email on create an account
    And click create an account
    And send user data
    And click register
    And verify creating account
    Then close page