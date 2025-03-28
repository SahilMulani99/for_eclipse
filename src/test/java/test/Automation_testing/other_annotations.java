package test.Automation_testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class other_annotations {
	
	@BeforeClass
	void a()
	{
		System.out.println("before class");
	}
	
	
	@AfterSuite
	void b()
	{
		System.out.println("After Suite");
	}
	
	@BeforeClass
	void c()
	{
		System.out.println("Before Class");
	}
	
	
	
	@Test
	void d()
	{
		System.out.println("test");
	}
	
	
	@BeforeSuite
	void e()
	{
		System.out.println("BeforeSuite");
	}
	
	
	@AfterClass
	void f()
	{
		System.out.println("After Class");
	}
	
	
	@BeforeTest
	void g()
	{
		System.out.println("Before Test");
	}
	
	
	@BeforeTest
	void h()
	{
		System.out.println("before class");
	}
	
	
	@AfterTest
	void i()
	{
		System.out.println("After Test");
	}
	

}
