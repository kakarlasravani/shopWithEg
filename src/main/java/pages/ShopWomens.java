package pages;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.DriverFactory;



	public class ShopWomens extends DriverFactory {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		JavascriptExecutor js=(JavascriptExecutor)driver;

		public ShopWomens(WebDriver driver) {
			PageFactory.initElements(driver,this);
			

	}
		
	
@FindBy(xpath="//div[@type='white']")
public WebElement shopwomens;

public void clickshopwomens()
{
	wait.until(ExpectedConditions.elementToBeClickable(shopwomens));
	js.executeScript("arguments[0].click()",shopwomens);
}
@FindBy(xpath="//p[text()='Sorted by:']")
public WebElement sortby;

public void clicksortby() {
	wait.until(ExpectedConditions.visibilityOfAllElements(sortby));
	sortby.click();

}

@FindBy(xpath="//p[text()='Price High to Low']")
public WebElement hightolow;

public void clickhightolow() {
	wait.until(ExpectedConditions.visibilityOfAllElements(hightolow));

	hightolow.click();
}
@FindBy(xpath="//p[text()='Done']")
public WebElement donedisplay;

public void donebuttondisplay() {
	wait.until(ExpectedConditions.visibilityOfAllElements(donedisplay));
Boolean displaybutton=donedisplay.isDisplayed();
System.out.println("displaybutton");
}
@FindBy(xpath="//p[text()='Done']")
public WebElement donegreencolor;

public void donebuttongreen() {
	wait.until(ExpectedConditions.visibilityOfAllElements(donegreencolor));
	String button=donegreencolor.getCssValue("color");
	System.out.println(button);
}



@FindBy(xpath="//p[text()='Done']")
public WebElement done;
public void clickdone() {
	wait.until(ExpectedConditions.visibilityOfAllElements(done));

	done.click();
}
}
