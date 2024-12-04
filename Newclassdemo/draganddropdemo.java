package Newclassdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		Driver.manage().window().maximize();
		Actions buider = new Actions(Driver);
	WebElement source=	Driver.findElement(By.cssSelector("input[id=\"vfb-7-2\"]"));

	}

}
