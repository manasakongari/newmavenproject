package Newclassdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowndemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.orangehrm.com/en/contact-sales");
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		Driver.findElement(By.name("FullName")).sendKeys("MANU");
		Driver.findElement(By.name("Email")).sendKeys("MANU.gmail.com");
		Driver.findElement(By.name("CompanyName")).sendKeys("MANU");
	WebElement country = Driver.findElement(By.id("Form_getForm_NoOfEmployees"));
		Select dropdowncountry = new Select(country);
		dropdowncountry.selectByValue("151 - 200");
		//dropdowncountry.selectByVisibleText("Austria");

	}

}
