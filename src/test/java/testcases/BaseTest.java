package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import base.DriverFactory;
import utilities.ConfigReader;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver = DriverFactory.initDriver(ConfigReader.getBrowser());
		driver.get(ConfigReader.getBaseUrl());
	}
	
	@AfterTest
	public void tearDown() {
		DriverFactory.quitdriver();
	}

}
