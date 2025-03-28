package test.Automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb_login {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\Automation_testing\\Resource\\chromedriver.exe");
	
		ChromeDriver gg= new ChromeDriver();
		
		gg.manage().window().maximize();
		
		gg.get("https://www.facebook.com/");
		
		gg.findElement(By.id("email")).sendKeys("sahilmulani7559@proton.me");
		gg.findElement(By.id("pass")).sendKeys("Sahil@7559");
	    gg.findElement(By.name("login")).submit();
	    
	}}