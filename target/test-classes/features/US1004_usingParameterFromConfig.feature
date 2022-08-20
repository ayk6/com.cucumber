Feature: US1004 using parameter from config file

  @config
  Scenario: TC07 using parameter config properties

    Given "amazonUrl" page
    Then wait 3 seconds
    And test page contains "amazon"
    Then close page