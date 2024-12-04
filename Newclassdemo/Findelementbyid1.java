package Newclassdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Findelementbyid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.orangehrm.com/en/book-a-free-demo");
		Driver.manage().window().maximize();
		//Driver.findElement(By.id("Form_getForm_FullName")).sendKeys("MANU");
		//Driver.findElement(By.id("Form_getForm_Email")).sendKeys("manu@gmail.com");
		//Driver.findElement(By.id("Form_getForm_CompanyName")).sendKeys("abc");
		Driver.findElement(By.name("FullName")).sendKeys("MANU");
		Driver.findElement(By.name("Email")).sendKeys("MANU.gmail.com");
		Driver.findElement(By.name("CompanyName")).sendKeys("MANU");
	}

}
