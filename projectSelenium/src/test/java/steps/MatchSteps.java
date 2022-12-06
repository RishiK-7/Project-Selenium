package steps;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SelectHotelPage;

public class MatchSteps extends SelectHotelPage{
	
	@Given("user is on search result page")
	public void user_is_on_search_result_page() {

	    Assert.assertTrue(title().contains("Select Hotel"));
	    
	}

	@When("user checks result with search inputs")
	public void user_checks_result_with_search_inputs() {
	   
		Assert.assertTrue(hotelName().contains("Hotel Creek"));
		Assert.assertTrue(location().contains("Sydney"));
		Assert.assertTrue(rooms().contains("2"));
		Assert.assertTrue(arriveDate().contains("01/03/2023"));
		Assert.assertTrue(departureDate().contains("05/03/2023"));
		Assert.assertTrue(days().contains("4"));
		Assert.assertTrue(roomType().contains("Standard"));
	    
	}

	@Then("details should be matched")
	public void details_should_be_matched() {
		
		
	}

}
