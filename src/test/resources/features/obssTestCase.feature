Feature: UI AUtomation Test Case

  Scenario Outline: OBSS test Case
    Given open website with "<browser>"
    When Search text with "<text>"
    Then control footer


  Examples:
    |browser  |text              |
    |chrome   |Automation        |
