package saucedemo.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverFactory {
	//
	private static WebDriver driver = null;

	//
	private static void createWebDriver() {
		//
		 String webdriver = System.getProperty("browser", "firefox");

		switch (webdriver) {
		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "chrome":
			driver = new ChromeDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			throw new RuntimeException("Unsupported webdriver: " + webdriver);
		}
	}

	public static WebDriver getWebDriver() {
		if(driver==null) {
			createWebDriver();
		}
		return driver;
	}
}
