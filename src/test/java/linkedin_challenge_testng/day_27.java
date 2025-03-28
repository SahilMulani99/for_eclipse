package linkedin_challenge_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class day_27 {
	
	ChromeDriver driver;
	
	@Test(priority=1)
	void chromebrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\swag_labs\\Resource\\chromedriver 134.exe");
		 driver=new ChromeDriver();
		 Thread.sleep(4000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 driver.get("https://practicetestautomation.com/practice-test-login/");
		 Thread.sleep(2000);
		
	}
	
	
	//this line of code for the username box
	@Test(priority=3)
	void username() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
		Thread.sleep(2000);
	}
	
	
	//this line's of code for the password box
	@Test(priority=2)
	void password() throws InterruptedException
	{		 
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		 Thread.sleep(2000);
	}
	
	
	//this line's of code for the click on login button
	@Test(priority=4)
	void login_button() throws InterruptedException
	{		 		 
		 driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		 Thread.sleep(2000);
	}
	
	
	
	//this line's of code for the logout button
	@Test(priority=5)
	void logout_button() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
		Thread.sleep(2000);
	}
}
