package Learning_DEMO;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;

public class Get_Call {
    @Test
    public void GET_API(){
        String request = "https://reqres.in/api/users?page=2";
        given().get(request).then().statusCode(200).body("data[1].id", equalTo(8));
        System.out.println(get(request).getBody().asString());
    }
}
