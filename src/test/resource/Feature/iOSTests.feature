Feature: Select date in IOS Apps

  @IosdatePicker
  Scenario Outline:Select date
    Given User select date on ios app <date>
#    Then  User check for the <date>
    Examples:
      |date          |
      |23/03/2020    |
      |24/04/2020    |
      |26/05/2020    |
      |28/12/2020    |
      |28/07/2020    |