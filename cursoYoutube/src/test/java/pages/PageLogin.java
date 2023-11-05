package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helpers.Helpers;

public class PageLogin {

	private WebDriver driver;
	private By userFill;
	private By passwordFill;
	private By loginButton;
	
	public PageLogin (WebDriver driver) {
		this.driver = driver;
		userFill = By.name("userName");
		passwordFill = By.name("password");
		loginButton = By.name("submit");
	}
	
	public void login (String user, String pass) {
		driver.findElement(userFill).sendKeys(user);
		driver.findElement(passwordFill).sendKeys(pass);
		driver.findElement(loginButton).click();
		Helpers helper = new Helpers();
		helper.sleepSeconds(4);
	}
}
