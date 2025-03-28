package linkedin_challenge;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class day_193 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\"
				+ "Automation_testing\\Resource\\chromedriver133.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vinothqaacademy.com/alert-and-popup/");
		
		Thread.sleep(2000);
		
		//SEND TEXT IN ALERT BOX
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/section[3]/div/div[3]/div/div/div/center/button")).click();
		Thread.sleep(2000);
		Alert textAlert = driver.switchTo().alert();
		System.out.println(textAlert.getText());
		Thread.sleep(2000);
		
		textAlert.sendKeys("No");
		
		textAlert.accept();
		
		

	}

}
