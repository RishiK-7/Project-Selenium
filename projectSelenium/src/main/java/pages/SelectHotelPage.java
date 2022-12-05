package pages;

import org.openqa.selenium.WebElement;

import basePackage.BaseClass;

public class SelectHotelPage extends BaseClass{
	
	public static String hotelName() {
		WebElement hotel = driver.findElementById("hotel_name_0");
		return hotel.getAttribute("value");
		
	}
	public static String location() {
		WebElement location = driver.findElementByName("location_0");
		String text = location.getAttribute("value");
		return text;
	}
	public static String rooms() {
		WebElement rooms = driver.findElementByName("rooms_0");
		return rooms.getAttribute("value");
	}
	public static String arriveDate() {
		WebElement arDate = driver.findElementByName("arr_date_0");
		return arDate.getAttribute("value");
	}
	public static String departureDate() {
		WebElement depDate = driver.findElementByName("dep_date_0");
		return depDate.getAttribute("value");
	}
	public static String days() {
		WebElement days = driver.findElementByName("no_days_0");
		return days.getAttribute("value");
	}
	public static String roomType() {
		WebElement type = driver.findElementByName("room_type_0");
		return type.getAttribute("value");
	}
	public static String price() {
		WebElement price = driver.findElementByName("price_night_0");
		return price.getAttribute("value");
	}
	public static String totalPrice() {
		WebElement tprice = driver.findElementByName("total_price_0");
		return tprice.getAttribute("value");
		
	}
	
	public static String title() {
		String title = driver.getTitle();
		return title;
	}

}
