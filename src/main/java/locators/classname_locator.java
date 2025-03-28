package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class classname_locator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\"
				+ "Automation_testing\\Resource\\chromedriver.exe");
		
		ChromeDriver gg=new ChromeDriver();
		gg.manage().window().maximize();
		
		gg.get("https://www.facebook.com/");
		
		//gg.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("sahilmulani7559@proton.me");
		//gg.findElement(By.className("inputtext _55r1 _6luy _9npi")).sendKeys("Sahil@7559");
		//gg.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).submit();
		//gg.close();
		
		gg.findElement(By.tagName("input")).sendKeys("sahilmulani7559@proton.me");


	}

}
