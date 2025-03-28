package demo.auto.website.taskssss;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_method {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sahil\\sahiljavaautomation\\"
				+ "Automation_testing\\Resource\\chromedriver.exe");
		
		ChromeDriver gg=new ChromeDriver();
		gg.manage().window().maximize();
		
		gg.get("https://demo.automationtesting.in/Index.html");
		Thread.sleep(1000);
		
		gg.findElement(By.id("btn2")).click();
		
		//for mouseover switch to
		WebElement we=gg.findElement(By.linkText("SwitchTo"));
		
		Actions act=new Actions(gg);
		act.moveToElement(we).build().perform();
		
		//for mouseover alert
		WebElement rr=gg.findElement(By.linkText("Alerts"));
		Actions act1=new Actions(gg);
		act1.moveToElement(rr).build().perform();
		
		gg.findElement(By.linkText("Alerts")).click();
		
		//for click  for alert box
		gg.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		
		//for clicking on "Ok" in alert box
		Alert al=gg.switchTo().alert();
		al.accept();
		
		//for alert with OK and Cancel
		gg.findElement(By.partialLinkText("Alert with OK & Can")).click();
		gg.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();
		//for clicking on cancel button
		Alert al2=gg.switchTo().alert();
		al2.dismiss();
		
		//for click on alert with textbox
		gg.findElement(By.partialLinkText("Alert with Textb")).click();
		gg.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		//for passing the data into the alert box
		Alert xx=gg.switchTo().alert();
		xx.sendKeys("Anuj Madarchod");
		xx.accept();
		
		
		
		
		

	}

}
