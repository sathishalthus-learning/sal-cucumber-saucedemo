package saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage {
	
	private static ProductsPage productsPageInstance;
	//
	private ProductsPage() {
		// 
		
	}
	//
	public static ProductsPage getInstance() {
		//
		if(productsPageInstance==null) {
			productsPageInstance = new ProductsPage();
		}
		return productsPageInstance;
	}
	
	//
	@FindBy(css = ".product_label")
	private WebElement productHeader;
	//
	public String getProductPageHeader() {
		return productHeader.getText();
	}
	
	//
	//@FindBy()
	public void addItemToCart(String itemName) {
		
	}
}
