package Newclassdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exceldemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver Driver = new ChromeDriver();
		Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		FileInputStream fs = new FileInputStream("D://book2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(1);
		Row row = sheet.getRow(3);
		Cell cell = row.getCell(0);
		String email = cell.getStringCellValue();
		System.out.println(email);
		Cell cell2 = row.getCell(4);
		String password = cell2.getStringCellValue();
		System.out.println(password);
		Driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(email);
		Driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
		Driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();


	}

}
