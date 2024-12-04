package Newclassdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class titlematchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.amazon.com/";
		Driver.get(url);
		String expectedtitle="Amazon.com. Spend less. Smile more.";
		String actualTitle = Driver.getTitle();
		if(actualTitle.equals(expectedtitle))
		{
			System.out.println("title is matched");
		}
		else
		{
			System.out.println("not matched");
		}


	}

}
