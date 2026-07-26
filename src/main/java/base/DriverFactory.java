package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class DriverFactory {
	
	protected static WebDriver driver;

	public static WebDriver initDriver(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}else {
			System.out.println("No default browser found");
		}
		return driver;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void quitdriver() {
		driver.close();
	}
}
