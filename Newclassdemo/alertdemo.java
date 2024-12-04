package Newclassdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		Driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("1234");
		Driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		Thread.sleep(2000);
		Driver.switchTo().alert().accept();
		Driver.switchTo().alert().accept();
		
		Driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("ABCD");
		Driver.findElement(By.xpath("//input[@name=\"res\"]")).click();
		Thread.sleep(2000);
		Driver.switchTo().alert().dismiss();
		
	}

	}


