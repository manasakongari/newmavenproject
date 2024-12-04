package Newclassdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datatabledemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demo.guru99.com/test/web-table-element.php");
		Driver.manage().window().maximize();
		
		//for printing no of rows in datatable
	List<WebElement> rows = Driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tr"));
	int rowcount = rows.size();
	System.out.println(rowcount);
	
	//for printing 1st row and 1st column
	WebElement company1 = Driver.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[1]/td[1]/a"));
	String actualcompany = company1.getText();
	System.out.println(actualcompany);

	
	}
}
