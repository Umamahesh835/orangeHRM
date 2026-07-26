package testcases;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	@Test
	public void login() {
		String title =lp.getTitle();
		System.out.println(title);
	}

}
