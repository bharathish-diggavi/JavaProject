package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import classesandobjects.Car;
import maths.Calculator;

public class BrowserTest {

	public static void main(String[] args) {
//		Browser browser = new Browser();
//		browser.goTo("https://www.google.co.in/");
//		browser.maximize();
//		browser.enterSomeInput("hello", "inputbox");
//		browser.closeBrowser();

		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
		
//		String geckoDriverPath = System.getProperty("webdriver.gecko.driver");
//		
//		System.out.println("geckoDriverPath is : " + geckoDriverPath);

//		ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		
//		EdgeDriver driver = new EdgeDriver();
//		SafariDriver driver = new SafariDriver();

		// 1. Firefox is installed or not?
		// 2. search for geckodriver.exe,
		// 1. system environment path
		// 2. System property webdriver.gecko.driver
		// 3. inside application

		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();

//		driver.manage() // Option
//						.window() // Window
//								.maximize();

//		Options options = driver.manage();
//		Window window = options.window();
//		window.maximize();

		driver.close();

	}
}
