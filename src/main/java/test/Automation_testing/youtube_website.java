package test.Automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube_website {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\Automation_testing"
				+ "\\Resource\\chromedriver.exe");
		
		ChromeDriver ll=new ChromeDriver();
		ll.manage().window().maximize();
		
		ll.get("https://www.youtube.com/");
		
		ll.findElement(By.name("search_query")).sendKeys("DON Diljit Dosanjh");
		ll.findElement(By.xpath("//button[@aria-label='Search']")).click();
		
		ll.findElement(By.className("style-scope ytd-guide-entry-renderer")).click();

         

	}

}
