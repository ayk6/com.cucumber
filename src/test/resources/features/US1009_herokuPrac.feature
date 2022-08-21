Feature: US1009 herokuapp prac

  @herokuPrac
  Scenario: TestCase12 herokuapp delete button prac
    Given "herokuappUrl" page
    And click element button
    Then wait delete button is displayed
    And test delete button is displayed
    Then click delete button
    And test telete button is not displayed
    And close page

    