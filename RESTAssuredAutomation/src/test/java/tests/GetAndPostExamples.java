package tests;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;
public class GetAndPostExamples {

	@Test
	public void testGet() {
		baseURI = "https://reqres.in/api";
		given().
		  get("/users?page=2").
		then().
		   statusCode(200).
		body("data.last_name",hasItems("Edwards","Howell")).
		body("data[5].first_name",equalTo("Tobias"));
	}
	
	
	//@Test
	public void testPost() {
	
		Map<String, Object> map = new HashMap<String, Object>();

//		map.put("name","Sam");
//		map.put("job", "teacher");
//		
//		System.out.println(map);
		
		JSONObject request = new JSONObject();
		
		request.put("name","Sam");
		request.put("job", "teacher");
		
		System.out.println(request.toJSONString(map));
		
		
		baseURI = "https://reqres.in/api";
		
		
		given().
		header("Content-Type", "application/json").
	contentType(ContentType.JSON).accept(ContentType.JSON).
		
		  body(request.toJSONString()).
		when().
		 post("/users").
		then().
		 statusCode(201).log().all();
		
	}
}
