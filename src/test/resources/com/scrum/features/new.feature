
  @done
  Feature: Google search

  Scenario: Search on Google
    Given   User is on Google page
    When    User enters <text> in search field
    And     User clicks Search button
    Then    User clicks <result> link

    Examples:
      |text               |result              |
      |"Selenium Cucumber"|"Selenium-Cucumber" |
      |"Gherkin"          |"Gherkin"           |
      |"WebDriver"        |"Selenium WebDriver"|



