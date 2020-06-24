import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

//import com.sun.tools.javac.util.List;

public class BrowserTest {

	public static void main(String[] args) {

		String projectPath = System.getProperty("user.dir");
		//System.out.println("projectPath : "+projectPath);
		System.out.println(projectPath);
		
		//System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", projectPath+"/drivers/iedriver/IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		//driver.get("http://seleniumhq.org/");
		
		driver.get("http://google.com/");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.findElement(By.id("gsr")).click();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abcd");
		
		//driver.findElement(By.xpath("//input[@id='fakebox-input']")).sendKeys("efgh");	
		//WebElement textBox = driver.findElement(By.id("fakebox-input"));
		//textBox.sendKeys("Automation");		
		//List<WebElement>listOfInputElements = driver.findElements(By.xpath("//input"));		
		//int count = listOfInputElements.size();	
		//System.out.println("Count of Input elements : "+count);
		
		try {
			Thread.sleep(5000);			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		//driver.quit();
	
	}
	
}