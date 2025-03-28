package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class id_locator_1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\Automation_"
				+ "testing\\Resource\\chromedriver.exe" );
		
		
		ChromeDriver gg=new ChromeDriver();
		
		gg.manage().window().maximize();
		
		//here are the link of getting access for the testing ur project or testing, web url paste here as it is.
		gg.get("https://www.facebook.com/");
		
		
		//here are next step is object.findElement(By.id) work details- go pasted url and inspect and there are 
		//specific column,tab or the you want to target button id copy from the code and paste here.
		//next is sendKeys method for provide data for the ongoing process for testing 
		//some test scenarios gives to you
		
		//finding element using by locator.
		gg.findElement(By.id("email")).sendKeys("sahil@gmail.com");
		gg.findElement(By.id("pass")).sendKeys("sahil");
		
		//some elements didn't detect or found by some locator so using the different locator to find out it
		gg.findElement(By.linkText("Log in")).click();
		gg.navigate().back();
		gg.findElement(By.linkText("Forgotten password?")).click();
		gg.findElement(By.linkText("Cancel")).click();
		gg.findElement(By.id("email")).sendKeys("FAXXXXX");
		
		//gg.findElement(By.tagName("a"));
		//gg.navigate().back();
		//gg.navigate().refresh();
		
		//gg.navigate().to("https://ladakibahin.maharashtra.gov.in/");
		
		//gg.close();
		//gg.quit();
		
	}

}
