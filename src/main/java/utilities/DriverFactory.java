package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
  public static WebDriver driver;
  
  public void init() {
	  
		System.setProperty("webdriver.chrome.driver","D:\\automation\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
	  
	
}

		
	}

