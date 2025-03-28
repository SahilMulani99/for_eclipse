package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class examform {
	
	WebDriver gg;
	@Given("exam registration website should be launched")
	public void websitelaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\Automation_testing\\Resource\\chromedriver.exe");
		ChromeDriver gg=new ChromeDriver();
		gg.manage().window().maximize();
		gg.get("https://demo.wpeverest.com/user-registration/simple-registration-form/");
	}
	
	@When("enter first name and last name of student")
	public void name()
	{
		gg.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/main/article/div/div/div/form/div[1]/div[1]/div/div/span/input")).sendKeys("anu");
		gg.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/main/article/div/div/div/form/div[1]/div[2]/div/div/span/input")).sendKeys("sharma");
	}

}
