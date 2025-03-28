package test.Automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class realme_website {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\Automation_"
				+ "testing\\Resource\\chromedriver.exe");
		
		ChromeDriver gg=new ChromeDriver();
		gg.manage().window().maximize();
		gg.get("https://www.realme.com/in/");
		
		gg.findElement(By.className("avatar")).click();
		gg.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("7219198262");
		gg.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("ggbb@123");
		gg.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/button[1]/span[1][@xpath='1']")).click();
		


	}

}
