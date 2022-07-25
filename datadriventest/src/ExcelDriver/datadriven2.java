package ExcelDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook.*;

public class datadriven2 {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream file = new FileInputStream("C:\\Users\\admin\\Downloads\\Book 3.xlsx");
		XSSFWorkbook workbook=new workbook(file);
		XSSFSheet sheet=workbook.getSheet("Book 3");

	}

}
