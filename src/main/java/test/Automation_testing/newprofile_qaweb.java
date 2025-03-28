package test.Automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class newprofile_qaweb {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\"
				+ "Automation_testing\\Resource\\chromedriver.exe");
		
		ChromeDriver ss=new ChromeDriver();
		ss.manage().window().maximize();
		
		ss.get("https://demo.applitools.com/");
		
		//ss.findElement(By.id("username")).sendKeys("jiya");
		//ss.findElement(By.className("form-control")).sendKeys("jiya");
		//ss.findElement(By.xpath("//input[@id='username']")).sendKeys("jiya");
		
		//using id
		ss.findElement(By.cssSelector("input[type='text']")).sendKeys("jiya");
		
		//using id
		//ss.findElement(By.cssSelector("input#password")).sendKeys("1234");
		
		//id#value
		//ss.findElement(By.cssSelector("#password")).sendKeys("oo");
		
		//using class name
		ss.findElement(By.cssSelector("input.form-control")).sendKeys("888888888");
		//using .classname


	}

}
