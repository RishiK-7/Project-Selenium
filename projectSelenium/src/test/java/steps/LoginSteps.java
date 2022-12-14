package steps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LogInPage;
import pages.SearchHotel;

public class LoginSteps {
	
	@Given("user navigate to the application site")
	public void user_navigate_to_the_application_site() {
	    
	    
	}

	@Given("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		Properties prop = new Properties();
        FileInputStream file;
		try {
			file = new FileInputStream("config.properties");
			prop.load(file);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();}
			
		 catch (IOException e) {
			e.printStackTrace();
		}
		String username = prop.getProperty("username");
        String password = prop.getProperty("password");
	    LogInPage.login(username, password);
	    LogInPage.loginButton();
	    
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    
	    
	}

	@Then("login should be success")
	public void login_should_be_success() {
	    Assert.assertTrue(SearchHotel.title().contains("Search Hotel"));
	    
	}

	@Given("user enters Invalid {string} and {string}")
	public void user_enters_Invalid_and(String username, String password) {
	    LogInPage.login(username, password);
	    LogInPage.loginButton();
	}

	@Then("login should be fail")
	public void login_should_be_fail() {
		String error = LogInPage.error();
	    Assert.assertTrue(error.contains("Invalid Login details or Your Password"));
	    
	}
	
	@Then("login error should be shown")
	public void login_error_should_be_shown() {
	    String username = LogInPage.nameBlankError();
	    String password = LogInPage.passBlankError();
	    Assert.assertTrue(username.contains("Enter") ||  password.contains("Enter"));
	    
	    
		
	}

}
