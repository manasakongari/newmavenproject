package Newclassdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.youtube.com/");
		Driver.findElement(By.id("search")).sendKeys("rhymes");
		Driver.findElement(By.xpath("//*[@class=\"ld ld-Search absolute\"]")).click();
	}

	}


