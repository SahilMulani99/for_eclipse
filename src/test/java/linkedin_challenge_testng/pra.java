package linkedin_challenge_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pra {
	
	ChromeDriver gg;
	
	@Test(priority=1)
	void login_1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\swag_labs\\Resource\\chromedriver 134.exe");
		
		//this is a object for accessing chrome
		gg=new ChromeDriver();
		
		//this code for maximize window
		Thread.sleep(2000);
		gg.manage().window().maximize();
		
		//this is url for our testing
		Thread.sleep(2000);
		gg.get("https://www.saucedemo.com/v1/");
		
		//this line of code for find user name box and send user name into the user name box
		Thread.sleep(1000);
		gg.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//this line of code for find password box and send password into the password box
		Thread.sleep(1000);
		gg.findElement(By.id("password")).sendKeys("secret_sauce");
		
		//this code for click on login button
		Thread.sleep(1000);
		gg.findElement(By.id("login-button")).click();

		
	}
	
}