package linkedin_challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_gg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\"
				+ "Automation_testing\\Resource\\chromedriver133.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.geodatasource.com/software/country-region-dropdown-menu-demo");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		WebElement droppcountryntElement=driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/div[2]/form/div[1]/div/select"));		
	    Select dropcountry=new Select(droppcountryntElement);
		
	    //select by visible text
	    
	    //dropcountry.selectByVisibleText("India");
	    
	    //select by value
	    
	   // dropcountry.selectByValue("Dominica");
	    
	    //select by index
	    
	    dropcountry.selectByIndex(9);

	}

}
