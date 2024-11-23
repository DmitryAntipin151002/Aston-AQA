package org.example;

import org.junit.Test;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class ResponsesTest {
    static String baseUri = "https://postman-echo.com";
    static String rawBody = "This is expected to be sent back as part of response body.";

    @Test
    public void getTest() {
        Response response = given().baseUri(baseUri)
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when().get("/get")
                .then().assertThat().statusCode(200)
                .header("Content-Type", "application/json; charset=utf-8")
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .time(lessThan(5000L))
                .extract().response();
    }

    @Test
    public void postRawTextTest() {
        String jsonBody = "{\n    \"test\": \"value\"\n}";

        Response response = given().baseUri(baseUri)
                .body(jsonBody)
                .with().post("/post")
                .then().assertThat().statusCode(200)
                .header("Content-Type", "application/json; charset=utf-8")
                .body("data", equalTo("{\n    \"test\": \"value\"\n}"))
                .time(lessThan(5000L))
                .extract().response();
    }

    @Test
    public void postFormDataTest() {
        Response response = given().baseUri(baseUri)
                .header("Content-Type", "application/x-www-form-urlencoded; charset=utf-8")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .with().post("/post")
                .then().assertThat().statusCode(200)
                .header("Content-Type", "application/json; charset=utf-8")
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"))
                .time(lessThan(5000L))
                .extract().response();
    }

    @Test
    public void putTest() {
        Response response = given().baseUri(baseUri)
                .body(rawBody)
                .with().put("/put")
                .then().assertThat().statusCode(200)
                .header("Content-Type", "application/json; charset=utf-8")
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .time(lessThan(5000L))
                .extract().response();
    }

    @Test
    public void patchTest() {
        Response response = given().baseUri(baseUri)
                .body(rawBody)
                .with().patch("/patch")
                .then().assertThat().statusCode(200)
                .header("Content-Type", "application/json; charset=utf-8")
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .time(lessThan(5000L))
                .extract().response();
    }

    @Test
    public void deleteTest() {
        Response response = given().baseUri(baseUri)
                .body(rawBody)
                .with().delete("/delete")
                .then().assertThat().statusCode(200)
                .header("Content-Type", "application/json; charset=utf-8")
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .time(lessThan(5000L))
                .extract().response();
    }
}
