package LogintTestVerfication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce1");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		try {
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		System.out.println("Login Successfully");
		}
		catch(Exception e) {
			
			System.out.println("Login Failed");
		}
		driver.quit();
		

	}

}