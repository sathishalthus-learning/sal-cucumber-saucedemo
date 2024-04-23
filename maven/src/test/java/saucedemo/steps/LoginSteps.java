package saucedemo.steps;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import saucedemo.helpers.WebDriverFactory;
import saucedemo.pages.LoginPage;
import saucedemo.pages.ProductsPage;

public class LoginSteps {
	//
	WebDriver driver;
	//
	public LoginSteps() {
		//
	}

	@Given("navigate to sauce demo login page")
	public void navigate_to_sauce_demo_login_page() {
		//
		System.out.println("login page");
		driver = WebDriverFactory.getWebDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");

	}

	@When("passing valid credentials")
	public void passing_valid_credentials() throws InterruptedException {
		//
		System.out.println("creds");
		LoginPage.getInstance().loginWithValidCredetials("standard_user", "secret_sauce");

	}
	
	@When("passing invalid credentials")
	public void passing_invalid_credentials() throws InterruptedException {
		//
		System.out.println("creds");
		LoginPage.getInstance().loginWithValidCredetials("", "");

	}

	@Then("products page is displayed")
	public void products_page_is_displayed() throws InterruptedException {
	    // 
		System.out.println("products");
		String heading = ProductsPage.getInstance().getProductPageHeader();
		assertThat(heading.contentEquals("Products"));
	}
	
	@Then("products page is displayedd")
	public void products_page_is_displayedd() throws InterruptedException {
	    // 
		
	}
	@When("passing invalid credentials {string} and {string}")
	public void passing_invalid_credentials_and(String username, String password) {
	    // 
		System.out.println(username);
		System.out.println(password);
		LoginPage.getInstance().loginWithInValidCredetials(username,password);
	}

	@Then("verify error message is displayed {string}")
	public void verify_error_message_is_displayed(String message) {
	    // 
		System.out.println(message);
		String error = LoginPage.getInstance().getErrorMessage();
		System.out.println(error);
		assertThat(error.contentEquals(message));
	}
}
