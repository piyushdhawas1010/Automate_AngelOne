import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDF {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\Sweety\\eclipse-workspace\\Automate_AngelOne\\TestData\\Calls.xlsx");
		Sheet sh=WorkbookFactory.create(fis).getSheet("Sheet1");
		System.out.println(sh.getRow(1).getCell(1).getStringCellValue());

	}

}
