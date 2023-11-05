package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import helpers.Helpers;


public class PageReservation {

	private WebDriver driver;
	private By fromDrop;
	private By toPort;
	private By passengersDrop;
	private By titleText;
	private By newPage;
	
	public PageReservation(WebDriver driver) {
		this.driver = driver;
		titleText = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font");
		passengersDrop = By.name("passCount");
		fromDrop = By.name("fromPort");
		toPort = By.name("toPort");
	}
	
	
	public void goToNewPage() {
		driver.navigate().to("https://demo.guru99.com/test/newtours/reservation.php");
	}
	
	
	public void assertPage() {
		Assert.assertTrue(driver.findElement(titleText).getText().contains("Flight Finder to search"));
		
	}
	
	
	public void selectPassengers(int cant) {
		Select selectPasajeros = new Select(driver.findElement(passengersDrop));
		selectPasajeros.selectByVisibleText(Integer.toString(cant));
		Helpers helper = new Helpers();
		helper.sleepSeconds(3);
	}
	
	
	public void selectFromPort(int index) {
		Select selectFrom = new Select(driver.findElement(fromDrop));
		selectFrom.selectByIndex(index);
		Helpers helper = new Helpers();
		helper.sleepSeconds(3);
	}
	
	public void selectToPort(String city) {
		Select selectToPort = new Select(driver.findElement(toPort));
		selectToPort.selectByValue(city);
		
		Helpers helper = new Helpers();
		helper.sleepSeconds(5);
		
		
	}
	
}
