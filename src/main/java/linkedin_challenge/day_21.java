package linkedin_challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class day_21 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\"
				+ "Automation_testing\\Resource\\chromedriver133.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.wpeverest.com/user-registration/column-1/");
		Thread.sleep(2000);

		
		//GUEST REGISTRATION FORM
		
		//username box 
		driver.findElement(By.id("user_login")).sendKeys("Anushka@124##");
		
		//email box
		driver.findElement(By.cssSelector("#user_email")).sendKeys("anushka18.com");
		
		//user password
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Anu@18");
		
		//confirm user password
		driver.findElement(By.xpath("//*[@id=\"user_confirm_password\"]")).sendKeys("Anu@1818");
		
		//submit button
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-47\"]/form/div[2]/button")).click();
		
		
		
	}

}
