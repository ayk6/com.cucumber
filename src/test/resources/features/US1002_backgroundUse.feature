Feature: US1002 run common steps with background

  Background: common step
    Given amazon main page

    Scenario: TestCase04 amazon search mandosi
      And search mandosi
      Then test results contains mandosi
      Then close page

  Scenario: TestCase05 amazon search glass
    And search glass
    Then test results contains glass
    Then close page