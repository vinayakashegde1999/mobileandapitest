package stepdefs;

import ApplicationPages.SigninPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInStepdef {
    private SigninPage signIn;
    public SignInStepdef(){
        this.signIn = new SigninPage();
    }

    @Given("^User Enters Wrong Credentials$")
    public void user_enters_wrong_credentials() throws InterruptedException {
        signIn.enterWrongCredentails();

    }

    @When("^User selects remainder permission$")
    public void user_selects_remainder(){
        signIn.clickRemainder();

    }

    @When("^User Enters correct Credentials$")
    public void user_enters_crorrect_credentials(){
        signIn.validCredentials();

    }

    @When("^User sees the OTP Screen$")
    public void userSeesOTP(){
        signIn.verifyOTPScreen();

    }

    @Then("^User submits the OTP$")
    public void userentersOTP(){
        signIn.enterOTP();

    }

    @Then("^User Successfully Signed in on the APP$")
    public void verifyuserSignedIn() throws InterruptedException {
        signIn.verifyUserSignedIn();

    }



}
