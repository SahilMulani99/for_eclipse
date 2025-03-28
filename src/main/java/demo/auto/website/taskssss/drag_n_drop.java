package demo.auto.website.taskssss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_n_drop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sahil\\sahiljavaautomation\\Automation_testing\\Resource\\chromedriver.exe");
		ChromeDriver gg=new ChromeDriver();
		gg.manage().window().maximize();	
		gg.get("https://demo.automationtesting.in/Index.html");
		Thread.sleep(1000);
		
		gg.findElement(By.id("btn2")).click();
		
		//for interaction
		WebElement we=gg.findElement(By.linkText("Interactions"));
		Actions ll=new Actions(gg);
		ll.moveToElement(we).build().perform();
		
		//for drag and drop
		WebElement we1=gg.findElement(By.linkText("Drag and Drop"));
		Actions zz=new Actions(gg);
		zz.moveToElement(we1).build().perform();
		
		//for static click
		WebElement we2=gg.findElement(By.xpath("//a[contains(text(),'Static')]"));
		Actions xx=new Actions(gg);
		xx.moveToElement(we2).build().perform();
		we2.click();
		
		
		//for drag and drop the images
		
		//WebElement d1=gg.findElement(By.id("angular"));
		//Actions qq=new Actions(gg);
		//qq.moveToElement(d1).build().perform();
		
		//WebElement d2=gg.findElement(By.xpath("//div[@id='droparea']"));
		
		//for 1st image
		WebElement a1 = gg.findElement(By.id("angular"));
		WebElement a2= gg.findElement(By.id("droparea"));
		
		Actions actn = new Actions(gg);
		
		actn.dragAndDrop(a1, a2).build().perform();
		
		//for 2nd image
		WebElement b1 = gg.findElement(By.id("mongo"));
		//WebElement b2= gg.findElement(By.id("droparea"));
		
		Actions actn2 = new Actions(gg);
		
		actn2.dragAndDrop(b1, a2).build().perform();
		
		//for 3rd image
		WebElement c1 = gg.findElement(By.xpath("//img[@id='node']"));
		//WebElement c2= gg.findElement(By.id("droparea"));
		
		Actions actn3 = new Actions(gg);
		
		actn3.dragAndDrop(c1, a2).build().perform();
		
		
		
		

		
		


	}

}
