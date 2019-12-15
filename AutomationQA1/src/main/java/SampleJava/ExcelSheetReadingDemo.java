package SampleJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetReadingDemo {

	public static void main(String[] args) throws Exception {
		
		XSSFWorkbook book;
		XSSFSheet sheet;
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+
				"\\resources\\SampleStud.xlsx");
		
		book=new XSSFWorkbook(fis);
		sheet=book.getSheet("Sheet1");
		int row=sheet.getLastRowNum();
		int col=sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<=row;i++){
			for(int j=0;j<col;j++){
				String data=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data+"|");
			}
			System.out.println("");
		}

		book.close();
	}

}
