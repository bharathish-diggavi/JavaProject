package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountrySelect {

	// WebDriver object is object representation of the browser
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		FirefoxDriver browser = new FirefoxDriver();
		browser.get("https://www.ebay.com/");
		
		WebElement countrySelectButton = browser.findElement(By.id("gf-fbtn"));		
		WebElement indiaButton = browser.findElementByCssSelector("a[aria-label='eBay India']");
		
		
		System.out.println("Before : " + indiaButton.isDisplayed());
		countrySelectButton.click(); //a[aria-label='eBay India']
		System.out.println("After : " + indiaButton.isDisplayed());
		indiaButton.click();
	}
	
}
