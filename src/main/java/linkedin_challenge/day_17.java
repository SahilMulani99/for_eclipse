package linkedin_challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class day_17 { //drop down

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\"
				+ "Automation_testing\\Resource\\chromedriver133.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.geodatasource.com/software/country-region-dropdown-menu-demo");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/div[2]/form/div[1]/div/select")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/div[2]/form/div[1]/div/select/option[102]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]")).click();
	}

}
