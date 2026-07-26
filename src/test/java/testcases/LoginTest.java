package testcases;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	@Test
	public void login() {
		String title =lp.getTitle();
		System.out.println(title);
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickLoginButton();
		System.out.println("login successfully");
	}

}
