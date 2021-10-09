package com.example.restassured;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

@Test
public class RestAssuredTests {
    @Test(testName = "GET - GET USER BY ID")
    void getUserTest()  {
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://reqres.in/api/users/2")
                .then()
                .extract()
                .response();

        System.out.println(response.getBody().prettyPrint());
        Assert.assertEquals(200,response.statusCode());
        Assert.assertEquals("Janet", response.jsonPath().getString("data.first_name"));
        Assert.assertEquals("Weaver", response.jsonPath().getString("data.last_name"));
    }


    @Test(testName = "POST - CREATE USER")
    void postUserCreationTest() {
        JSONObject request = new JSONObject();
        request.put("job","leader");
        request.put("name", "morpheus");

        Response response = given()
                .body(request.toJSONString())
                .contentType(ContentType.JSON)
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .extract()
                .response();

        System.out.println(response.getBody().prettyPrint());
        Assert.assertEquals(201,response.statusCode());
        Assert.assertEquals("leader", response.jsonPath().getString("job"));
        Assert.assertEquals("morpheus", response.jsonPath().getString("name"));
        Assert.assertNotNull(response.jsonPath().getString("id"));
        Assert.assertNotNull(response.jsonPath().getString("createdAt"));

    }

}


