package Learning_DEMO;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class LocalAPI_test {
    @Test
    public void get_api() {
        RestAssured.baseURI = "http://localhost:3000/";
        RestAssured.given().get("users").then().statusCode(200).log().all();
    }
    @Test
    public void post_api()
    {
        JSONObject request = new JSONObject();
       // request.put("id","5973782bdb9a930533b05cb2");
        request.put("isActive","false");
        request.put("age","67");
        request.put("balance","$0.0");
        RestAssured.baseURI="http://localhost:3000/";
        RestAssured.given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                post("users").
                then().statusCode(201).log().all();
    }
    @Test
    public void put_api()
    {
        JSONObject request = new JSONObject();
        request.put("isActive","true");
        request.put("age","31");
        request.put("balance","$1,000,000.0");
        RestAssured.baseURI="http://localhost:3000/";
        RestAssured.given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                put("users/IKGiT7I").
                then().statusCode(200).log().all();
    }
    @Test
    public void patch_api()
    {
        JSONObject request = new JSONObject();
        request.put("balance","$10,000.0");
        RestAssured.baseURI="http://localhost:3000/";
        RestAssured.given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                patch("users/IKGiT7I").
                then().statusCode(200).log().all();
    }
    @Test
    public void delete_api()
    {
        RestAssured.baseURI="http://localhost:3000/";
        RestAssured.given().
                delete("users/IKGiT7I").
                then().statusCode(200).log().all();
    }
}
