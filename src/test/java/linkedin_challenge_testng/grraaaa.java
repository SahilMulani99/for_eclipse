package linkedin_challenge_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class grraaaa {

ChromeDriver driver;
	
	@Test(priority=1)
	void chromebrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\swag_labs\\Resource\\chromedriver 134.exe");
		 driver=new ChromeDriver();
		 Thread.sleep(4000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 driver.get("https://vinothqaacademy.com/multiple-windows/");
		 Thread.sleep(2000);
		
	}
	
	@Test(priority=2)
	void username() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"button1\"]")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://vinothqaacademy.com/multiple-windows/");
	}
	
	
}
