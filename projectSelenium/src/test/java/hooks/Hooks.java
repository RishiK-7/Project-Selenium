package hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import basePackage.BaseClass;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	
	
@Before
public void browserLaunch() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 }	

	@After 
	public void screenShot(Scenario scenario) throws InterruptedException {
		boolean failed = scenario.isFailed();
		if(failed){
		byte[] screenshot = driver.getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
		
		System.out.println("failed");
	} else {
		System.out.println("passed");
	}
		}
	
	@After (order = 2)
	 public void quit() throws InterruptedException {
		Thread.sleep(2000);
		 driver.quit();
	 }

}
