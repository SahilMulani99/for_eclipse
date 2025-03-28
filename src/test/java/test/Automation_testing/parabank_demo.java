package test.Automation_testing;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class parabank_demo {
	
	ChromeDriver cd;
//asertion in testng 
	@Test(priority=1)
	public void start() {
	
	WebElement uname= cd.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[1]/input"));
	System.out.println(uname.isDisplayed());
	Assert.assertEquals(uname.getText(), "username");
	
	}
	@Test(priority=2)
	void username_highlight()
	{
		WebElement u_high=cd.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/p[1]/b"));
		System.out.println(u_high.isDisplayed());
		Assert.assertEquals(u_high.getText(), "Username");
		
	}
	
	@Test(priority=3)
	public void title() {
	
	System.out.println(cd.getTitle());
	
	Assert.assertEquals(cd.getTitle(), "ParaBank | Welcome | Online Banking", "hello this is title check");
	
	}
	
	
	
	
	
}