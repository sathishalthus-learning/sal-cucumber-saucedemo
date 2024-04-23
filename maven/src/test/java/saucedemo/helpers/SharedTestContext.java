package saucedemo.helpers;

import org.openqa.selenium.support.PageFactory;

import saucedemo.pages.LoginPage;
import saucedemo.pages.ProductsPage;

public class SharedTestContext {
	//

	public static void initElements() {
		//
		PageFactory.initElements(WebDriverFactory.getWebDriver(), LoginPage.getInstance());
		PageFactory.initElements(WebDriverFactory.getWebDriver(), ProductsPage.getInstance());
	}

}
