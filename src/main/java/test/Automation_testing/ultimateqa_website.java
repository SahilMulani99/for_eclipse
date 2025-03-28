package test.Automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ultimateqa_website {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\Automation_testing"
				+ "\\Resource\\chromedriver.exe");
		
		ChromeDriver ll=new ChromeDriver();
		ll.manage().window().maximize();
		
		ll.get("https://courses.ultimateqa.com/users/sign_in");
		
		//email box
		ll.findElement(By.xpath("//input[@type='email']")).sendKeys("vidya@gmail.com");
		//password box
		ll.findElement(By.xpath("//input[@type='password']")).sendKeys("vidya1234");
		
		//ll.findElement(By.xpath("//button[@type='submit']")).click();
		//sign in button
		ll.findElement(By.xpath("//div/button[@type='submit']")).click();
		
		ll.findElement(By.className("dropdown__toggle-button")).click();
		

	}

}
