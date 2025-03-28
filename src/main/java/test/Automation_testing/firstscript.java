package test.Automation_testing;

import org.openqa.selenium.chrome.ChromeDriver;

public class firstscript {

	public static void main(String[] args) {
		
	//configuration of webdriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sahil\\sahiljavaautomation\\Automation_testing\\Resource\\chromedriver.exe");

		//launch the webdriver (creation of webdriver object)
		ChromeDriver gg=new ChromeDriver();
		
		
		gg.get("https://ladakibahin.maharashtra.gov.in/");
		gg.navigate().to("https://www.rrbapply.gov.in/#/auth/landing");
		gg.quit();
		


	}

}
