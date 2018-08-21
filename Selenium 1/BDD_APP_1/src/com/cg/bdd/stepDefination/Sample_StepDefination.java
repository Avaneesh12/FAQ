package com.cg.bdd.stepDefination;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Sample_StepDefination 
{
	private WebDriver driver;
	@Before
	public void setupStepEnv()
	{
		System.out.println("setupStepEnv");
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
	}
	
	@Given("^user wants to access 'www\\.google\\.com'$")
	public void user_wants_to_access_www_google_com() throws Throwable {
	    driver = new ChromeDriver();
	    throw new PendingException();
	}
	
	@When("^will enter 'www\\.google\\.com' in address bar$")
	public void will_enter_www_google_com_in_address_bar() throws Throwable {
	    
	    throw new PendingException();
	}
	
	@When("^user opens google chrome$")
	public void user_opens_google_chrome() throws Throwable {
	    driver.get("https://www.google.com/");
	    throw new PendingException();
	}
	
	@Then("^display the home page of 'www\\.google\\.com'$")
	public void display_the_home_page_of_www_google_com() throws Throwable {
	    String title = driver.getTitle();
	    assertEquals("Google", title);
	    throw new PendingException();
	}


}
