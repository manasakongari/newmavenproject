package Newclassdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;              

public class linktextdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.selenium.dev/");
		Driver.manage().window().maximize();
		Driver.findElement(By.linkText("Documentation")).click();

	}

}
