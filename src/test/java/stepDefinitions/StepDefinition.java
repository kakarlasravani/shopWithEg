package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.DriverFactory;

public class StepDefinition {
	

	LoginPage loginPage=new LoginPage(DriverFactory.driver);


@Given("user launches ShopwithEg site")
public void user_launches_shopwith_eg_site() {
  DriverFactory.driver.get("https://stg.shopwitheg.com/");
}

@When("user clicks login button")
public void user_clicks_login_button() {
  loginPage.clickloginbutton();
	
}
//
//@And("user enters valid credentials")
//public void user_enters_valid_credentials() {
//	loginPage.enterEmail();
//	loginPage.enterPassword();
//}
//
//@Then("user successfully logged in")
//public void user_successfully_logged_in() {
//
//}



@When("user clicks create account")
public void user_clicks_create_account() {
	
   loginPage.clickcreateaccount();
}

@When("user enters credentials less than {int} characters")
public void user_enters_credentials_less_than_characters(Integer int1) {
   
    loginPage.enterFirstName();
    loginPage.enterPassword();
    loginPage.clickCreateAccount();
}
@Then("user gets error message")
public void user_gets_error_message() {
	
	loginPage.enterInvalidFirstName();
	loginPage.enterInvalidPassword();
}

}
