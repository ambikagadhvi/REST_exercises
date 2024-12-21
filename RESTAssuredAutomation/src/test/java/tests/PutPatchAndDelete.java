package tests;

import static io.restassured.RestAssured.baseURI;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

public class PutPatchAndDelete {

	@Test
	public void Put() {
		
		baseURI = "https://reqres.in/api";
		JSONObject obj = new JSONObject();
		
		obj.put( "job1", "Apple");
		obj.put( "job2", "SDET");
		
		System.out.println(obj.toJSONString());
		given().
		header("Content-Type","application/json").
		body(obj.toJSONString()).
		when().post("/users/2").
		then().statusCode(200).
		log().all();
		
	}

	
	
}
