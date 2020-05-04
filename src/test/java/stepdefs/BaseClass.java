package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import webconnector.WebConnector;

import java.net.MalformedURLException;


public class BaseClass extends WebConnector {
    public static String featureName;

    @Before
    public void before(Scenario scenario) throws MalformedURLException {
//String featureName =
        setUpDriver();
    }

    @After
    public void aftertest() {
        tearDown();
    }

}
