package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class MyClass {
	static WebDriver driver;
	
	@BeforeSuite
	public static void setup(){
		 driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
	driver.get("http://aflstems.accelfrontline.com");
	driver.manage().window().maximize();
	
	
	}
	
	@Test
	
	public void launch(){
		
		
	}

}
