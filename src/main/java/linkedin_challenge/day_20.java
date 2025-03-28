package linkedin_challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class day_20 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\"
				+ "Automation_testing\\Resource\\chromedriver133.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(2000);
		
		
		//login page functionality testing
		
		//access for username box
		driver.findElement(By.id("username")).sendKeys("Sahil");
		Thread.sleep(1000);
		
		//access for password box
		driver.findElement(By.id("password")).sendKeys("Sahil1234");
		Thread.sleep(1000);
		
		//click on login button
		driver.findElement(By.className("btn")).click();
		Thread.sleep(1000);
		
		//click for logout button
		driver.findElement(By.linkText("Log out")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
