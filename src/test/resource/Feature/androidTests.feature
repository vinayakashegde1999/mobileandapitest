Feature: Signin to  Vivy App

  @vivyApp
  Scenario: Test Signin in Functionality

    Given User Enters Wrong Credentials
    Then  User selects remainder permission
    When  User Enters correct Credentials
    Then  User sees the OTP Screen
    When  User submits the OTP
    Then  User Successfully Signed in on the APP





