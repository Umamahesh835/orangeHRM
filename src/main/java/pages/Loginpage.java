package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage{

	public Loginpage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//div/img[@alt='company-branding']") private WebElement CompanyBrandname;
	@FindBy(xpath = "//div[@class='orangehrm-login-logo']") private WebElement Logo;
	@FindBy(xpath = "//h5[normalize-space(text='Login')]")private WebElement Title;
	
	public String getTitle() {
		return Title.getText();
	}

}
