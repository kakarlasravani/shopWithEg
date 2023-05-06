package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ShopWomens;
import utilities.DriverFactory;

public class ShopWomen {

	ShopWomens shopwomen=new ShopWomens(DriverFactory.driver);


	@Given("user launches ShopWithEg site")
	public void user_launches_shop_with_eg_site() {
		
	  DriverFactory.driver.get("https://stg.shopwitheg.com/");;
	  
		}

	@When("user clicks shop womens")
	public void user_clicks_shop_womens() {
		shopwomen.clickshopwomens();
	}

	@When("user clicks sort by option")
	public void user_clicks_sort_by_option() {
		shopwomen.clicksortby();
	}

	@When("user selects high to low")
	public void user_selects_high_to_low() {
		shopwomen.clickhightolow();
	}
	

@When("user can see the done button")
public void user_can_see_the_done_button() {
	shopwomen.donebuttondisplay();
}

@When("user can see the done button is in green color")
public void user_can_see_the_done_button_is_in_green_color() {
	shopwomen.donebuttongreen();
}

	@Then("user clicks done")
	public void user_clicks_done() {
		shopwomen.clickdone(); 

}
}
