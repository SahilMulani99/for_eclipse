package demo.auto.website.taskssss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class address_copy_paste_navigate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sahil\\sahiljavaautomation\\"
				+ "Automation_testing\\Resource\\chromedriver.exe");
		
		ChromeDriver gg=new ChromeDriver();
		gg.manage().window().maximize();
		
		gg.get("https://www.cravitaindia.com/");
		WebElement src=gg.findElement(By.xpath("/html[1]/body[1]/footer[1]/div[1]/div[1]/div[4]/p[1]"));
		String text=src.getText();
		//System.out.println(text);
		src.sendKeys(Keys.CONTROL+"A");
		src.sendKeys(Keys.CONTROL+"C");
		
		gg.navigate().to("https://demo.automationtesting.in/Register.html");
		
		

		
	}

}
