package com.cg.project.stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_StepDefination 
{
	private WebDriver driver;
	
	@Given("^User is on the home page$")
	public void user_is_on_the_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}

	@When("^user navigates to the sign in$")
	public void user_navigates_to_the_sign_in() throws Throwable {
		driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&&openid.pape.max_auth_age=0");
	}

	@When("^click on the new customer$")
	public void click_on_the_new_customer() throws Throwable {
		WebElement createNew = driver.findElement(By.id("createAccountSubmit"));
	    createNew.click();
	}

	@When("^enters all the details$")
	public void enters_all_the_details() throws Throwable {
			    
	    WebElement username = driver.findElement(By.id("ap_customer_name"));
	    username.sendKeys("Sanju");
	    
	    WebElement mobileNo = driver.findElement(By.id("ap_phone_number"));
	    mobileNo.sendKeys("1230654789");
	    
	    WebElement email = driver.findElement(By.id("ap_email"));
	    email.sendKeys("serida132@gmail.com");
	    
	    WebElement password = driver.findElement(By.id("ap_password"));
	    password.sendKeys("Ramu@123");
	    
	    WebElement submit = driver.findElement(By.id("continue"));
	    submit.click();
	}

	@Then("^registration successfull page is displayed$")
	public void registration_successfull_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
