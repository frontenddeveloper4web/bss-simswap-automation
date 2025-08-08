package tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class SIMSwapAPITest {

    // Base URL for your mock server
    private static final String BASE_URL = "http://localhost:3000";

    @Test
    public void testCreateSIMSwap_Success() {
        // Step 1: Define the request body (JSON)
        String requestBody = "{\n" +
                "  \"userId\": 1,\n" +
                "  \"oldIccid\": \"8923400000000000001\",\n" +
                "  \"status\": \"submitted\",\n" +
                "  \"timestamp\": \"2025-04-05T10:00:00Z\"\n" +
                "}";

        // Step 2: Send POST request
        Response response = given()
                .baseUri(BASE_URL)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/sim_swaps")
                .then()
                .statusCode(201)  // JSON Server returns 201 for created
                .extract()
                .response();

        // Step 3: Print response (for debugging)
        System.out.println("Response: " + response.asString());

        // Step 4: Extract ID and verify it was created
        int createdId = response.jsonPath().getInt("id");
        Assert.assertTrue(createdId > 0, "SIM Swap was not created");
    }

    @Test
    public void testGetAllSIMSwaps() {
        // Verify all SIM swaps
        given()
                .baseUri(BASE_URL)
                .when()
                .get("/sim_swaps")
                .then()
                .statusCode(200)
                .log().body();  // Print the body
    }
}