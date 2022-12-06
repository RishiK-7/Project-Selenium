package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"features/searchHotel.feature"},
		
//		dryRun = true,
		 
//		monochrome = true
		glue = { "steps", "hooks"},
		tags = {"@reg"},
		plugin = {"pretty", "html:reports", "json:reports/result.json"
				,"junit:reports/result.xml"}
		
		
		
		)

public class SearchHotel extends AbstractTestNGCucumberTests{

}
