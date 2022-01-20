package Learning_DEMO;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import  io.restassured.module.jsv.JsonSchemaValidator;

public class Json_validitor {
    @Test
    public void get_api() {
        RestAssured.baseURI = "http://localhost:3000/";
        RestAssured.given().get("users").then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json")).
                statusCode(200).log().all();
    }
}
