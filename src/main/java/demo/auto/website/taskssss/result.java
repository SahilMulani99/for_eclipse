package demo.auto.website.taskssss;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class result {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\"
				+ "Automation_testing\\Resource\\chromedriver.exe");
		
		ChromeDriver gg=new ChromeDriver();
		gg.manage().window().maximize();
		
		gg.get("https://onlineresults.unipune.ac.in/Result/Dashboard/Default");
		
		gg.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[4]/td[4]/a[1]/input[1]")).click();
		
		Alert xx=gg.switchTo().alert();
		xx.sendKeys("8");
		xx.sendKeys("Najma");
		xx.accept();
	}

}
