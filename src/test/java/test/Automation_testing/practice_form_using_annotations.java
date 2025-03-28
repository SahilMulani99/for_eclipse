package test.Automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practice_form_using_annotations {
	
	ChromeDriver gg;
	@BeforeSuite
	void form_launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\"
				+ "Automation_testing\\Resource\\chromedriver 134.exe");
		ChromeDriver gg=new ChromeDriver();
		gg.manage().window().maximize();
		gg.get("https://demoqa.com/automation-practice-form");
	}
	@BeforeMethod
	void first_name()
	{
		gg.findElement(By.id("firstName")).click();
		gg.findElement(By.id("firstName")).sendKeys("Sahil");

	}
	
	@Test
	void last_name()
	{
		gg.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[1]/div[4]/input")).sendKeys("Mulani");
	}
	
	@AfterClass
	void email()
	{
		gg.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[2]/div[2]/input")).sendKeys("sahil@gmail.com");
	}

}
