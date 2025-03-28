package test.Automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb_new {
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\Automation_testing\\Resource\\chromedriver.exe");
		ChromeDriver gg=new ChromeDriver();
		gg.manage().window().maximize();

		
		gg.get("https://www.facebook.com/r.php/");
		gg.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sahil");
		gg.findElement(By.xpath("//input[@name='lastname']")).sendKeys(" Mulani");
		
		Select hh=new Select(gg.findElement(By.id("day")));
		hh.selectByVisibleText("15");
		
		
		
		
	

	}
	

}