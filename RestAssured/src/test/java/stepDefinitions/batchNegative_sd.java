package stepDefinitions;

//import api.endpoints.Routes;
import api.test.DDtestcase;
import api.utilities.Loggerload;
import global.GlobalVar;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.Batchpayload;

public class batchNegative_sd {

	public static Response response;
	public String batchName;
	public Batchpayload userpayload;
	RequestSpecification requestSpec;
	DDtestcase post=new DDtestcase();
	
	@Given(": User trying to create POST Request with invalid baseUrl")
	public void user_trying_to_create_post_request_with_invalid_base_url() {
    Loggerload.info("user unable to create post request with invalid baseUrl");
	
	}

	@Then(": User receieves {int} Bad Request Status with response body")
	public void user_receieves_bad_request_status_with_response_body(Integer int1) {
		post.verify_post_status(400);

	    
	}

	@Given(": User trying to create POST Request without batchname")
	public void user_trying_to_create_post_request_without_batchname() {
	Loggerload.info("user unable to create post request without batchname");
 
	    
	}

	@Given(": User has to request to retrieve the data with invalid batchid")
	public void user_has_to_request_to_retrieve_the_data_with_invalid_batchid() {
	    post.verify_get_by_id();
	    
	}

	@When(": User sends get request with invalid {int}")
	public void user_sends_get_request_with_invalid(Integer int1) {
		post.TestGetBatchById(GlobalVar.invalidBatchId);
	    
	}

	@Given(": User has to request to retrieve the data with invalid batchname")
	public void user_has_to_request_to_retrieve_the_data_with_invalid_batchname() {
		Loggerload.info("user unable to get data with invalid batchname");
	    
	}

	@When(": User sends get request with invalid {string}")
	public void user_sends_get_request_with_invalid(String string) {
	    post.TestGetBatchByName(string);
	    
	}

	@Given(": User has to request to retrieve the data with invalid programid")
	public void user_has_to_request_to_retrieve_the_data_with_invalid_programid() {
		Loggerload.info("user unable to get data with invalid programid");

	    
	}

	@Given(": User has to request to update the data with invalid batchid")
	public void user_has_to_request_to_update_the_data_with_invalid_batchid() {
		Loggerload.info("user unable to update data with invalid batchid");

	    
	}

	@When(": User sends put request with invalid {int}")
	public void user_sends_put_request_with_invalid(Integer int1) {
	    post.TestGetBatchById(GlobalVar.invalidBatchId);
	    
	}

	@Then(": User receives {int} Bad Request Status with response body")
	public void user_receives_bad_request_status_with_response_body(Integer int1) {
		post.verify_post_status(404);
	    
	}

	@Given(": User has to request to delete the data with invalid batchid")
	public void user_has_to_request_to_delete_the_data_with_invalid_batchid() {
     Loggerload.info("user unable to delete data with invalid batchid");

	    
	}

	@When(": User sends delete request with invalid {int}")
	public void user_sends_delete_request_with_invalid(Integer int1) {
		post.TestGetBatchById(GlobalVar.invalidBatchId);
	    
	}



}
