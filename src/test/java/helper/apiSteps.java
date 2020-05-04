package helper;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;
import webconnector.WebConnector;

import java.io.IOException;
import java.util.*;
import static io.restassured.RestAssured.given;

public class apiSteps {

    private Response doctorResponse;
    private Response doctorResponseWithKey;
    private String lastKey ;
    WebConnector wc = new WebConnector();

//    public void sortV() throws IOException {
//        Response res=given(). when().get(wc.getProperty().getProperty("vivyAPIBaseURL")+"/doctors.json");
//        System.out.println(res.getBody().asString());
//        JsonPath jsonPathEvaluator = res.jsonPath();
//          lastKey = jsonPathEvaluator.get("lastKey");
//        Response res2=given(). when().get(wc.getProperty().getProperty("vivyAPIBaseURL")+"/doctors-"+lastKey+".json");
//        System.out.println(res2.getBody().asString());
//
//
//
//
//    }

    <T> boolean hasDuplicate(List<T> list1, List<T> list2) {
        for (T item : list1) {
            if (list2.contains(item)) return true;
        }
        return false;
    }


    public void makeRequestendPoint() {
        doctorResponse=given(). when().get(wc.getProperty().getProperty("vivyAPIBaseURL")+"/doctors.json");
        JsonPath jsonPathEvaluator = doctorResponse.jsonPath();
         lastKey = jsonPathEvaluator.get("lastKey");
       // System.out.println("First response:"+doctorResponse.getBody().asString());
    }

    public void makeRequestendPointwithApiKey() {
        doctorResponseWithKey= given(). when().get(wc.getProperty().getProperty("vivyAPIBaseURL")+"/doctors-"+lastKey+".json");
       // System.out.println("Second  response:"+doctorResponseWithKey.getBody().asString());
    }

    public void validateBothResponse() {
        List<String> doctorList1=doctorResponse.jsonPath().getList("doctors.id");
        List<String> doctorList2=doctorResponseWithKey.jsonPath().getList("doctors.id");
        Collections.sort(doctorList1);
        Collections.sort(doctorList2);
        Assert.assertFalse(hasDuplicate(doctorList1,doctorList2));
    }
}
