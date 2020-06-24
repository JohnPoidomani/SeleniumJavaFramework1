package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class ExcelDataProvider {

	static WebDriver driver=null;

	@BeforeTest
	public void setUpTest() { //First function - Setup
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		PropertiesFile.getProperties();

		//if(browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");	
		driver = new ChromeDriver();		
		//}
		//else if(browserName.equalsIgnoreCase("firefox")) {
		//	System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		//	driver = new FirefoxDriver();
		//	}
		//	Logger.info("Browser started");//Added
	}

	@Test(dataProvider="test1data")
	public void test1(String username, String password) throws Exception { //Function named 'test1'
		System.out.println(username+" | "+password);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(3000);

	}

	@DataProvider(name = "test1data")
	public Object getData() { // Function named 'getData'
		String excelPath = "C:/Users/john_/eclipse-workspace/SeleniumJavaFramework/excel/data.xlsx";		
		Object data[][] = testData(excelPath, "Sheet1");
		return data;

	}

	public Object[][] testData(String excelPath, String sheetName) {

		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);

		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();

		Object data[][] = new Object[rowCount-1][colCount];

		for(int i=1; i<rowCount; i++) { //i=1 to skip the first row with the column 'header name'
			for(int j=0; j<colCount; j++) {

				String cellData = excel.getCellDataString(i, j); //gets the data starting at row 1 column 0
				//System.out.print(cellData+" | ");	
				data[i-1][j] = cellData;
			}	
			System.out.println();
		}
		return data;
	}
}