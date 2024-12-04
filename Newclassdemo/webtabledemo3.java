package Newclassdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtabledemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demo.guru99.com/test/web-table-element.php");
		Driver.manage().window().maximize();
		
		//for printing no of rows in datatable
	List<WebElement> rows = Driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tr"));
	int rowcount = rows.size();
	System.out.println(rowcount);
		//for printing all rows and 1st column
		for(int i = 1; i<rowcount; i++)
		{
			
		WebElement company1= Driver.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody/tr["+i+"]/td[1]"));
			String actualcompany = company1.getText();
		System.out.println(actualcompany);
		
		}


	}

}
