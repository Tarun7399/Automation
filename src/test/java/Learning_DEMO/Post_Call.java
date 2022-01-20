package Learning_DEMO;

import io.restassured.RestAssured;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Post_Call {
    @Test
    public void PostApi(){
//        Map<String,Object> map = new HashMap<String, Object>();
//        map.put("name","morpheus");
//        map.put("job","leader");
//        System.out.println(map);
//        JSONObject request = new JSONObject(map);
//        System.out.println(request);
//        System.out.println(request.toJSONString());
        JSONObject request = new JSONObject();
        request.put("name","morpheus");
        request.put("job","leader");
        String request_url = "https://reqres.in/api/users";
        RestAssured restAssured = new RestAssured();
        restAssured.given().body(request.toJSONString()).post(request_url).then().statusCode(201).log().all();
    }
}