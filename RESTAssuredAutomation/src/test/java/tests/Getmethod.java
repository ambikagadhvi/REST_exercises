package tests;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

@SuppressWarnings("unused")
public class Getmethod {
	
	
	@Test
	public void get() {
		baseURI= "https://api.github.com";  
		
		given()
			.get("/user/repos");

		
			
		
		
		/*Response response = httpRequest.request(Method.GET, "/api/users?page=2");
		
		
		String responseBody = response.getBody().asString();
		System.out.println("Response:"+ responseBody);
		
		
		int ActualStatusCode = response.getStatusCode();
		System.out.println(ActualStatusCode);
		
		Assert.assertEquals(ActualStatusCode, 200);
		
		String actual = response.getStatusLine();
		System.out.println(actual);
		String Expected = "HTTP/1.1 200 OK";
		Assert.assertEquals(actual, Expected);
		
		
		Headers allheaders = response.headers();
		for(Header header:allheaders) {
			System.out.println(header.getName()+"       "+header.getValue());*/
		
		
		
		
		
	
		}

		
		
		
	}

