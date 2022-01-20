package Learning_DEMO;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class patch_Call {
        @Test
        public void Patch_Api(){
            JSONObject request = new JSONObject();
            request.put("name","morpheus");
            request.put("job","zion resident");
            RestAssured.baseURI = "https://reqres.in/";
            RestAssured restAssured = new RestAssured();
            restAssured.given().
                    header("Content-Type","application/Json").
                    contentType(ContentType.JSON).
                    body(request.toJSONString()).
                    patch("api/users/2").
                    then().
                    statusCode(200).
                    log().all();
        }
}
