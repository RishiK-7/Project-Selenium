package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import basePackage.BaseClass;

public class SearchHotel extends BaseClass{
	
	public SearchHotel(RemoteWebDriver driver){
		this.driver = driver;
	}
	
	public static WebElement location(String Slocation) {
		WebElement locate = driver.findElementById("location");
		Select select = new Select(locate);
		select.selectByVisibleText(Slocation);
		return locate;
	}
	
	public static WebElement hotels(String Hotelname) {
		WebElement hotels = driver.findElementById("hotels");
		Select hotel = new Select(hotels);
		hotel.selectByVisibleText(Hotelname);
		return hotels;
	}
	
	public static WebElement roomType(String type) {
        WebElement room = driver.findElementById("room_type");
		Select roomType = new Select(room);
		roomType.selectByVisibleText(type);
		return room;
		}
	
	public static WebElement roomNo(String num) {
		WebElement roomNo = driver.findElementById("room_nos");
		Select rooms = new Select(roomNo);
		rooms.selectByVisibleText(num);
		return roomNo;
		}
	
	public static WebElement adultRoom(String room) {
		WebElement Aroom = driver.findElementById("adult_room");
		Select Arooms = new Select(Aroom);
		Arooms.selectByVisibleText(room);
		return Aroom;
	}
	
	public static WebElement childRoom(String rooms) {
		WebElement croom = driver.findElementById("child_room");
		Select crooms = new Select(croom);
		crooms.selectByVisibleText(rooms);
		return croom;
	}
	
	public static WebElement dateIn(String datein) {
		WebElement dateIn = driver.findElementById("datepick_in");
	    dateIn.clear(); dateIn.sendKeys(datein);
	    return dateIn;
	}
	
	public static WebElement dateOut(String dateout) {
		WebElement dateOut = driver.findElementById("datepick_out");
     	dateOut.clear(); dateOut.sendKeys(dateout);
		return dateOut;
	}
	
	public static WebElement dateInn(String datein) {
		WebElement dateIn = driver.findElementById("datepick_in");
	    dateIn.clear(); dateIn.sendKeys(datein);
	    return dateIn;
	}
	
	public static WebElement dateOutt(String dateout) {
		WebElement dateOut = driver.findElementById("datepick_out");
     	dateOut.clear(); dateOut.sendKeys(dateout);
		return dateOut;
	}
	
	public static WebElement error(String error) {
		WebElement err = driver.findElementById(error);
		System.out.println("Date Error shows -" +err.getText());
		return err;
		
	}
	
	public static String title() {
		String title = driver.getTitle();
		return title;
	}
	
	public static void search() {
		driver.findElement(By.id("Submit")).click();
		}
	
	public static String dateError() {
		String error = driver.findElement(By.id("checkin_span")).getText();
		return error;
	}
	
	public static String dateBlank() {
		String error = driver.findElement(By.id("checkin_span")).getText();
		return error;
	}
	
	
public void hotel() {
		
		
		
		
		WebElement dateIn = driver.findElementById("datepick_in");
	//	dateIn.clear(); dateIn.sendKeys("20/11/2022");
        WebElement dateOut = driver.findElementById("datepick_out");
	//	dateOut.clear(); dateOut.sendKeys("21/11/2022");
		
		
	//	croom.submit();  
		try {//DateOut as before DateIn
			dateIn.clear(); dateIn.sendKeys("20/11/2022");
			dateOut.clear(); dateOut.sendKeys("17/11/2022");
			dateOut.submit();
		WebElement err = driver.findElementById("checkin_span");
		System.out.println("Date Error shows -" +err.getText());
		} catch (NoSuchElementException e) {
			System.err.println("Defect found in Date");
			driver.navigate().back();
		}
		
		try {//DateOut month before DateIn
			dateIn.clear(); dateIn.sendKeys("20/11/2022");
			dateOut.clear(); dateOut.sendKeys("21/10/2022");
			dateOut.submit();
			WebElement err = driver.findElementById("checkin_span");
			System.out.println("Month Error shows -" +err.getText());
		}catch (NoSuchElementException e) {
			System.err.println("Defect found in Month");
			driver.navigate().back();
		}
		
		try {//year DateOut as before DateIn
			dateIn.clear(); dateIn.sendKeys("20/10/2020");
			dateOut.clear(); dateOut.sendKeys("21/11/2022");
			dateOut.submit();
			WebElement err = driver.findElementById("checkin_span");
			System.out.println("Month Error shows -" +err.getText());
		} catch (NoSuchElementException e) {
			System.err.println("Defect found in Year");
			driver.navigate().back();
		}
		
		try {//DateIn as before DateOut
			
			dateIn.clear(); dateIn.sendKeys("25/12/2022");
			dateOut.clear(); dateOut.sendKeys("28/01/2023");
			dateOut.submit();
			WebElement err = driver.findElementById("checkin_span");
			System.out.println("Month Error shows -" +err.getText());
		} catch (NoSuchElementException e) {
			System.out.println("Test Pass - Test Completed");
		} catch (StaleElementReferenceException e) {
			System.out.println("fail - Test Completed");
		} 
		finally  {
			dateIn = driver.findElementById("datepick_in");
			dateIn.clear(); dateIn.sendKeys("25/12/2022");
			dateOut=driver.findElementById("datepick_out");
			dateOut.clear(); dateOut.sendKeys("28/01/2023");
			dateOut.submit();
			System.out.println("Test Completed with above defects");
		}
		
		}

}
