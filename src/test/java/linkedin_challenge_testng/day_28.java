package linkedin_challenge_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class day_28 {
	
ChromeDriver driver;
	
	@Test(priority=1)
	void chromebrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\swag_labs\\"
				+ "Resource\\chromedriver 134.exe");
		 driver=new ChromeDriver();
		 Thread.sleep(4000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
		 driver.get("https://automationexercise.com/");
		 
		
	}
	
	@Test(priority=2)
	void item_1() throws InterruptedException
	{
		//view product description
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[4]/div/div[2]/ul/li/a")).click();
		
		//add to cart item 1
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
		
		//click on continue shopping
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();
	}
	
	@Test(priority=3)
	void cart() throws InterruptedException
	{	
		//click on cart
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a/i")).click();
		
	}
	
	@Test(priority=4)
	void checkout() throws InterruptedException
	{	
		
		//proceed to checkout process
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a")).click();
		
		//login section
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a/u")).click();
	
		
	}
}
