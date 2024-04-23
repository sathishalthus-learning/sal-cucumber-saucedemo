package saucedemo.steps;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import saucedemo.helpers.WebDriverFactory;
import saucedemo.pages.LoginPage;
import saucedemo.pages.ProductsPage;

public class ProductSteps {
	//
	WebDriver driver;
	//
	public ProductSteps() {
		//
	}

	@Given("user is at products page")
	public void user_is_at_products_page() {
		//
		System.out.println("login page");
		driver = WebDriverFactory.getWebDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
		LoginPage.getInstance().loginWithValidCredetials("standard_user", "secret_sauce");

	}

	@When("user adds items to cart	:")
	public void user_adds_items_to_cart(DataTable dataTable) {
		//
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	}

	@Then("verify the cart items qty")
	public void verify_the_cart_items_qty() {
	    // 
		System.out.println("products");
		String heading = ProductsPage.getInstance().getProductPageHeader();
		assertThat(heading.contentEquals("Products"));
	}
	
}
