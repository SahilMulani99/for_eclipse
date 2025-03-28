package test.Automation_testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations {
	
	@BeforeClass
	void first()
	{
		System.out.println("hello");
	}
	
	@AfterClass
	void second()
	{
		System.out.println("good morning");
	}
	@Test
	void third()
	{
		System.out.println("everyone");
	}
	/*
	 * @Test void fourth() { System.out.println("gg"); }
	 */

}
