package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import api.test.DDtestcase;
import api.utilities.ExcelReader;
import api.utilities.Loggerload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import global.GlobalVar;

public class batch_sd {

	
DDtestcase post=new DDtestcase();
	//post create batch
	@Given(": User creates POST Request for the valid baseUrl and endpoint")
	public void user_creates_post_request_for_the_valid_baseurl_and_endpoint() {
	    Loggerload.info("user created post request with endpoint");
	  
	}
	@When(": User sends request Body from excel {string} and {int}")
		public void user_sends_request_body_from_excel_and(String SheetName,int RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();

		List<Map<String,String>> testData=reader.getData(".//testData//Batch-RestAssured.xlsx", SheetName);

		String desc=testData.get(RowNumber).get("batchName");

		String postcomment=testData.get(RowNumber).get("batchDescription");

		String subpath1=testData.get(RowNumber).get("batchStatus");

		int subpath2=GlobalVar.batchNoOfClasses;
	    int subpath3=GlobalVar.programId;
		
        String subpath4=testData.get(RowNumber).get("programName");


		post.TestPostBatch(desc,postcomment,subpath1,subpath2,subpath3,subpath4);
		}
		
		
	@Then(": User receieves {int} Created Status with response body")
	public void user_receieves_created_status_with_response_body(Integer int1) {
		post.verify_post_status(int1);
		 post.TestGetBatch();
	}

	

	@Given(": User has to request to retrieve the data")
	public void user_has_to_request_to_retrieve_the_data() {
	    Loggerload.info("-----user is going to retrieve the data by get request------");
	}

	@Then(": User gets data using batchname")
	public void user_gets_data_using_batchname(String batchName)  {
		post.verify_get_by_name(batchName);
	}
	
	@Then(": User receieves the list of data with status code 200 ok")
	public void user_receieves_the_list_of_data_with_status_code_200_ok() {
		post.TestGetBatch();
	}

	@Then(": User gets data using batchid")
	public void user_gets_data_using_batchid(int batchId) {
	    post.verify_get_by_id();
	}


//getbyid
	
	@When(": User data is retrieved using {int} by get request")
	public void user_data_is_retrieved_using_by_get_request(int batchId) {
//	@When(": User data is retrieved using <id> by get request")
//	public void user_data_is_retrieved_using_id_by_get_request(int batchid) {
		
	    post.TestGetBatchById(batchId);
	    post.verify_get_by_id();
	    
	}
	@Then(": User gets data by programId")
	public void user_gets_data_by_program_id(int programId) {
		post.verify_get_by_status(programId);
	}
//getbyname
	
	@When(": User data is retrieved using {string} by get request")
	public void user_data_is_retrieved_using_by_get_request(String batchName) {
		 post.TestGetBatchByName(batchName);
		// post.verify_get_by_name(batchName);
		   
	}
	
////getbyprogramid
//	
//	@When(": User data is retrieved using {int} by get request")
//	public void user_data_is_retrieved_using_by_programid_get_request(Integer int1) {
//		post.TestGetBatchByProgramId(int1);
//	    post.verify_get_by_program_id();
//	}
	
	//put(update the data)

	@Given(": User has to request to update the data")
	public void user_has_to_request_to_update_the_data() {
    Loggerload.info("-----user is going to update the data by get request------");
	}

	@When(": User calls the payload API with PUT Request by BatchId")
	public void user_calls_the_payload_api_with_put_request_by_batch_id(String subDesc,String subComments,String subPathAttach1,int subPathAttach2,int subPathAttach3,String subPathAttach4) {
	    post.TestUpdateBatch(subDesc,subComments,subPathAttach1,subPathAttach2,subPathAttach3,subPathAttach4);
	   
	   
	}

	@Then(": User updated the list of data")
	public void user_updated_the_list_of_data() {
		 post.Update_status();
	}

	//delete
	
//	@Given(": User has to request to delete the data")
//	public void user_has_to_request_to_delete_the_data() {
//	Loggerload.info("-----user is going to delete the data by get request------");
//
//	}
//
//	@When(": User data is deleted using {int} by delete request")
//	public void user_data_is_deleted_using_by_delete_request(int batchId) {
//		post.TestDeleteBatch(batchId);
//	}
//	
//	@Then(": User deleted the list of data")
//	public void user_deleted_the_list_of_data() {
//      post.verify_del_status();
//
//}
}

