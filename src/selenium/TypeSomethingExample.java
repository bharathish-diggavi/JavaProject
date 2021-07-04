package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TypeSomethingExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		FirefoxDriver browser = new FirefoxDriver();
		
		browser.get("https://www.ebay.com/");
		
		WebElement serachInput = browser.findElement(By.className("gh-tb ui-autocomplete-input"));
		
		serachInput.sendKeys("mobile");

		WebElement searchButton = 
				browser.findElement(
						By.id("gh-btn")
						);
		searchButton.click();
		
		browser.close();
		

		
		//============================================================================================================
		
//		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.29.1-win64\\geckodriver.exe");
//		FirefoxDriver driver = new FirefoxDriver();
//		
//		String[] arra = new String[] {"mobile", "laptop"};
//		
//		for (int i = 0; i < arra.length; i++) {
//			
//			driver.get("https://www.ebay.com/");			
//			WebElement serachInput = driver.findElement(By.id("gh-ac"));
//			serachInput.sendKeys(arra[i]);
//			WebElement searchButton = driver.findElement(By.id("gh-btn"));
//			searchButton.click();
//		}
//		
//		driver.close();
		
	}
}
