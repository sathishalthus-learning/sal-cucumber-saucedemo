package saucedemo.helpers;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class CucumberHooks {

	static WebDriver driver;

	//
	@BeforeAll
	public static void beforeAllTest() {
		//
	}

	@Before
	public void beforeEachTest() {
		//
		driver = WebDriverFactory.getWebDriver();
		SharedTestContext.initElements();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		driver.get("https://www.saucedemo.com/v1/index.html");
	}

	@BeforeStep
	public void beforeEachStep() {
		//
	}

	@AfterStep
	public void afterEachStep() {
		//
	}

	@After
	public void afterEachTest() {
		//
//		driver.close();
	}

	@AfterAll
	public static void afterAllTest() {
		//
		driver.quit();
	}
}
