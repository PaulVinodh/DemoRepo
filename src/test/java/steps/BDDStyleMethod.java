package steps;

import io.restassured.http.ContentType;
import org.hamcrest.core.Is;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.keyStore;

public class BDDStyleMethod {
    String Name="Karthik";
    public static void SimpleGETPost(String postNumber){
        String s;
        given().contentType(ContentType.JSON).when().get(String.format("http://localhost:3000/posts/%s",postNumber));
    }
}

