package demo.auto.website.taskssss;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
public class xd {

	public static void main(String[] args) {
		

		 {
		        
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\Automation_testing\\Resource\\chromedriver.exe");

		        WebDriver driver = new ChromeDriver();

		        try {
		            
		            driver.manage().window().maximize();

		            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		            driver.get("https://www.cravitaindia.com/"); 

		            
		            WebElement add = driver.findElement(By.xpath("/html[1]/body[1]/footer[1]/div[1]/div[1]/div[4]/p[1]"));
		            String address = add.getText();
		            
		            driver.get("https://demo.automationtesting.in/Register.html");

		            
		            WebElement addbox = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]"));
		            addbox.sendKeys(address); 

		            

		        } catch(Exception e)  {
		        } finally {
		           
		        }
		    }
		}

	}

