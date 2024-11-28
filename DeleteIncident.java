package incidents;

	import org.testng.annotations.Test;

	import io.restassured.RestAssured;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;


	public class DeleteIncident {
		
		
		@Test
		public void DeleteIncident() {
			
			
			//Endpoint
			
			RestAssured.baseURI="https://dev182957.service-now.com/api/now/table";
			
			//Authorization
			
			RestAssured.authentication=RestAssured.basic("admin","Rt1Hv0J$A*mk");
			
			//Send Request ed93a5b283ca5a10798cc1e6feaad331
			
			Response response = RestAssured.delete("/incident/ed93a5b283ca5a10798cc1e6feaad331");
			int statusCode = response.getStatusCode();
			System.out.println("The status code is " +statusCode);
			
			
			
}
	}
