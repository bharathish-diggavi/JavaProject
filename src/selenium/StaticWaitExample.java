package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWaitExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Diggavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver browser = new ChromeDriver();
		browser.get("file:///C:/Users/Diggavi/Documents/GitHub/Selenium-Practice/wait-and-click.html");

		// Static wait
		Thread.sleep(2000);
		WebElement submitButton = browser.findElement(By.id("submit-button"));
		
		submitButton.click();
	}
}
