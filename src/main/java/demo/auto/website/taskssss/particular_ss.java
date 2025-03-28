package demo.auto.website.taskssss;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
//import org.apache.commons.io.FileUtils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class particular_ss {
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\"
        		+ "Automation_testing\\Resource\\chromedriver.exe");

        
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();


        try {
            
            driver.get("https://demo.automationtesting.in/Register.html");

            WebElement element = driver.findElement(By.xpath("//img[@id='imagetrgt']"));

            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            File elementScreenshot = new File("C:\\SS New\\screenshot.png");

            BufferedImage fullImg = ImageIO.read(screenshot);
            Point point = element.getLocation();
            int eleWidth = element.getSize().getWidth();
            int eleHeight = element.getSize().getHeight();

            BufferedImage eleScreenshot = fullImg.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
            ImageIO.write(eleScreenshot, "png", elementScreenshot);

            System.out.println("Screenshot taken: " + elementScreenshot.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}