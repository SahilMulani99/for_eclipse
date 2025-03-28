package linkedin_challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class minus_22 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\"
				+ "Automation_testing\\Resource\\chromedriver133.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.calculator.net/");
		Thread.sleep(2000);
		
				// Minus functionality scenario
				// 986 - 461.5 =				
				// EXPECTED RESULT = 524.5
				
				
				// This line of codes for (986)
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[3]")).click();
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[2]")).click();		
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[3]")).click();
				
				// This line of codes for (-)
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
				
				// This line of code for (461.5)
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();		
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[3]")).click();
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[1]")).click();
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[2]")).click();
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
				
				
				// This line of code for (=)
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();

	}

}
