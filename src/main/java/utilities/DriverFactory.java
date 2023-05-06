package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
  public static WebDriver driver;
  
  public void init() {

		System.setProperty("webdriver.chrome.driver","D:\\automation\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
	  driver=new ChromeDriver();
	  
	  
	
}

		
	}

