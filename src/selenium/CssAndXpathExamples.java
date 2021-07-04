package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssAndXpathExamples {

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
		
		WebElement firstArrowButton = browser.findElementByXPath("//div[@class='dialog__cell']/section/ul/li[1]/button");
		firstArrowButton.click();
		
		WebElement dellButton = browser.findElementByXPath("//a[@href='https://www.ebay.com/b/Dell-Computers-Tablets-Network-Hardware/58058/bn_81177175']");
		dellButton.click();
		
//		browser.close();
	}
	
	// XPath
	// We'll use xpath when the element that we are interested in doesn't have any unique id, class name, name, linkText or partial link text
	// Basic syntax is
	// 1. start with /html or //<tag-name>
	// 2. we give condition in square brackets.
	// 3. //<tag-name>[@<attribute-name> = '<attribute-value>']
	// 4. we can repeat the above syntax n number of times until we reach our required element
	// 5. When there are multiple elements which satisfy the given xpath, we enclose whole xpath in backets then specify the number/position that 
	// we are interested in square brackets. (//<tag-name>[@<attribute-name> = '<attribute-value>'])[1]
	// 6. If we have only the partial attribute value then we use a xpath function called contains
	// //<tag-name>[contains(@<attribute-name>, '<attribute-value>')]
	// Similar to contains one more function is starts-with
	// 7. We can use multiple conditions by using and, or
	// //<tage-name>[@<attribute-name>='<attribute-value>' and/or @<another-attribute>='<another-value>']
	// Example: //a[@href='https://www.ebay.com/b/Dell-Computers-Tablets-Network-Hardware/58058/bn_81177175' and @class='b-guidancecard__link b-guidancecard__link--noimg']
	
	// 8. We can use text of the element in xpath
	// Example 1. //p[text() = 'Dell']
	//		   2. //p[contains(text(),'Desktop Accessories')]
	
	
	
}
