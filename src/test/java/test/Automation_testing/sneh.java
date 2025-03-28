package test.Automation_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sneh {
	String s =System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\"
			+ "Automation_testing\\Resource\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	
	@Test
	void launch()
	{
        driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority=2)
	
	void logout()
	{
		driver.findElement(By.className("oxd-userdropdown-name")).click();	
		
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();
	}
	
	@Test(priority=1)
	void login()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.tagName("button")).click();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

}