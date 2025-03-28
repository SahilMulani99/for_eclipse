package test.Automation_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateWebsites {
    public static void main(String[] args) {
        // Set the path for the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\Automation_testing"
        		+ "\\Resource\\chromedriver.exe"); // Update the path

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        try {
            // Launch Amazon
            driver.get("https://www.amazon.com");
            Thread.sleep(2000); // Wait for 2 seconds

            // Navigate to LinkedIn
            driver.get("https://www.linkedin.com");
            Thread.sleep(2000); // Wait for 2 seconds

            // Navigate to Flipkart
            driver.get("https://www.flipkart.com");
            Thread.sleep(2000); // Wait for 2 seconds

            // Navigate back to LinkedIn
            driver.navigate().back();
            Thread.sleep(2000); // Wait for 2 seconds

            // Navigate back to Amazon
            driver.navigate().back();
            Thread.sleep(2000); // Wait for 2 seconds

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}