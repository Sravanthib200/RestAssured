package api.endpoints;

/*
  Swagger URL------> https://lms-api-hackathon-june2023-930a8b0f895d.herokuapp.com/lms/swagger-ui.html
 
 create batch(post) : https://lms-api-hackathon-june2023-930a8b0f895d.herokuapp.com/lms/batches
 
 Get batch (Get) : https://lms-api-hackathon-june2023-930a8b0f895d.herokuapp.com/lms/batches
 
 update batch (put) : https://lms-api-hackathon-june2023-930a8b0f895d.herokuapp.com/lms/batches/{batchId}
 
 Delete batch (Delete) : https://lms-api-hackathon-june2023-930a8b0f895d.herokuapp.com/lms/batches/{id}
 
 Get batch by Id (Get) : https://lms-api-hackathon-june2023-930a8b0f895d.herokuapp.com/lms/batches/batchId/{batchId}

 Get batch by Name (Get) : https://lms-api-hackathon-june2023-930a8b0f895d.herokuapp.com/lms/batches/batchName/{batchName}

 Get batch by Program (Get) : https://lms-api-hackathon-june2023-930a8b0f895d.herokuapp.com/lms/batches/program/{programId}

 
 */



public class Routes {
	public static String base_url= "https://lms-api-hackathon-june2023-930a8b0f895d.herokuapp.com/lms";

	//Batch Module
	
	public static String post_url=base_url+"/batches";
	
	public static String getAll_url=base_url+"/batches";
	
	public static String update_url=base_url+"/batches/{batchId}";
	
	public static String delete_url=base_url+"/batches/{id}";
	
	public static String getById_url=base_url+"/batches/batchId/{batchId}";
	
	public static String getByName_url=base_url+"/batches/batchName/{batchName}";
	
	public static String getByProgram_url=base_url+"/batches/program/{programId}";
	
   // public static String invalidbase_url="https://lms-api-hackathon-june2023-930a8b0f895d.herokuapp.com/";
}
 