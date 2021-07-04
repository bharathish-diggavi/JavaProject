package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayShopByCategory {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		FirefoxDriver browser = new FirefoxDriver();
		browser.get("https://www.ebay.com/");
		
		WebElement shopByCategoryElement = browser.findElementById("gh-shop-a");
		shopByCategoryElement.click();
		
		WebElement computersAndTablesLink = browser.findElementByLinkText("Computers & tablets");
		computersAndTablesLink.click();
		
		WebElement pageHeaderText = browser.findElementByClassName("b-pageheader__text");
		String headerText = pageHeaderText.getText();
		System.out.println("headerText => " + headerText);
		
		browser.close();
		
	}
}
