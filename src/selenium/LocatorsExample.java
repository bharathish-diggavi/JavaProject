package selenium;

import javax.swing.JComboBox.KeySelectionManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		
		// By Id
//		WebElement searchElement = driver.findElementById("gh-ac");
//		WebElement searchElement = driver.findElement(By.id("gh-ac"));
//		searchElement.sendKeys("laptop");
//		
//		//By class name
//		WebElement searchButton = driver.findElement(By.className("gh-spr"));
//		searchButton.click();
//		
//		//By Name
//		WebElement searchInput2 = driver.findElementByName("_nkw");
//		searchInput2.clear();
//		searchInput2.sendKeys("mobile" + Keys.ENTER);
		
		//By Tag Name
//		WebElement tagNameElement = driver.findElementByTagName("");
//		tagNameElement.click();
		
		//By LinkText
//		WebElement linkElement = driver.findElementByLinkText("Electronics");
//		linkElement.click();
		
		//By LinkText
//		WebElement partialLinkElement = driver.findElementByPartialLinkText("and Art");
//		partialLinkElement.click();
		
	}
}


// HTML format
// 1. Tag name - Ex: div, input, a, table, tbody, td, tr, select, option, script. these are not pre-defined.
// 2. Attribute - reside inside opening part of an html tag. Ex: id, class, label. attributes are not pre-defined. And attributes are in in key value format
// 3. 

// Locators
// 1. Locators are the mechanisms that we use to find particular elements in a web page
// 2. 8 locator mechanisms in Selenium to find elements

// id, name, linktext, partialLinkText, className, tagName, 

// Types
// 1. id - just the attribute value that we have pass to find that particular element
// 2. className
// 3. tagName - just the tag name
// 4. name -


// 5. partialLinkText
// 6. linkText

// 7. cssSelector
// 8. xpath
