package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"features/"},
		
//		dryRun = true,
		 
//		monochrome = true
		glue = { "steps", "hooks"},
//		tags = {"not @bag"}
		plugin = {"pretty", "html:reports", "json:reports/result.json"
				,"junit:reports/result.xml"}
		
		
		
		)




public class Runner extends AbstractTestNGCucumberTests{
	
	

}
