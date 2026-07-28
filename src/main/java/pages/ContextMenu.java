package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.Basepage;

public class ContextMenu extends Basepage{

	public ContextMenu(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active']") private WebElement Search;
	@FindBy(xpath = "//a[normalize-space()='Admin']") private WebElement Admin;
	@FindBy(xpath = "//a[normalize-space()='PIM']") private WebElement PIM;
	@FindBy(xpath = "//a[normalize-space()='Leave']") private WebElement Leave;
	@FindBy(xpath = "//a[normalize-space()='Time']") private WebElement Time;
	@FindBy(xpath = "//a[normalize-space()='Recruitment']") private WebElement Recruitment;
	@FindBy(xpath = "//a[normalize-space()='My Info']") private WebElement MyInfo;
	@FindBy(xpath = "//a[normalize-space()='Performance']") private WebElement Performance;
	@FindBy(xpath = "//a[normalize-space()='Dashboard']") private WebElement Dashboard;
	@FindBy(xpath = "//a[normalize-space()='Directory']") private WebElement Directory;
	@FindBy(xpath = "//a[normalize-space()='Maintenance']") private WebElement Maintenance;
	@FindBy(xpath = "//a[normalize-space()='Claim']") private WebElement Claim;
	@FindBy(xpath = "//a[normalize-space()='Buzz']") private WebElement Buzz;
	
	
	public void enterSearch(String text) {
		Search.sendKeys(text);
	}
	public void clickAdmin() {
		Admin.click();
	}
	public void clickPIM() {
		PIM.click();
	}
	public void clickLeave() {
		Leave.click();
	}
	public void clickTime() {
		Time.click();
	}
	public void clickRecruitment() {
		Recruitment.click();
	}
	public void clickMyInfo() {
		MyInfo.click();
	}
	public void clickPerformance() {
		Performance.click();
	}
	public void clickDashboard() {
		Dashboard.click();
	}
	public void clickDirectory() {
		Directory.click();
	}
	public void ckickMaintenance() {
		Maintenance.click();
	}
	public void clickClaim() {
		Claim.click();
	}
	public void clickBuzz() {
		Buzz.click();
	}
	
	
}
