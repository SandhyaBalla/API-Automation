package tests;


	import org.testng.annotations.Test;
	import io.restassured.RestAssured;
	import io.restassured.response.Response;
	

	import static io.restassured.RestAssured.given;

import org.testng.Assert;

import org.testng.annotations.Test;


	public class Creation_Of_Template {

	    private static String payload = "{\n"
	    		+ "    \"template\": \"हाय मेरा नाम {{source.entities[0].emailId}} है\",\n"
	    		+ "    \"sampleData\": {},\n"
	    		+ "    \"status\": true,\n"
	    		+ "    \"deleted\": false,\n"
	    		+ "    \"createdAt\": 1649514017134,\n"
	    		+ "    \"updatedAt\": 1649514017134,\n"
	    		+ "    \"name\": \"Instagram\",\n"
	    		+ "    \"tags\": [\n"
	    		+ "        \"gmail\",\n"
	    		+ "        \"hotmail\",\n"
	    		+ "        \"instagram\",\n"
	    		+ "        \"email\"\n"
	    		+ "    ],\n"
	    		+ "    \"thumbnail\": \"5ce6b93d-6446-4507-a9b9-b731491c779e\",\n"
	    		+ "    \"transactionId\": \"6cd4fa3a-055b-4438-8296-4aa234ea1136\",\n"
	    		+ "    \"additionalProperties\": {}\n"
	    		+ "}";
//  @BeforeAll
//	    public static void setup() {
//	        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
//	    }

	    @Test
	   
//	        Response response = given()
//	                .header("Content-type", "application/json")
//	                .and()
//	                .body(requestBody)
//	                .when()
//	                .post("https://ingress-gateway.gaiansolutions.com/template-service/v1.0/admin/admin/templates")
//	                .then()
//	                .extract().response();
//	        System.out.println("Response body is" + requestBody.toString());
//
//	        Assert.assertEquals(201, response.statusCode());
//	        Assert.assertEquals("foo", response.jsonPath().getString("title"));
//	        Assert.assertEquals("bar", response.jsonPath().getString("body"));
//	        Assert.assertEquals("1", response.jsonPath().getString("userId"));
//	        Assert.assertEquals("101", response.jsonPath().getString("id"));
	    public void postRequest() {
	    Response postResponse=given()
	    .auth().none()
	    .header("Content-Type", "application/json")
	    .when()
	    .body(payload)
	    .post("https://ingress-gateway.gaiansolutions.com/template-service/v1.0/admin/admin/templates");
	    
	    System.out.println("Post Response is" + postResponse.asPrettyString());
	    Assert.assertEquals(201, postResponse.statusCode());
	    }
	}

