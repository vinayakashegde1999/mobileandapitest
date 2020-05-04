package runner;

import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//@RunWith(Cucumber.class)
@CucumberOptions(glue = {"stepdefs"}, plugin = {"html:target/cucumber-reports/cucumber-pretty",  "json:target/json-cucumber-reports/default/cukejson.json",
        "testng:target/testng-cucumber-reports/cuketestng.xml" }, features = {"src/test/resource/Feature"})
public class Default extends AbstractTestNGCucumberParallelTests{
        private static long duration;

        @BeforeClass
        public static void before() {
            duration = System.currentTimeMillis();
            System.out.println("Thread Id  | Scenario Num       | Step Count");
        }

        @AfterClass
        public static void after() {
            duration = System.currentTimeMillis() - duration;
            System.out.println("DURATION - "+ duration);
        }
    }

