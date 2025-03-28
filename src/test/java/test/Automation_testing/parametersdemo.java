package test.Automation_testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametersdemo {
		
		@Parameters({"no"})
		@Test
		void display(int number)
		{
			System.out.println("this is my phone number: "+number);
		}
	





}
	
	


