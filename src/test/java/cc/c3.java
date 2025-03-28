package cc;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class c3 extends c2{
	
	@Test
	void add() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r('-')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
		
	}

}