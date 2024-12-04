package Newclassdemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fs = new FileInputStream("D://book2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(1);
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(3);
		String email = cell.getStringCellValue();
		System.out.println(email);
		Cell cell2 = row.getCell(4);
		String password = cell2.getStringCellValue();
		System.out.println(password);

	}

}
