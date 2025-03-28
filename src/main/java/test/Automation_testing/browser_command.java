package test.Automation_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser_command {
    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\"
        		+ "Automation_testing\\Resource\\chromedriver133.exe");
        
        
        WebDriver gg = new ChromeDriver();
        
        gg.manage().window().maximize();
        
       gg.get("https://www.facebook.com/");

       Thread.sleep(2000);
       
       gg.navigate().to("https://www.youtube.com/");
        

        
        

        
    }
}