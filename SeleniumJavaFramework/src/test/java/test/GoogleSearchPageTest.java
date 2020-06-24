package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;//private makes it only available to this class and class available to the project 
	
	public static void main(String[] args) { //'main' method
		
		googleSearchTest();
	}
	
	public static void googleSearchTest() { //googleSearchTest function
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");	
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		
		driver.get("https://google.com");
		searchPageObj.setTextInSearchBox("A B C D");
		searchPageObj.clickSearchButton();
		
		driver.close();
		System.out.println("Test passed!");
		System.out.println("End of test!");
	}

}