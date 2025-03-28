package test.Automation_testing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class script {
	
	
	@Test
	void Script_1() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\"
	 		+ "calculator\\Resource\\chromedriver.exe");
			ChromeDriver gg=new ChromeDriver();
			gg.manage().window().maximize();
			
			gg.get("https://fortunecloudindia.com/");
			
			System.out.println("URL of FCT is: "+ gg.getCurrentUrl());
			System.out.println("Title of FCT: "+gg.getTitle());
			
			gg.close();
			

	}
}
