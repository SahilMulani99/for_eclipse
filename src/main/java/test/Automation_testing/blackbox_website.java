package test.Automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class blackbox_website {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\Automation_testing"
				+ "\\Resource\\chromedriver.exe");
		
		ChromeDriver gg=new ChromeDriver();
		
		
		
		gg.manage().window().maximize();
		
		gg.get("https://www.blackbox.ai/");
		
		gg.findElement(By.id("chat-input-box")).sendKeys("anuj! ");
		//gg.findElement(By.linkText("Already have an account?")).click();
		gg.findElement(By.xpath("")).click();
		
		
		
	}

}
