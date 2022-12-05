package hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import basePackage.BaseClass;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	
	
@Before	
public void browserLaunch() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 }	
	
	
	 public void quit() {
		 driver.quit();
	 }

}
