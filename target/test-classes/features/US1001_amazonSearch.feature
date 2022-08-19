@all
Feature: US1001 Amazon Search

  @test01 @twoTests
  Scenario: T01 search in amazon
    Given amazon main page
    Then search mandosi
    And test results contains mandosi
    And close page

  @test02 @twoTests
  Scenario:
    Given amazon main page
    Then search glass
    And test results contains glass
    And close page
