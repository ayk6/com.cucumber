Feature: US1010 print web table col

  @guruPrac
  Scenario Outline:TestCase13 col to list
    Given "guruUrl" page
    And print "<requestedHeading>" col values
    Then close page

    Examples:
      | guruUrl |
      | Company |