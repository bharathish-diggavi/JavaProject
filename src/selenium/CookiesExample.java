package selenium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookiesExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Diggavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//C:\Users\Diggavi\Downloads\chromedriver_win32
//		FirefoxDriver browser = new FirefoxDriver();
		ChromeDriver browser = new ChromeDriver();
		browser.get("https://www.ebay.com/");
		
		Thread.sleep(5000);
		
//		browser.manage().addCookie(new Cookie("name", "Bharathish"));
//		browser.manage().deleteAllCookies();
//		browser.manage().getCookies();
		
		Options options = browser.manage();
		options.deleteAllCookies();
		options.addCookie(new Cookie("name", "Bharathish"));
		
		Set<Cookie> cookies = options.getCookies();
		System.out.println("No of cookies available : " + cookies.size());
		
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + " : " + cookie.getValue());
		}
	}
}
