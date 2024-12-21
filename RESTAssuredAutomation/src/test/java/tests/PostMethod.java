package tests;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostMethod {

	
	
	@Test
	public void Postdata() {
		  
		

		RestAssured.baseURI= "https://reqres.in";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		
		JSONObject request = new JSONObject();
		
		request.put("name","Sam");
		request.put("job", "teacher");
		
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(request.toJSONString());
		
		
		Response response = httpRequest.request(Method.POST, "/api/users");
		
		
		String responseBody = response.getBody().asString();
		System.out.println("Response:"+ responseBody);
		
		
		int ActualStatusCode = response.getStatusCode();
		System.out.println(ActualStatusCode);
		
		Assert.assertEquals(ActualStatusCode, 201);
		
		
}
	
	
	//@Test(dataProvider= "datapro")
	public void PostNewEmp(String ename,String esalary,String eage) {
		
		RestAssured.baseURI= "https://reqres.in";
		
		RequestSpecification obj = RestAssured.given();
		
		// data for post req
		JSONObject requestParam = new JSONObject();
		requestParam.put("name", ename);
		requestParam.put("age", esalary);
		requestParam.put("salary", eage);
		
		
		
		// header stating that Req body is json
		obj.header("Content-Type", "application/json");
		
		//Add json to body of req
	     obj.body(requestParam.toJSONString());
			
		//post req
	     
		
		
		Response response = obj.request(Method.POST,"/api/users");
		
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		Assert.assertEquals(responsebody.contains(ename), true);
		Assert.assertEquals(responsebody.contains(eage), true);
		Assert.assertEquals(responsebody.contains(esalary), true);
	}
	
	
		
	@DataProvider(name="datapro")		
	String [][] getEmpData()
	{
		String empdata [][]= {{"aashu","767622","22"}, {"aashu12","767644","26"},{"aashu22","767666","66"}};
	     return(empdata);
	
	
	}
	
			
	


		}
