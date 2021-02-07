package org.acme;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;

@QuarkusTest
public class FraminghamTest {

    @Test
    public void testFramingham() {
        given()
            .contentType(ContentType.JSON)
            .accept(ContentType.JSON)
            .body("{\r\n    \"Age\": 53,\r\n    \"Sex\": \"Men\",\r\n    \"Smoker?\": false,\r\n    \"Systolic blood pressure\": 125,\r\n    \"On SBP treatment?\": true,\r\n    \"Total Cholesterol\": 161,\r\n    \"HDL Cholesterol\": 55,\r\n    \"Diabetic?\": true\r\n}")
        .when()
            .post("/framingham")
        .then()
            .statusCode(200)
            .body("'Framingham score'", is(13))
            .body("'CVD Risk'", is("15.6 %"))
            .body("'Heart age/vascular age'", is("64 y/o"));
    }
}