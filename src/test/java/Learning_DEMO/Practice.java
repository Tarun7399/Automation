package Learning_DEMO;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice
{
    @Test
    public void practice() {
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.asString());
        System.out.println(response.getBody());
        System.out.println(response); // it point to address where response is stored
        Assert.assertEquals( response.getStatusCode(),200);
    }
}
