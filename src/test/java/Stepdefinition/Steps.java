package Stepdefinition;

import java.util.concurrent.TimeUnit;


//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Steps {
	WebDriver driver;

	@Given("I Launch Chrome Browser")
	public void I_launch_chrome_browser() {
	    System.setProperty("webdriver.chrome.driver","C://Users//user//eclipse-workspace//LogoPresenceOnOranageHRM//Drivers//chromedriver.exe");
	    driver=new ChromeDriver();
	}

	@Given("user maximize the browser")
	public void user_maximize_the_browser() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("I Open OrangeHRM homepage")
	public void i_open_orange_hrm_homepage() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	}

	@Then("I Verify that the logo present on page")
	public void i_verify_that_the_logo_present_on_page() {
		boolean status = driver.findElement(By.xpath("//div[@id=\"divLogo\"]")).isDisplayed();
	  // Assert.assertArrayEquals(expected, true, status);
	    
	}

	@And("close browser")
	public void close_browser() {
		driver.quit();
	   
	}
	
	
	
}
