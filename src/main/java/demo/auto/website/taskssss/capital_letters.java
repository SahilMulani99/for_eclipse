package demo.auto.website.taskssss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class capital_letters {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sahil\\sahiljavaautomation\\"
				+ "Automation_testing\\Resource\\chromedriver.exe");
		
		ChromeDriver gg=new ChromeDriver();
		gg.manage().window().maximize();
		
		gg.get("https://demo.automationtesting.in/Register.html");
		
		WebElement fname=gg.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input"));
		
		Actions s=new Actions(gg);
		s.moveToElement(fname).click();
		s.keyDown(Keys.SHIFT+"m");
		s.keyDown(Keys.SHIFT);
		s.sendKeys("eena");
		//s.keyUp(Keys.SHIFT).build().perform();
		
		
	}

}
