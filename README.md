# mobileandapitest

Automate Android and Api Tests with Cucumber BDD
    
    This Repository contains Source code to automae Vivy APP and Doctor API's
  
#### Mobile Automation   
    Android tests are  ran with Oneplus 6T Device with Android version 10 
    SMS Part handled with navigating to Notifaction panel and extract sms response
    UI Obejct and project dependencies are abstracted with Properties file and Constant class
    
    Assumpution:
    Launch application with Sign page 
    Stop Signin functionality by detecting Sign key button post OTP
    This test will give sucess result only with real device Emulators wont work as this will check for SMS on the same device
    
    Bugs:
    App crashing  if Appium try to enter the correct credentials and accepts the permission page.
    Scenario only pass if we ran first invalid sign in attempt and then try positive scenario.
    
   
### API Automation 
     
     API testing performed with RestAssured library 
     Assumpution:
     Restricted to two subsequesnt request responses,
     Assumed each doctor will have unique ID's hence conidered for check duplicates based on ID's
          
    


##### Folder Structure and Usage


        .
        ├── README.md                //Information About project
        ├── mobileandapitest.iml     / Dependency management and appliction configuration where main execution controlled
        ├── pom.xml       // This project uses testNg for execution as runner config , realted configuration can be seen here 
        ├── src
        │   ├── main
        │   │   ├── java
        │   │   │   └── webconnector
        │   │   │       └── WebConnector.java  // This is the main class for Driver initialization for  android  ios or API tests  
        │   │   └── resources
        │   └── test
        │       ├── config
        │       │   └── application.properties   //  This file holds necessary configuration for driver infomraion like capabilities and app paths also  use for storing test data
        │       ├── java
        │       │   ├── ApplicationPages
        │       │   │   └── SigninPage.java    // This package holds UI properties and implementaion logic
        │       │   ├── ConstantVariables  // This  packages holds constans to be used in Test suits
        │       │   │   └── Constant.java  // This class holds  page objects and Driver related constants like waits and Android and API Base URL's
        │       │   ├── helper
        │       │   │   ├── apiSteps.java  // This class holds Common methods for API Tests
        │       │   │   └── helper.java 
        │       │   ├── runner
        │       │   │   ├── AbstractTestNGCucumberParallelTests.java  // This will be helpfull if we need to run in parallel mode with testng 
        │       │   │   └── Default.java   // This is main class for Cucumber and cucuber settigns 
        │       │   └── stepdefs
        │       │       ├── ApiStepdef.java  // Setp definition for Android Tests
        │       │       ├── BaseClass.java  // THis holds Cucumber @After and @Before Anotaiton responsible for starting Appium sessions for resepectve tests 
        │       │       └── SignInStepdef.java
        │       └── resource
        │           ├── Feature
        │           │   ├── androidTests.feature     // Android BDD Tests
        │           │   └── apiTest.feature          // API BDD Tests
        │           └── images



#### To Run Android Tests
     Build the App in Android Studio
     Provide the  path  to App or necessary changes  in     src/test/config/application.properties ->  androidApp 
     To Execute tests  run the below command in project root 
     mvn clean install test -DdeviceType=android  -Dcucumber.options="--tags '@vivyApp'" -Dusername="urusername" -DPassword="yourpassword"
     
 

#### To Run Api tests
     Make necessary changes  in     src/test/config/application.properties ->  androidApp 
         To Execute tests  run the below command in project root 
         mvn clean install test -DdeviceType=api  -Dcucumber.options="--tags '@vivyApi'"
 
 
 
