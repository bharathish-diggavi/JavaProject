package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		FirefoxDriver browser = new FirefoxDriver();
//		browser.get("https://www.ebay.com/");
//		
//		WebElement categoryDropdown = browser.findElement(By.id("gh-cat"));
//		Select select = new Select(categoryDropdown);
//		select.selectByVisibleText("Antiques");
//		
//		Thread.sleep(3000);
//		select.selectByValue("12576");
//		
//		Thread.sleep(3000);
//		select.selectByIndex(3);
		
		browser.get("file:///C:/Users/Diggavi/Documents/GitHub/Selenium-Practice/Dropdown.html");
		
		WebElement categoryDropdown = browser.findElement(By.id("cars"));
		Select select = new Select(categoryDropdown);
		select.selectByIndex(2);
		select.selectByVisibleText("Volvo");
		select.selectByIndex(3);
//		select.deselectByVisibleText("Volvo");
//		select.deselectAll();
		
//		WebElement option = select.getFirstSelectedOption();
//		System.out.println(option.getText());
		
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		
		for(WebElement element : allSelectedOptions) {
			System.out.println(element.getText());
		}
		
	}
}
