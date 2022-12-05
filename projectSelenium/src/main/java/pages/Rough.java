package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import okhttp3.Challenge;

public class Rough extends SearchHotel{
	
	
	public Rough(RemoteWebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		driver.findElementById("username").sendKeys("GreensAnna1");
		driver.findElementById("password").sendKeys("GreensAnna1");
		driver.findElementById("login").click();
		WebElement locate = driver.findElementById("location");
		Select select = new Select(locate);
		select.selectByVisibleText("Sydney");
		
		WebElement hotels = driver.findElementById("hotels");
		Select hotel = new Select(hotels);
		hotel.selectByVisibleText("Hotel Creek");
		
		WebElement room = driver.findElementById("room_type");
		Select roomType = new Select(room);
		roomType.selectByVisibleText("Standard");
		
		WebElement roomNo = driver.findElementById("room_nos");
		Select rooms = new Select(roomNo);
		rooms.selectByVisibleText("2 - Two");
		
		WebElement Aroom = driver.findElementById("adult_room");
		Select Arooms = new Select(Aroom);
		Arooms.selectByVisibleText("2 - Two");
		
		WebElement croom = driver.findElementById("child_room");
		Select crooms = new Select(croom);
		crooms.selectByVisibleText("2 - Two");
		
		WebElement dateIn = driver.findElementById("datepick_in");
	    dateIn.clear(); dateIn.sendKeys("20/11/2022");
	    
	    WebElement dateOut = driver.findElementById("datepick_out");
     	dateOut.clear(); dateOut.sendKeys("21/22/2022");
     	 dateOut.submit();
     	
		
		WebElement hotel1 = driver.findElementByXPath("(//input[@value='Hotel Creek'])[1]");
		System.out.println(hotel1.getAttribute("value"));
		
	}
}
