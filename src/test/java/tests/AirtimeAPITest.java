package tests;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class AirtimeAPITest {

    private static final String BASE_URL = "http://localhost:3000";

    @Test
    public void testCheckBalance_Success() {
        given()
            .baseUri(BASE_URL)
            .param("msisdn", "08012345678")
        .when()
            .get("/balance")
        .then()
            .statusCode(200)
            .body("balance", equalTo(500))
            .log().body();
    }

    @Test
    public void testBuyAirtime_ValidRequest() {
        String payload = """
            {
                "msisdn": "08012345678",
                "amount": 100,
                "service": "airtime"
            }
            """;

        given()
            .baseUri(BASE_URL)
            .contentType(ContentType.JSON)
            .body(payload)
        .when()
            .post("/airtime")
        .then()
            .statusCode(201)
            .body("status", equalTo("success"))
            .log().body();
    }

    @Test
    public void testGetTransactionHistory() {
        given()
            .baseUri(BASE_URL)
            .param("msisdn", "08012345678")
        .when()
            .get("/transactions")
        .then()
            .statusCode(200)
            .body("size()", greaterThan(0))
            .body("[0].amount", equalTo(100));
    }
}