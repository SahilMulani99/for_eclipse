package demo.auto.website.taskssss;

import org.openqa.selenium.chrome.ChromeDriver;
import java.nio.file.Files;
//import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class screenshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sahil\\sahiljavaautomation\\"
				+ "Automation_testing\\Resource\\chromedriver.exe");
		
		ChromeDriver gg=new ChromeDriver();
		gg.manage().window().maximize();
		
		gg.get("https://demo.automationtesting.in/Register.html");
		
		
		File src=((TakesScreenshot)gg).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\SS New\\dashboard.png");
		
		Files.copy(src.toPath(), dest.toPath());
		
//		
//		gg.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
