package com.camping.tests.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

import static com.camping.tests.context.TestContext.ADMIN_BASE_URL;
import static com.camping.tests.context.TestContext.KIOSK_BASE_URL;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings("NonAsciiCharacters")
public class KioskE2ESteps {

    private String authToken;
    private Response lastResponse;


    @When("키오스크 서비스에서 상품 목록 조회를 호출하면")
    public void 키오스크_서비스에서_상품_목록_조회를_호출하면() {
        this.lastResponse = given()
                .cookie("AUTH_TOKEN", this.authToken)
        .when()
                .get(KIOSK_BASE_URL + "/api/products")
        .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .extract().response();
    }

    @Then("상품이 조회된다")
    public void 상품이_조회된다(int expectedMinCount) {
        int actualCount = this.lastResponse.jsonPath().getList("$").size();

        assertThat(actualCount).isGreaterThanOrEqualTo(expectedMinCount);
    }
}
