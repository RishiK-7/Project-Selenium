package steps;

import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SearchHotel;
import pages.SelectHotelPage;

public class SearchHotelSteps {
	
	@When("user enters hotel details")
	public void user_enters_hotel_details() {
		SearchHotel.location("Sydney");
		SearchHotel.hotels("Hotel Creek");
		SearchHotel.roomType("Standard");
		SearchHotel.roomNo("2 - Two");
		SearchHotel.adultRoom("2 - Two");
		SearchHotel.childRoom("2 - Two");
		SearchHotel.dateIn("01/03/2023");
		SearchHotel.dateOut("05/03/2023");
	}

	@When("user click search button")
	public void click_search_button() {
		SearchHotel.search();
	   
	}

	@Then("select hotel screen should appear")
	public void select_hotel_screen_should_appear() {
		String title = SelectHotelPage.title();
	   Assert.assertTrue(title.contains("Select Hotel"));
	}

	@When("user enters hotel details with incorrect {string} and {string}")
	public void user_enters_hotel_details_with_incorrect_and(String datein, String dateout) {
		SearchHotel.dateIn(datein);
		SearchHotel.dateOut(dateout);
	   
	}

	@Then("date error should be shown")
	public void date_error_should_be_shown() {
		String dateError = SearchHotel.dateError();
	   Assert.assertTrue(dateError.contains("Check-In Date"));
		
	}
	
	

}
