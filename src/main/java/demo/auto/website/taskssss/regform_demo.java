package demo.auto.website.taskssss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class regform_demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\"
				+ "Automation_testing\\Resource\\chromedriver.exe");
		
		ChromeDriver gg=new ChromeDriver();
		gg.manage().window().maximize();
		
		gg.get("https://demo.automationtesting.in/Index.html");
		
		gg.findElement(By.id("btn2")).click();
		
		//for first name
		gg.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Sahil");
		//for last name
		gg.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Mulani");
		//for address
		gg.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("AP. Pargaon Tal.Khandala Dist.Satara 412802");
		//for email address
		gg.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("sahil@gmail.com");
		//for phone number
		gg.findElement(By.xpath("//input[@type='tel']")).sendKeys("9181716151");
		//for gender
		gg.findElement(By.xpath("//input[@value='FeMale']")).click();
		//for hobbies
		gg.findElement(By.id("checkbox1")).click();   //Cricket
		gg.findElement(By.id("checkbox2")).click();   //Movies
		gg.findElement(By.id("checkbox3")).click();   //Hockey
		//for language
//		Select se=new Select(gg.findElement(By.id("msdd")));
//		se.selectByIndex(7);
		
		//for skills
		Select sel=new Select (gg.findElement(By.id("Skills")));
		
		//sel.selectByIndex(26);
		//sel.selectByValue("FileMaker Pro");
		sel.selectByVisibleText("Maya");
		
		//for country
		WebElement we=gg.findElement(By.xpath("//span[@aria-labelledby='select2-country-container']"));
		
		Actions act=new Actions(gg);
		act.moveToElement(we).build().perform();
		
		
		
		
		

		
		
		
		
		

	
		
		
	}

}
