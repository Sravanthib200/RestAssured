package Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:reports/cucumber-reports.html"},
				//"html:reports/cucumber-reports.json"},
		monochrome=false, //console output color 
		dryRun=false ,
       //tags = "@post",
         tags = "@getall",
		//tags ="@getbyid" ,
		//tags ="@getbyname" ,
		//tags ="@getbyprogramid" ,
		//tags ="@put" ,
		//tags = "@delete" ,
		//tags = "@invalidgetall",
		//tags = "@invalidgetbyid",
	//tags = "@batch",
		features = {"src/test/resources/features/Batch.feature"},
		//{"src/test/resources/features/Myfirst.feature"},
		//{"src/test/resources/features/BatchNegativeScenarios.feature"}, //location of feature files
		glue= "stepDefinitions") //location of step definition files

		

public class TestRunner {

}