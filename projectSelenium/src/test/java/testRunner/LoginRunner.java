package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"features/login.feature"},
		
//		dryRun = true,
		 
//		monochrome = true
		glue = { "steps", "hooks"},
 		tags = {"@reg and @smoke"},
		plugin = {"pretty", "html:reports", "json:reports/result.json"
				,"junit:reports/result.xml"}
		
		
		
		)

public class LoginRunner extends AbstractTestNGCucumberTests{

}
