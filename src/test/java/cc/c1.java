package cc;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class c1 {
	ChromeDriver driver;
     
	
//
	@BeforeSuite
	void url()
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\"
		 		+ "calculator\\Resource\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.calculator.net/");
		
	

	}
	
}