package Newclassdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver Driver = new ChromeDriver();
				Driver.get("https://www.orangehrm.com/en/pricing");
				Driver.manage().window().maximize();
				Actions buider = new Actions(Driver);
			WebElement fn=	Driver.findElement(By.cssSelector("#Form_getForm_Email"));
			buider.contextClick(fn).build().perform();
			buider.doubleClick(fn).build().perform();
			buider.clickAndHold(fn).build().perform();

	}

}
