package PruebaChoucair;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	private WebDriver driver; 
	
	By SignIn = By.className("login");
	By Already = By.xpath("//form[@id=\"login_form\"]");
	
	By EmailAddress = By.id("email");
	By Pasword = By.id("passwd");
	By ButtonSingIn = By.xpath("//i[@class=\"icon-lock left\"]");
	
	By SignOut = By.className("logout");
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
				
	@Test
	public void LoginUser() throws InterruptedException {
		driver.findElement(SignIn).click();
		Thread.sleep(2000);
		if(driver.findElement(Already).isDisplayed()) {
			driver.findElement(EmailAddress).sendKeys("hobal13075@soulsuns.com");
			driver.findElement(Pasword).sendKeys("S12345678");
			driver.findElement(ButtonSingIn).click();
			
			driver.findElement(SignOut).click();
		}
	}

}
