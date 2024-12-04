package Newclassdemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import org.apache.commons.compress.harmony.pack200.IntList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class tablerowcountdemo {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demo.guru99.com/test/web-table-element.php");
		Driver.manage().window().maximize();
	List<WebElement> rows= Driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tr"));
	int rowcount = rows.size();
	System.out.println(rowcount);
	
	

	}

}
