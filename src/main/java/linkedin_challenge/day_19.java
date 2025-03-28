package linkedin_challenge;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class day_19 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\"
				+ "Automation_testing\\Resource\\chromedriver133.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vinothqaacademy.com/alert-and-popup/");
		
		Thread.sleep(2000);
		
		//single alert
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/section[3]/div/div[1]/div/div/div/center/button")).click();
		Alert simpAlert = driver.switchTo().alert();
		System.out.println(simpAlert.getText());
		Thread.sleep(2000);
		simpAlert.accept();
		Thread.sleep(5000);
		
		
		//accept and dismiss
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/section[3]/div/div[2]/div/div/div/center/button")).click();
		Alert AnDAlert = driver.switchTo().alert();
		System.out.println(AnDAlert.getText());
		Thread.sleep(2000);
		AnDAlert.dismiss();
		Thread.sleep(5000);
		
		//send text alert box
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/section[3]/div/div[3]/div/div/div/center/button")).click();
		Thread.sleep(2000);
		Alert txtAlert = driver.switchTo().alert();
		System.out.println(txtAlert.getText());
		Thread.sleep(2000);
		txtAlert.sendKeys("Yes");
		txtAlert.accept();
		Thread.sleep(2000);
		
	}

}
