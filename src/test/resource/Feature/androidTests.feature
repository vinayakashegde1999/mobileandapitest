Feature: Select date in Android Apps

  @vivyApp
  Scenario: Select date
    Given User Enters Wrong Credentials
    Then  User selects remainder permission
    When  User Enters correct Credentials
    Then  User sees the OTP Screen
    When  User submits the OTP
    Then  User Successfully Signed in on the APP





