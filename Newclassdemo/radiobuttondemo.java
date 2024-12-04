package Newclassdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demo.");
		Driver.manage().window().maximize();
		Driver.findElement(By.cssSelector("input[id=\"vfb-7-2\"]")).click();
		//Driver.getTitle();
		Driver.findElement(By.cssSelector("input[id=\"vfb-6-0\"]")).click();

	}

}
