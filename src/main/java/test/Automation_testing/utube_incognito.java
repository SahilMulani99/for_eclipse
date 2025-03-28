package test.Automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class utube_incognito {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\"
				+ "Automation_testing\\Resource\\chromedriver.exe");
		
		ChromeDriver ss=new ChromeDriver();
		ss.manage().window().maximize();
		
		ss.get("https://www.youtube.com/");
		
		ss.findElement(By.name("search_query")).sendKeys("tum itna jo muskura rahe ho");
		
		ss.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/div[2]/ytd-masthead[1]/div[4]/div[2]/yt-searchbox[1]/button[1]")).click();
		
		ss.findElement(By.xpath("//body/ytd-app[1]/div[2]/ytd-video-preview[1]/div[1]/div[2]/a[1]/div[2]/ytd-player[1]/div[1]/div[1]/div[1]/video[1]")).click();

	}

}
