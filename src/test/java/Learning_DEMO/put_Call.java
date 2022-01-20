package Learning_DEMO;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class put_Call {
    @Test
    public void Put_Api(){
        JSONObject request = new JSONObject();
        request.put("name","morpheus");
        request.put("job","zion resident");
        String request_url = "https://reqres.in/api/users/2";
        RestAssured restAssured = new RestAssured();
        restAssured.given().
                header("Content-Type","application/Json").
                contentType(ContentType.JSON).
                body(request.toJSONString()).
                put(request_url).
                then().
                statusCode(200).
                log().all();
    }
}
