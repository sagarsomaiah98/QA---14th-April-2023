package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.TestBase;

public class LoginPage extends TestBase {
	
	
	public WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
	public WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
	public WebElement login= driver.findElement(By.xpath("//input[@id='login-button']"));
	
	
	
	public void login(String uname, String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		login.click();
		
		
	}

}
