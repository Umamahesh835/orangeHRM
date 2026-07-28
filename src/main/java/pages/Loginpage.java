package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.Basepage;

public class Loginpage extends Basepage{

	public Loginpage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//div/img[@alt='company-branding']") private WebElement CompanyBrandname;
	@FindBy(xpath = "//div[@class='orangehrm-login-logo']") private WebElement Logo;
	@FindBy(xpath = "//h5[normalize-space(text='Login')]")private WebElement Title;
	@FindBy(xpath = "//input[@name='username']") private WebElement Username;
	@FindBy(xpath = "//input[@name='password']") private WebElement Password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement LoginButton;
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']") private WebElement Forgotpassword;
	@FindBy(xpath = "//div/p[1][@class='oxd-text oxd-text--p']") private WebElement Usernametext;
	@FindBy(xpath = "//div/p[2][@class='oxd-text oxd-text--p']") private WebElement Passwordtext;
	
	public String getTitle() {
		return Title.getText();
	}
	
	public void enterUsername(String text) {
		Username.sendKeys(text);
	}
	public void enterPassword(String password) {
		Password.sendKeys(password);
	}
	public void clickLoginButton() {
		LoginButton.click();
	}
	public void clickForgotpassword() {
		Forgotpassword.click();
	}
	public boolean verifylogo() {
		return Logo.isDisplayed();
	}
	public boolean verifyUsernametext() {
		return Usernametext.isDisplayed();
	}
	public boolean verifypasswordtext() {
		return Passwordtext.isDisplayed();
	}
	

}
