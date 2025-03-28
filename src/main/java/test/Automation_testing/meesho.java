package test.Automation_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class meesho {
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\"
        		+ "Automation_testing\\Resource\\chromedriver.exe");

        
        WebDriver gg = new ChromeDriver();

        try {
            
            gg.get("https://www.meesho.com");

            //with the help of "getCurrentUrl" method and next step is printing statement
            String mm = gg.getCurrentUrl();
            System.out.println("URL of Website: " + mm);
            
            
            //with the help of "getTitle" method and next step is printing statement
            String bb = gg.getTitle();
            System.out.println("Page Title: " + bb);
            }
        
        finally {
            
            gg.quit();
            }
    }
}
