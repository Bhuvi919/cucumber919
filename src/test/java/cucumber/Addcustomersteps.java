package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Addcustomersteps {
	
	static WebDriver driver;

	@Given("The user is in telecom home page")
	public void the_user_is_in_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M\\eclipse-workspace\\cucumber\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("The user click onadd customer")
	public void the_user_click_onadd_customer() {
	    driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("The user filling details")
	public void the_user_filling_details() {
		 driver.findElement(By.xpath("//label[@for='done']")).click();
		 driver.findElement(By.id("fname")).sendKeys("Bhuvanesswaran");
		 driver.findElement(By.id("lname")).sendKeys("k");
		 driver.findElement(By.id("email")).sendKeys("Bhuvaneswaran919@gmail.com");
		 driver.findElement(By.name("addr")).sendKeys("chennai");
		 driver.findElement(By.name("telephoneno")).sendKeys("9952956178");
		 
		 
	}

	@When("The user click on submit")
	public void the_user_click_on_submit() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("The user will get customer ID")
	public void the_user_will_get_customer_ID() {
	 Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}



}
