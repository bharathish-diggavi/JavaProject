package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutionExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Diggavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver browser = new ChromeDriver();
		browser.get("https://www.ebay.com/");

		WebElement searchInput = browser.findElementById("gh-ac");
		WebElement searchButton = browser.findElementById("gh-btn");
		
		JavascriptExecutor executor = (JavascriptExecutor) browser;
//		executor.executeScript("console.log(\"hello\")");
//		String script1 = "document.getElementById(\"gh-ac\").value =\"phone\";";
//		String script2 = "document.getElementById(\"gh-btn\").click();";
//		executor.executeScript(script1 + script2);
		
		executor.executeScript("arguments[0].value = 'phone'; arguments[1].click()", searchInput, searchButton);

	}
}
