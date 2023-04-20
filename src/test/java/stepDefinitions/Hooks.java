package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.DriverFactory;

public class Hooks {
	
	DriverFactory driverFactory=new DriverFactory();
	
	@Before
	public void BeforeMethod() {
		driverFactory.init();
		
	}
@After
public void AfterMethod() {
	DriverFactory.driver.close();
	
}
}
