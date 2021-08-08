package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Diggavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver browser = new ChromeDriver();
		browser.get("file:///C:/Users/Diggavi/Documents/GitHub/Selenium-Practice/wait-and-click.html");

		// Setting implicit wait
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement submitButton = browser.findElement(By.id("submit-button"));

		submitButton.click();
	}
}
