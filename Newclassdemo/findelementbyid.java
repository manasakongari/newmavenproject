package Newclassdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelementbyid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		//Driver.get("https://www.orangehrm.com/");
//		Driver.get("https://www.selenium.dev/");
		Driver.manage().window().maximize();
		//Driver.findElement(By.linkText("Pricing")).click();
		
//		Driver.findElement(By.id("nav-search-submit-button")).click();
		Driver.get("https://www.walmart.com/");
		Driver.findElement(By.name("q")).sendKeys("iphone");
		Driver.findElement(By.xpath("//*[@class=\"ld ld-Search absolute\"]")).click();
	}

}
