package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import driver.DriverFactory;
import pages.Loginpage;
import utilities.ConfigReader;

public class BaseTest {
	
	public WebDriver driver;
	public Loginpage lp;
	
	@BeforeTest
	public void setUp() {
		driver = DriverFactory.initDriver(ConfigReader.getBrowser());
		driver.get(ConfigReader.getBaseUrl());
		lp = new Loginpage(driver);
	}
	
	@AfterTest
	public void tearDown() {
		DriverFactory.quitdriver();
	}

}
