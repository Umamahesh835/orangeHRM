package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.Basepage;

public class Adminpage extends Basepage{

	public Adminpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@fdprocessedid='j5ol65']") private WebElement Username;
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]") private WebElement UserRole;
	@FindBy(xpath = "//input[@placeholder='Type for hints...']") private WebElement EmployeeName;
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]") private WebElement Status;
	
	public void searchUsername(String text) {
		Username.sendKeys(text);
	}
	public void SelectUserRole(String text) {
		Select s =new Select(UserRole);
		s.selectByVisibleText(text);
	}
	public void enterEmployeeName(String text) {
		EmployeeName.sendKeys(text);
	}
	public void selectStatus(String text) {
		Select status = new Select(Status);
		status.selectByVisibleText(text);
	}
}
