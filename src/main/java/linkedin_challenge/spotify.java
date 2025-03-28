package linkedin_challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class spotify {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil\\sahiljavaautomation\\"
				+ "Automation_testing\\Resource\\chromedriver133.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		
		// search bar
		driver.findElement(By.xpath("//*[@id=\"center\"]/yt-searchbox/div[1]/form/input")).sendKeys("heartbreak kid");
		
		//click on song
		driver.findElement(By.xpath("//*[@id=\"center\"]/yt-searchbox/button/yt-icon/span/div")).click();

		//click on song
		
		WebElement elementToHover = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/ytd-thumbnail/a/yt-image/img"));

        // Create an instance of the Actions class
        Actions actions = new Actions(driver);

        // Perform the mouse over action
        actions.moveToElement(elementToHover).perform();
	}

}
