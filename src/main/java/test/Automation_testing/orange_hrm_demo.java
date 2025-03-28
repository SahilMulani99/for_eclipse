package test.Automation_testing;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class orange_hrm_demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\"
				+ "Automation_testing\\Resource\\chromedriver.exe");
		
		ChromeDriver gg=new ChromeDriver();
		gg.manage().window().maximize();
		gg.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		gg.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		gg.findElement(By.name("username")).sendKeys("Admin");
		
		gg.findElement(By.name("password")).sendKeys("admin123");
		
		gg.findElement(By.tagName("button")).click();

		gg.findElement(By.className("oxd-userdropdown-tab")).click();

		//for about
		gg.findElement(By.className("oxd-userdropdown-link")).click();
		gg.navigate().refresh();
		
		gg.findElement(By.className("oxd-userdropdown-name")).click();	

		//for support
		gg.findElement(By.linkText("Support")).click();
		gg.navigate().back();
		
		gg.findElement(By.className("oxd-userdropdown-name")).click();	

		// for change password
		gg.findElement(By.linkText("Change Password")).click();
		gg.navigate().back();
		
		gg.findElement(By.className("oxd-userdropdown-name")).click();	

		//for logout
		gg.findElement(By.linkText("Logout")).click();
		
		
		//for again login but with the false credentials

		gg.findElement(By.name("username")).sendKeys("Admin");
		
		gg.findElement(By.name("password")).sendKeys("admin1234");
		
		gg.findElement(By.tagName("button")).click();
		
		
		
		

		
		gg.close();
		
		
	}

}
