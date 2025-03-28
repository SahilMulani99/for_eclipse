package demo.auto.website.taskssss;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_perform {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sahil\\sahiljavaautomation\\Automation_testing\\Resource\\chromedriver.exe");
		ChromeDriver gg=new ChromeDriver();
		gg.manage().window().maximize();	
		gg.get("https://demo.automationtesting.in/Index.html");
		Thread.sleep(1000);
		
		gg.findElement(By.id("btn2")).click();
		
		WebElement we=gg.findElement(By.linkText("SwitchTo"));
		
		Actions kk=new Actions(gg);
		
		kk.moveToElement(we).build().perform();
		
		gg.findElement(By.linkText("Alerts")).click();
		gg.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();
		
		Alert al=gg.switchTo().alert();
		al.accept();




	}
}