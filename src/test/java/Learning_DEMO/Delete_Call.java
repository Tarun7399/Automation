package Learning_DEMO;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Delete_Call {
    @Test
    public void Delete_API(){
        RestAssured.baseURI="https://reqres.in/";
        RestAssured.given().delete("api/users/2").then().statusCode(204).log().all();
    }
}
