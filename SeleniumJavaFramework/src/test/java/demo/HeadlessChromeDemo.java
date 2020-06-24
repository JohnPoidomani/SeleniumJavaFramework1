package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {
	
	public static void main(String[] args) throws Exception {
		test();
	}
	
	public static void test() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/john_/eclipse-workspace/SeleniumJavaFramework/drivers/chromedriver/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("window-size=1280,800");
		
		WebDriver driver = new ChromeDriver(options);
				
		driver.get("https:google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		System.out.println("Completed");
		
	}

}
