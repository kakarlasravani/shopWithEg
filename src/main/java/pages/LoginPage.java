package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.DriverFactory;

public class LoginPage extends DriverFactory {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
		
	}
	
	@FindBy(xpath="//p[text()='login']")
	public WebElement loginButton;
	
	public void clickloginbutton() {
		wait.until(ExpectedConditions.visibilityOfAllElements(loginButton));

		loginButton.click();
		
	}
	//@FindBy(xpath="//input[@type='text']")
	//public WebElement emailField;
	
	//public void enterEmail() {
		
		//emailField.sendKeys("srk5779@gmail.com");
		
	//}
	//@FindBy(xpath="//input[@type='password']")
	//public WebElement passwordField;
	
	//public void enterPassword() {
		//passwordField.sendKeys("123456789");
	//}
	
//	@FindBy(xpath="//button[text()='Create Account']")
//	public WebElement createAccount;
//	public void clickcreateaccount() {
//		wait.until(ExpectedConditions.visibilityOf(createAccount));
//		createAccount.click();
//	}
//	@FindBy(xpath="//input[@name='firstName']")
//	public WebElement firstName;
//	public void enterFirstName() {
//		wait.until(ExpectedConditions.visibilityOf(firstName));
//
//		firstName.sendKeys("s");
//	}
//	@FindBy(xpath="//input[@name='lastName']")
//	public WebElement password;
//	public void enterPassword() {
//		wait.until(ExpectedConditions.visibilityOf(password));
//
//
//		password.sendKeys("1");
//	}
//		@FindBy(xpath="//p[text()='create account']")
//		public WebElement createAccountNow;
//		public void clickCreateAccount() {
//			wait.until(ExpectedConditions.visibilityOf(createAccountNow));
//
//
//			createAccountNow.click();
//			
//			
//		}

	
	
//	
//	@FindBy(xpath="//p[text()='First name must be 2 to 30 characters']")
//	public WebElement invalidFirstName;
//	
//	
//	public void enterInvalidFirstName() {
//		Boolean firstName=invalidFirstName.isDisplayed();
//		System.out.println(firstName);
//	}
//	@FindBy(xpath="//p[text()='Last name must be 2 to 30 characters']")
//	public WebElement invalidPassword;
//	
//	
//	public void enterInvalidPassword() {
//		Boolean password=invalidPassword.isDisplayed();
//		System.out.println(password);
//	}
	

	@FindBy(xpath="//input[@name='email']")
	public WebElement emailId;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath="//p[text()='Invalid Credentials.']")
	public WebElement invalidCredentials;
	
	@FindBy(xpath="//p[text()='Must enter an email address']")
	public WebElement blankErorMessageEmail;
	
	@FindBy(xpath="//p[text()='Enter your password']")
	public WebElement blankErrorPassword;
	
	@FindBy(xpath="//p[text()='sign in']")
	public WebElement signIn;
	
	public void enterInvalidEmail() {
		wait.until(ExpectedConditions.visibilityOfAllElements(emailId));
		emailId.sendKeys("srk@gmail.com");
		
		
	}
	
	public void enterInvalidPassword() {
		wait.until(ExpectedConditions.visibilityOfAllElements(password));
		password.sendKeys("srav@ni123");
	
	}
	public void enterBlankEmail() {
		wait.until(ExpectedConditions.visibilityOfAllElements(emailId));
		emailId.sendKeys("");

	}
	
	public void enterBlankPassword() {
		wait.until(ExpectedConditions.visibilityOfAllElements(password));
		password.sendKeys("");
	
	}
	public void clickSignIn() {
		wait.until(ExpectedConditions.visibilityOfAllElements(signIn));
		signIn.click();

	}
	
	public void verifyBlankErrorMessage() {
		wait.until(ExpectedConditions.visibilityOfAllElements(blankErorMessageEmail));
		Boolean blankEmail=blankErorMessageEmail.isDisplayed();
		System.out.println(blankEmail);
		
	
	}
	
	public void verifyBlankErrorPassword() {
		wait.until(ExpectedConditions.visibilityOfAllElements(blankErrorPassword));
		Boolean blankPassword=blankErrorPassword.isDisplayed();
		System.out.println(blankPassword);
		
	
	}

	public void verifyInvalidCredentails() {
		wait.until(ExpectedConditions.visibilityOfAllElements(invalidCredentials));
		Boolean invalidCredentails=invalidCredentials.isDisplayed();
		System.out.println(invalidCredentails);
	
	
	
}
}
