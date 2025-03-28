package cc;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//perform add and sub using parameters

public class task1 {
	
	@Parameters({"no1, no2"})
	@Test
	void add(int num1, int num2)
	{
		System.out.println("addition of two number is: +(num1+num2)" );
	}


}