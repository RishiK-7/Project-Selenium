package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import basePackage.BaseClass;

public class LogInPage extends BaseClass {

	public LogInPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public static void login(String username, String password) {
       
		driver.findElementById("username").sendKeys(username);
		driver.findElementById("password").sendKeys(password);
	}
	
	public static void loginButton() {
		driver.findElementById("login").click();
	}
	

	public static String error() {

		String err = driver.findElementByClassName("auth_error").getText();
		return err;
	}
	public static String nameBlankError() {
		String err = driver.findElementById("username_span").getText();
		return err;
	}
	 
	public static String passBlankError() {
		String err = driver.findElementById("password_span").getText();
		return err;
	}
	

}
