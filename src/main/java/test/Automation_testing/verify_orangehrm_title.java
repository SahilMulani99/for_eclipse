package test.Automation_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.*;
public class verify_orangehrm_title {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\"
				+ "Automation_testing\\Resource\\chromedriver.exe");
		
		ChromeDriver gg=new ChromeDriver();
		
		gg.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String expected_title="orangehrm";
		
		String actual_title=gg.getTitle();
		
		if (expected_title==actual_title)
		{
			System.out.println("orangehrm title is matching");
		}
		else
		{
			System.out.println("orangehrm title is not matching");
		}
		
		//gg.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		gg.close();
		
		
		
	}

}
