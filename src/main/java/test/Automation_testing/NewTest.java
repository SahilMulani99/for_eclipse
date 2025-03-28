package test.Automation_testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	
  @Test
  public void f() {
	  System.out.println("this is test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is after Method");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is before Class");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is after Class");

  }

}
