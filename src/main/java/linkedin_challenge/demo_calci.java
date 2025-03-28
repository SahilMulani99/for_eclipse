package linkedin_challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_calci {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\"
				+ "Automation_testing\\Resource\\chromedriver133.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rapido.bike/Home");
		Thread.sleep(2000);
		

		driver.findElement(By.xpath("//*[@id=\"__next\"]/html/div[3]/div/div[1]/div/div/div/div/div[2]/div[1]/input")).sendKeys("Fortune Shubhan");
	
		driver.findElement(By.xpath("//*[@id=\"__next\"]/html/div[3]/div/div[1]/div/div/div/div/div[2]/div[2]/input")).sendKeys("Fortune Cloud");
	
		
	}

}
