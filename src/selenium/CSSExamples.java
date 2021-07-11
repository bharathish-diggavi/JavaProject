package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSExamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		FirefoxDriver browser = new FirefoxDriver();
		browser.get("https://www.ebay.com/");
		
//		WebElement pauseButton = browser.findElementByCssSelector("button[class='carousel__playback']");
		WebElement pauseButton = browser.findElementByCssSelector("button.carousel__playback");
		pauseButton.click();
		
//		browser.close();
	}
}

// 1. Basic syntax of css <tag-name>[<attribute-name>='<attribute-value>']
// 2. > used to identify the immediate child. A blank space is used to find a grand child
// 3. Shorthand can be used for class name and id, If we are using the class name then we use ., if we are using id the we use #
// 4. 
