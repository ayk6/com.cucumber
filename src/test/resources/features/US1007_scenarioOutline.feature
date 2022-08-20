# aynı sayfada birden fazla arama yapma


Feature: US1007 amazon multiple search

  @scOutline
  Scenario Outline: TestCase10 amazon multiple search
    Given "amazonUrl" page
    Then search "<requestedWord>"
    And test results contains "<requestedWordControl>"
    And close page

    # aynı parametreler kullanılabilir
    # farklı kullanılmak istenirse sağa bir sütün açılır

    Examples:
      | requestedWord | requestedWordControl |
      | mandosi       | mandosi              |
      | cimen         | cimen                |
      | gym           | gym                  |



