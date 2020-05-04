Feature: Test Doctors API Functionality

  @vivyApi
  Scenario: Fetch unique doctros recrod using lastKey
    Given User makes API Requests to doctors api
    When  User makes  API Requests to doctors ap with lastKey
    Then  User should see uniqe records compare to previous results





