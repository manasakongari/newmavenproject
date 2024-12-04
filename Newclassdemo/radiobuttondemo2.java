package Newclassdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttondemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demo.guru99.com/test/radio.html");
		Driver.manage().window().maximize();
	WebElement radio2=	Driver.findElement(By.cssSelector("input[id=\"vfb-7-2\"]"));
	radio2.click();
	if(radio2.isSelected())
	{
		System.out.println("radio2 is selected");
	}
	else
	{
		System.out.println("not selected");
	}

	}

}
