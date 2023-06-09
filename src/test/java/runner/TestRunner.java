package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"D:\\automation\\ShopWithEg\\src\\test\\resources\\features\\login.feature"},
		glue= {"stepDefinitions"},
		plugin= {"pretty","html:target/cucumberReport.html"}
		)
		
public class TestRunner {

}
