package seleniumtestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login_parameter {
	@Parameters({"username","password"})
	@Test
	public void pass_values(String username,String password) {
		System.out.println(username);
		System.out.println(password);
		
	}

}
