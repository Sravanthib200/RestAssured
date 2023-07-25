package api.endpoints;

import static io.restassured.RestAssured.given;
//import global.GlobalVar;
import pojo.Batchpayload;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
//import pojo.Batchpayload;


public class BatchEndPoints {

	public static Response createBatch(Batchpayload userPayload)
	{
		Response response=given()
		   .contentType(ContentType.JSON)
		   .accept(ContentType.JSON)
		   .body(userPayload)
		   .when()
		   .post(Routes.post_url);
		
		return response;
		  
		
	}
	
	
	
	public static Response getAllBatch()
	{
		Response response=given()
		   
		   .get(Routes.getAll_url);
		
		return response;
		   
	}
	
	public static Response getAllBatchById(int batchId)
	{
		Response response=given().pathParam("batchId", batchId).
		   
	  when().get(Routes.getById_url);
		
		return response;
		   
	}
	public static Response getAllBatchByName(String batchName)
	{
		Response response=given().pathParam("batchName", batchName).
		   
		   when().get(Routes.getByName_url);
		
		return response;
		   
	}
	
	public static Response getAllBatchByProgramId(int programId)
	{
		Response response=given().pathParam("programId", programId).
		   
		  when().get(Routes.getByProgram_url);
		
		return response;
		   
	}
	public static Response updateBatch(int batchId, Batchpayload userPayload)
	
	{
		
	    Response response=given()
			   .contentType(ContentType.JSON)
			   .accept(ContentType.JSON)
			   .pathParam("batchId",batchId)
			   .body(userPayload)
			   .when()
			   .put(Routes.update_url);
			
			return response;
			   
		}
	
	
	public static Response deleteBatch(int batchId)
	{
		Response response=given()
				.pathParam("batchId",batchId)
				
		   .when()
		   .delete(Routes.delete_url);
		
		return response;
		   
	}
}
