package Newclassdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowndemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.orangehrm.com/en/book-a-free-demo");
		
		WebElement country = Driver.findElement(By.id("Form_getForm_Country"));
		Select dropdowncountry = new Select(country);
		//dropdowncountry.selectByValue("Bahamas");
		//dropdowncountry.selectByVisibleText("Austria");
		dropdowncountry.selectByIndex(1);

	}

}
