package annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assert_soft {
	
		ChromeDriver gg;
		void s(){
	 
	//asertion in testng
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\Automation_testing\\Resource\\chromedriver.exe");
		 gg=new ChromeDriver();
		gg.get("https://parabank.parasoft.com/parabank/index.htm");
		
		
		}
		@Test (priority=1)
		
		void jj() {
			
			SoftAssert kk=new SoftAssert();
	
	
		System.out.println(gg.getCurrentUrl());
		kk.assertEquals(gg.getCurrentUrl(), "https://parabank.parasoft.com/parabank/index.htm");
		
		}
		}