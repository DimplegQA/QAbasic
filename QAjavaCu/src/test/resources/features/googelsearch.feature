Feature: feature to test google search funtionality

  Scenario: validatie google search is working
    Given browser is open
    And user is on google page
    When user enter a text in search box
    Then user can navigate realted result
