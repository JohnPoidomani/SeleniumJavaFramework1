package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGParallelTestingDemo {
	
	WebDriver driver=null;
	
	@Test(threadPoolSize=3, invocationCount=3, timeOut=100)
	public void test1() throws Exception { //Method
		System.out.println("I am inside Test 1 | "+Thread.currentThread().getId());
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		//driver = new ChromeDriver();
		//driver.get("https://google.com");
		//Thread.sleep(3000);
		//driver.close();	
	}
	
	@Test
	public void test2() throws Exception { //Method
		System.out.println("I am inside Test 2 | "+Thread.currentThread().getId());
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		//driver = new ChromeDriver();
		//driver.get("https://seleniumhq.org");
		//Thread.sleep(3000);
		//driver.close();
		
	}
	
	@Test
	public void test3() throws Exception { //Method
		System.out.println("I am inside Test 3 | "+Thread.currentThread().getId());
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		//driver = new ChromeDriver();
		//driver.get("https://seleniumhq.org");
		//Thread.sleep(3000);
		//driver.close();
		
	}

}
