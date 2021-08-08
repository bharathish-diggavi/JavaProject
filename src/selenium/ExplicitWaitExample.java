package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


// Static wait : which is not a feature of selenium, it's just that we user Thread.sleep
//2. Implicit wait: it is defined once per browser.
//3. Explicit waits : 2 type, WebDriverWait and FluentWait, in FluentWait we can ignore some exceptions while waiting.





public class ExplicitWaitExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Diggavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver browser = new ChromeDriver();
//		browser.get("file:///C:/Users/Diggavi/Documents/GitHub/Selenium-Practice/wait-and-click.html");
		browser.get("file:///C:/Users/Diggavi/Documents/GitHub/Selenium-Practice/new-element.html");

		// Setting explicit wait
		browser.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		// Defining explicit

//		WebElement submitButton = browser.findElement(By.id("submit-button"));

//		WebDriverWait waiter = new WebDriverWait(browser, 10, 1);
//		submitButton = waiter.until(ExpectedConditions.elementToBeClickable(submitButton));
//		submitButton.click();

//		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(browser);
//		fluentWait.withTimeout(Duration.ofSeconds(10));
//		fluentWait.pollingEvery(Duration.ofSeconds(2));
//		fluentWait.ignoring(WebDriverException.class);

		FluentWait<ChromeDriver> fluentWait = new FluentWait<>(browser)
												.withTimeout(Duration.ofSeconds(10))
												.pollingEvery(Duration.ofSeconds(2))
												.ignoring(WebDriverException.class);
		
//		submitButton = fluentWait.until(ExpectedConditions.elementToBeClickable(submitButton));
		WebElement submitButton = fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("button")));
		submitButton.click();
	}
}
