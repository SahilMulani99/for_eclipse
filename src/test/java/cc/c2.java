package cc;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class c2 extends c1 {
	
	@BeforeClass
	void add() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r('+')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
		
	}
	
}