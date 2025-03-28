package cc;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class c5 extends c4{

	@AfterSuite
	void div()
	{
		driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r('/')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click(); 
		
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
		
		driver.close();
	}
}