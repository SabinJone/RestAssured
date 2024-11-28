package incidents;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class CreateIincident {
	
	
	@Test
	public void incidentCreation() {
		
		
		//Endpoint
		
		RestAssured.baseURI="https://dev182957.service-now.com/api/now/table";
		
		//Authorization
		
		RestAssured.authentication=RestAssured.basic("admin","Rt1Hv0J$A*mk");
		
		//Add Request
		RequestSpecification inputRequest=RestAssured.given().contentType("application/json").when().body("{\r\n"
				+ "    \"resolved_by\": \"Sabin Jone\"\r\n"
				+ "}");
		
		//Send Request
		Response response = inputRequest.post("/incident");
		
		//Print the Response
		response.prettyPrint();
		
	}
}
		
	

