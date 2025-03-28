package test.Automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo_testng {
	
	@Test
	void s()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\"
	 		+ "calculator\\Resource\\chromedriver.exe");
			ChromeDriver gg=new ChromeDriver();
			gg.manage().window().maximize();
			
			gg.get("https://www.calculator.net/");
			
			
			//for calculating age with using age calculator 24 Dec 2000 to Today
			gg.findElement(By.linkText("Age Calculator")).click();
			gg.findElement(By.xpath("/html/body/div[3]/div[1]/div[3]/form/table/tbody/tr[1]/td[2]/tabl/tbody/tr/td[1]/select")).click();
			gg.findElement(By.xpath("/html/body/div[3]/div[1]/div[3]/form/table/tbody/tr[1]/td[2]/table/tbody/tr/td[1]/select/option[12]")).click();
			gg.findElement(By.xpath("/html/body/div[3]/div[1]/div[3]/form/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/select")).click();
			gg.findElement(By.xpath("/html/body/div[3]/div[1]/div[3]/form/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/select/option[24]")).click();
			gg.findElement(By.xpath("/html/body/div[3]/div[1]/div[3]/form/table/tbody/tr[1]/td[2]/table/tbody/tr/td[3]/input")).sendKeys(Keys.CONTROL+"A");
			gg.findElement(By.xpath("/html/body/div[3]/div[1]/div[3]/form/table/tbody/tr[1]/td[2]/table/tbody/tr/td[3]/input")).sendKeys(Keys.CONTROL+"X");
			gg.findElement(By.xpath("/html/body/div[3]/div[1]/div[3]/form/table/tbody/tr[1]/td[2]/table/tbody/tr/td[3]/input")).sendKeys("2000");
			gg.findElement(By.xpath("/html/body/div[3]/div[1]/div[3]/form/table/tbody/tr[3]/td[2]/input")).click();
			
			System.out.println("It's first test case");
			}
	@Test
	void b()
	{
		System.out.println("It's second test case");
		
	}
	
	

}
