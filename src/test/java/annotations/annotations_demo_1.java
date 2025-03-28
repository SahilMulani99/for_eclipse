package annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations_demo_1 {
	
	@BeforeMethod
	void login()
	{
		System.out.println("this is login...");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("this is search...");
	}
	
	@Test(priority=2)
	void advance_search()
	{
		System.out.println("this is a advance search...");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("this is logout...");
	}

}
