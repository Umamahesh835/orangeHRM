package testcases;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	@Test(priority=1)
	public void login() {
		String title =lp.getTitle();
		System.out.println(title);
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickLoginButton();
		System.out.println("login successfully");
	}
	
	@Test(priority=0)
	public void verify_logo() {
		boolean logostatus=lp.verifylogo();
		System.out.println(logostatus);
		boolean user=lp.verifyUsernametext();
		System.out.println("username text displayed :"+user);
		boolean passwd = lp.verifypasswordtext();
		System.out.println("passsword text displayed :"+passwd);
		
	}

}
