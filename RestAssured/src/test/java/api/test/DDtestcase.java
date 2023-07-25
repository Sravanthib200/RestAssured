package api.test;

import api.endpoints.BatchEndPoints;
import api.utilities.Loggerload;
import global.GlobalVar;
import io.restassured.RestAssured;
import io.restassured.filter.log.LogDetail;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import pojo.Batchpayload;
import com.github.javafaker.Faker;
import java.io.IOException;
import org.junit.Assert;
import global.GlobalVar;

public class DDtestcase {

	static Faker faker = new Faker();
	 
	Response response;
	
	Response getresponse;

	Response afterupdateresponse;

	Response afterdelresponse;
	
 public static int actualcode;
 public static int batchId;
 
 //@@@@@@@@@@@@@@@@@@@@@@ POST @@@@@@@@@@@@@@@@@@@@@@@@//
 
	public void TestPostBatch(String subDesc,String subComments,String subPathAttach1,int subPathAttach2,int subPathAttach3,String subPathAttach4)
throws IOException
	{
		Batchpayload userPayload=new Batchpayload();
		
		userPayload.setBatchName(subDesc);
		userPayload.setBatchDescription(subComments);
		userPayload.setBatchStatus(subPathAttach1);
		userPayload.setBatchNoOfClasses(subPathAttach2);
		userPayload.setProgramId(subPathAttach3);
		userPayload.setProgramName(subPathAttach4);
		
	  
		 Loggerload.info("*********************** Creating Batch *************");
			
		response= BatchEndPoints.createBatch(userPayload);
        response.then().log().all();
		actualcode=response.getStatusCode();
		
		Loggerload.info("*********************** Batch is Created ****************");
		

	}

	public void verify_post_status(int int1) {
	

		Assert.assertEquals(actualcode,int1);
		
		Loggerload.info("*********************** status is been verified ****************");
	}

	//@@@@@@@@@@@@@@@@@@@@@@ GET @@@@@@@@@@@@@@@@@@@@@@@@@@@@//

	public void TestGetBatch()

	{

		Loggerload.info("*********************** Retrieving All Batches *************");
		
		response= BatchEndPoints.getAllBatch();
		//batchId=getresponse.jsonPath().getInt("batchId");// post request url here 
		//System.out.println("value of id"+batchId);
		
		Loggerload.info(response.toString());
		actualcode = response.getStatusCode();
		response.then().log().all();

	}

	public void TestGetBatchById(int batchId)

	{

		Loggerload.info("*********************** Retriving Batch *************");
		response= BatchEndPoints.getAllBatchById(batchId);
		Loggerload.info(response.toString());
		actualcode = response.getStatusCode();
		response.then().log().all();	
		
	}
	public void verify_get_by_id()

	{

		Assert.assertEquals(response.getStatusCode(), 200);

		Loggerload.info("*********************** Batch details are Displayed *************");

		
	}

	public void TestGetBatchByName(String batchName)

	{

		Loggerload.info("*********************** Retrieving Batch *************");
		response= BatchEndPoints.getAllBatchByName(batchName);
		Loggerload.info(response.toString());
		actualcode = response.getStatusCode();
		response.then().log().all();
	}
	public void verify_get_by_name(String batchName)

	{

		Assert.assertEquals(getresponse.getStatusCode(), 200);	

		Loggerload.info("*********************** Batch details are Displayed *************");

		
	}

	public void TestGetBatchByProgramId(int programId)

	{

		Loggerload.info("*********************** Retriving Batch *************");
		response= BatchEndPoints.getAllBatchByProgramId(programId);
		Loggerload.info(response.toString());
		actualcode = response.getStatusCode();
		response.then().log().all();	
		
	}

	public void verify_get_by_status(int programId)

	{

		Assert.assertEquals(getresponse.getStatusCode(), 200);	

		Loggerload.info("*********************** Batch details are Displayed *************");

		}

	//@@@@@@@@@@@@@@@@@@@@@@@ UPDATE @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@//
	
	public void TestUpdateBatch(String subDesc,String subComments,String subPathAttach1,int subPathAttach2,int subPathAttach3,String subPathAttach4)

	{

      Batchpayload userPayload=new Batchpayload();
		
		userPayload.setBatchName(subDesc);
		userPayload.setBatchDescription(subComments);
		userPayload.setBatchStatus(subPathAttach1);
		userPayload.setBatchNoOfClasses(subPathAttach2);
		userPayload.setProgramId(subPathAttach3);
		userPayload.setProgramName(subPathAttach4);

		Loggerload.info("*********************** Updating Batch*************");

		response= BatchEndPoints.updateBatch(batchId,userPayload);

		response.then().log().all();

		Assert.assertEquals(response.getStatusCode(), 200);

		Loggerload.info("*********************** Batch details Updated ****************");

		

		Loggerload.info("*********************** Retriving Batch Details after Update *************");

		afterupdateresponse= BatchEndPoints.getAllBatchById(batchId);
		Loggerload.info(afterupdateresponse.toString());
		afterupdateresponse.then().log().all();

	}

		public void Update_status()

		{

		Assert.assertEquals(afterupdateresponse.getStatusCode(), 200);

		Loggerload.info("*********************** Batch details Updated *************");
	
	}

		//@@@@@@@@@@@@@@@@@@@@@@@ DELETE @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@//

		public void TestDeleteBatch(int batchId )

		{

			Loggerload.info("*********************** Deleting Batch *************");
			response= BatchEndPoints.deleteBatch(batchId);
			Loggerload.info(response.toString());
	
		}

		
        public void verify_del_status()

		{

			Assert.assertEquals(afterdelresponse.getStatusCode(), 200);	

			Loggerload.info("*********************** Deletion Successful *************");

		}

	
        
}





	