package linkedin_challenge;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class day_192 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\"
				+ "Automation_testing\\Resource\\chromedriver133.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vinothqaacademy.com/alert-and-popup/");
		
		Thread.sleep(2000);
		
		//ACCEPT AND DISMISS
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/section[3]/div/div[2]/div/div/div/center/button")).click();
		Alert AcceptnDismissAlert = driver.switchTo().alert();
		System.out.println(AcceptnDismissAlert.getText());
		Thread.sleep(2000);
		
		//AcceptnDismissAlert.dismiss();
		
		AcceptnDismissAlert.accept();
		

	}

}
