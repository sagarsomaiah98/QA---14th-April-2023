package testCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;

public class LoginTest extends TestBase{
	
	
	@BeforeMethod
	public void init() throws IOException {
		
		 intialize();
		
	}
	
		
	@Test
	public void verifyValidLogin() throws IOException {
		LoginPage l=new LoginPage();
		l.login("standard_user","secret_sauce");
			
	}
	
	@Test
	public void verifyInValidLogin() throws IOException {	
		LoginPage l=new LoginPage();
		l.login("standard_user","secret_sauce1");	
		
	}
	
	@AfterMethod
public void teardown() {
	
	driver.quit();

}
}
