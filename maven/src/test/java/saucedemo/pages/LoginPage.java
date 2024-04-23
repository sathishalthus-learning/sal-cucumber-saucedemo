package saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {
	
	private static LoginPage loginPageInstance;
	
	private LoginPage() {
		// 
		
	}
	
	public static LoginPage getInstance() {
		//
		if(loginPageInstance==null) {
			loginPageInstance = new LoginPage();
		}
		return loginPageInstance;
	}
	 
	//
	@FindBy(id = "user-name")
	private WebElement userNameField;

	@FindBy(id = "password")
	private WebElement passwordField;

	@FindBy(id = "login-button")
	private WebElement loginButton;
	
	@FindBy(tagName = "h3")
	private WebElement message;

	public void loginWithValidCredetials(String username, String password) {
		//
		userNameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginButton.click();
	}

	public void loginWithInValidCredetials(String username, String password) {
		//
		userNameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginButton.click();
	}
	
	public String getErrorMessage() {
		return message.getText();
	}
}
