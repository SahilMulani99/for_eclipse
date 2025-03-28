package demo.auto.website.taskssss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class copy_paste_actions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sahil\\sahiljavaautomation\\"
				+ "Automation_testing\\Resource\\chromedriver.exe");
		
		ChromeDriver gg=new ChromeDriver();
		gg.manage().window().maximize();
		
		gg.get("https://demo.automationtesting.in/Index.html");
		Thread.sleep(1000);
		
		gg.findElement(By.id("btn2")).click();
		
		WebElement fn=gg.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]"));
		fn.sendKeys("Sahil");
		
		fn.sendKeys(Keys.CONTROL+"A");
		
		fn.sendKeys(Keys.CONTROL+"C");
		
		
		WebElement ln=gg.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]"));
		
		ln.sendKeys(Keys.CONTROL+"V");
		
		gg.navigate("");
		
		
		
		
		
		
		
		
		
	}

}
