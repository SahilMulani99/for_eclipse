package cc;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class c4 extends c3 {
	
	@AfterClass
	void multi()
	{
		driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r('*')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
	}
	

}