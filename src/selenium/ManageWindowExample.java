package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ManageWindowExample {

	// WebDriver object is object representation of the browser
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		FirefoxDriver browser = new FirefoxDriver();
		browser.get("https://www.ebay.com/");
		
		
//		browser.manage().window().maximize();
//		browser.manage().window().fullscreen();
//		browser.manage().window().setPosition(new Point(500, 500));
//		browser.manage().window().setSize(new Dimension(360, 640));
		Options options = browser.manage();
		Window window = options.window();
		
//		window.fullscreen();
//		window.maximize();
//		window.setPosition(new Point(500, 500));
//		window.setSize(new Dimension(360, 640));
	}
	
}
