Feature: Select date in Andoid Apps

  @vivyMobile
  Scenario :Select date
    Given User Enters Wrong Credentials
    Then  User selects remainder permission
    When  User Enters correct Credentials
    Then  User sees the OTP Screen
    When  User submits the OTP
    Then  User Successfully Signed in on the APP


#  Date format in DD/MM/YYYY
#Then User sees the selected date
#  //23/24/26/28/29



# Email by ID:  email
#  Pass word by Id:password
# Sign in bytton by ID : login_fragment_sign_in_button

#  reaminder consent  by id : reminders_permissions_allow

  PIN eu.uvita:id/inputPIN
  eu.uvita:id/button_confirm
  eu.uvita:id/button_confirm




