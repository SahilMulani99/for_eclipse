package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class gmail {
	
	@Given("user should be registered")
	public void precondition()
	{
		System.out.println("login");
	}
	
	@When("user enter valid username & password, click on login button")
	public void credentials()
	{
		System.out.println("username: Admin");
		System.out.println("password: Admin123");
	}
	
	@Then("login should be successfull")
	public void end()
	{
		System.out.println("login successfull");
	}

}
