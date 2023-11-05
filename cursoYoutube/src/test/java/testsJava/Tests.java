package testsJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import helpers.Helpers;
import pages.PageLogin;
import pages.PageReservation;

public class Tests {

	private WebDriver driver;
	@BeforeMethod
	public void setUp() {
		DesiredCapabilities caps = new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/newtours/index.php");
		
		Helpers helper = new Helpers();
		helper.sleepSeconds(5);
	}
	
	/*@Test
	//Metodo poco recomendada, o menos eficiente
	public void pruebaUno() {
		driver.findElement(By.name("userName")).sendKeys("user");
		driver.findElement(By.name("password")).sendKeys("user");
		driver.findElement(By.name("submit")).click();
		Helpers helper = new Helpers();
		helper.sleepSeconds(4);
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b")).getText().contains("Thank you for Loggin"));
	}
	
	@Test
	//Metodo mas eficiente
	public void pruebaDos() {
		PageLogin login = new PageLogin(driver);
		login.login("user", "user");
	}
	*/
	@Test
	
	public void pruebaTres() {
		PageReservation pageReservation = new PageReservation(driver);
		pageReservation.goToNewPage();
		pageReservation.selectPassengers(2);
		pageReservation.selectFromPort(3);
		pageReservation.selectToPort("London");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
	
	
	

}
