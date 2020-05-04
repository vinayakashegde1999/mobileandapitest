package stepdefs;

import ApplicationPages.SigninPage;
import helper.apiSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApiStepdef {
    private apiSteps apiStep;
    public ApiStepdef(){
        this.apiStep = new apiSteps();
    }

    @Given("^User makes API Requests to doctors api$")
    public void user_makesAPIRequest() throws InterruptedException {

        apiStep.makeRequestendPoint();
    }

    @Given("^User makes  API Requests to doctors ap with lastKey$")
    public void user_makesAPIRequest_with_lastKey() throws InterruptedException {
        apiStep.makeRequestendPointwithApiKey();

    }

    @Given("^User should see uniqe records compare to previous results$")
    public void user_verifyRecords() throws InterruptedException {
        apiStep.validateBothResponse();

    }




}
