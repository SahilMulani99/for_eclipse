package test.Automation_testing;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class data_provider_annotations {
  @Test(dataProvider = "dp")
  public void f(String uname, String pass) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\Automation_testing\\Resource\\chromedriver.exe");
	  
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("https://www.saucedemo.com/v1/");
	  driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/form/input[1]")).sendKeys(uname);
	  driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/form/input[2]")).sendKeys(pass);
	  driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/form/input[3]")).click();
	  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/div/button")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div[1]/nav/a[3]")).click();
	  driver.quit();
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "standard_user", "secret_sauce" },
      new Object[] { "locked_out_user", "secret_sauce" },
      new Object[] { "problem_user", "secret_sauce" },

    };
  }
}
