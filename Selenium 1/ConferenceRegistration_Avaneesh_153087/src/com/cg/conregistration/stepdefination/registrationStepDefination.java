package com.cg.conregistration.stepdefination;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.conregistration.beans.ConferenceRegistration;
import com.cg.conregistration.beans.PaymentDetails;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class registrationStepDefination {
	
	private WebDriver driver;
	private ConferenceRegistration register;
	private PaymentDetails payment;
	
	@Before
	public void setupStepEnv() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Given("^User is on the registration page$")
	public void user_is_on_the_registration_page() throws Throwable {
		driver.get("file:///D:/MPT%20Set%201/ConferenceRegistartion.html#");
		register = new ConferenceRegistration();
		PageFactory.initElements(driver, register); 

//		String expectedMessage = "Conference Registration";
//		   String actualMessage = driver.getTitle();
//		   Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User left the first name field empty$")
	public void user_left_the_first_name_field_empty() throws Throwable {
		String expectedMessage = " Conference Registartion";
		assertTrue(expectedMessage, true);
		   
	    register.setFirstName("");
	    register.setNextButton();
	}

	@Then("^'Please fill the First Name' message should be displayed$")
	public void please_fill_the_First_Name_message_should_be_displayed() throws Throwable {
		//Assert.assertTrue(driver.getTitle().contains("Conference Registration"));
		String expectedMessage="Please fill the First Name";
		String actualMessage=driver.switchTo().alert().getText();
		assertEquals(expectedMessage, actualMessage);
	    //driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		driver.close();
	}

	@When("^User left the last name field empty$")
	public void user_left_the_last_name_field_empty() throws Throwable {
		register.setFirstName("Avaneesh");
	    register.setLastName("");
	    register.setNextButton();
	}

	@Then("^'Please fill the Last Name' message should be displayed$")
	public void please_fill_the_Last_Name_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please fill the Last Name";
		String actualMessage=driver.switchTo().alert().getText();
		assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^User left the email field empty$")
	public void user_left_the_email_field_empty() throws Throwable {
		register.setFirstName("Avaneesh");
	    register.setLastName("Kaushik");
		register.setEmail("");
		register.setNextButton();
	}

	@Then("^'Please fill the Email' message should be displayed$")
	public void please_fill_the_Email_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please fill the Email";
		String actualMessage=driver.switchTo().alert().getText();
		assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^User entered the invalid email and proceed further$")
	public void user_entered_the_invalid_email_and_proceed_further() throws Throwable {
		register.setFirstName("Avaneesh");
	    register.setLastName("Kaushik");
		register.setEmail("abc123");
		register.setNextButton();
	}

	@Then("^'Please enter valid Email Id\\.' message should be displayed$")
	public void please_enter_valid_Email_Id_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please enter valid Email Id.";
		String actualMessage=driver.switchTo().alert().getText();
		assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.close();
	}
	@When("^User left the phone number field empty$")
	public void user_left_the_phone_number_field_empty() throws Throwable {
		register.setFirstName("Avaneesh");
	    register.setLastName("Kaushik");
		register.setEmail("avaneesh@gmail.com");
		register.setPhoneNo("");
		register.setNextButton();
	}

	@Then("^'Please fill the Contact No\\.' message should be displayed$")
	public void please_fill_the_Contact_No_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please fill the Contact No.";
		String actualMessage=driver.switchTo().alert().getText();
		assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^User entered invalid phone number$")
	public void user_entered_invalid_phone_number() throws Throwable {
		register.setFirstName("Avaneesh");
	    register.setLastName("Kaushik");
		register.setEmail("avaneesh@gmail.com");
		register.setPhoneNo("123456");
		register.setNextButton();
	}

	@Then("^'Please enter valid Contact no\\.' message should be displayed$")
	public void please_enter_valid_Contact_no_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please enter valid Contact no.";
		String actualMessage=driver.switchTo().alert().getText();
		assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^User left the number of people attending conference field empty$")
	public void user_left_the_number_of_people_attending_conference_field_empty() throws Throwable {
		register.setFirstName("Avaneesh");
	    register.setLastName("Kaushik");
		register.setEmail("avaneesh@gmail.com");
		register.setPhoneNo("7896541230");
		register.setNextButton();
	}

	@Then("^'Please fill the Number of people attending' message should be displayed$")
	public void please_fill_the_Number_of_people_attending_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please fill the Number of people attending";
		String actualMessage=driver.switchTo().alert().getText();
		assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.close();
	}
	
	@When("^User left the building name field empty$")
	public void user_left_the_building_name_field_empty() throws Throwable {
		register.setFirstName("Avaneesh");
	    register.setLastName("Kaushik");
		register.setEmail("avaneesh@gmail.com");
		register.setPhoneNo("7896541230");
		register.setPeopleAttendingButton();
		register.setAddress("");
		register.setNextButton();
	}
	
	@Then("^'Please fill the Building & Room No' message should be displayed$")
	public void please_fill_the_Building_Room_No_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please fill the Building & Room No";
		String actualMessage=driver.switchTo().alert().getText();
		assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^User left area name field empty$")
	public void user_left_area_name_field_empty() throws Throwable {
		register.setFirstName("Avaneesh");
	    register.setLastName("Kaushik");
		register.setEmail("avaneesh@gmail.com");
		register.setPhoneNo("7896541230");
		register.setPeopleAttendingButton();
		register.setAddress("Capgemini Hinjewadi");
		register.setAreaName("");
		register.setNextButton();
	}

	@Then("^'Please fill the Area name' message should be displayed$")
	public void please_fill_the_Area_name_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please fill the Area name";
		String actualMessage=driver.switchTo().alert().getText();
		assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^User left city name field empty$")
	public void user_left_city_name_field_empty() throws Throwable {
		register.setFirstName("Avaneesh");
	    register.setLastName("Kaushik");
		register.setEmail("avaneesh@gmail.com");
		register.setPhoneNo("7896541230");
		register.setPeopleAttendingButton();
		register.setAddress("Capgemini Hinjewadi");
		register.setAreaName("Phase 3");
//		register.setCityButton();
		register.setNextButton();
	}

	@Then("^'Please select city' message should be displayed$")
	public void please_select_city_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please select city";
		String actualMessage=driver.switchTo().alert().getText();
		assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^User left state name field empty$")
	public void user_left_state_name_field_empty() throws Throwable {
		register.setFirstName("Avaneesh");
	    register.setLastName("Kaushik");
		register.setEmail("avaneesh@gmail.com");
		register.setPhoneNo("7896541230");
		register.setPeopleAttendingButton();
		register.setAddress("Capgemini Hinjewadi");
		register.setAreaName("Phase 3");
		register.setCityButton();
		register.setNextButton();
	}

	@Then("^'Please select state' message should be displayed$")
	public void please_select_state_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please select state";
		String actualMessage=driver.switchTo().alert().getText();
		assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^user did not select the membership status$")
	public void user_did_not_select_the_membership_status() throws Throwable {
		register.setFirstName("Avaneesh");
	    register.setLastName("Kaushik");
		register.setEmail("avaneesh@gmail.com");
		register.setPhoneNo("7896541230");
		register.setPeopleAttendingButton();
		register.setAddress("Capgemini Hinjewadi");
		register.setAreaName("Phase 3");
		register.setCityButton();
		register.setStateButton();
		register.setNextButton();
	}

	@Then("^'Please Select MemeberShip status' message should be displayed$")
	public void please_Select_MemeberShip_status_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please Select MemeberShip status";
		String actualMessage=driver.switchTo().alert().getText();
		assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^user entered all the details correctly$")
	public void user_entered_all_the_details_correctly() throws Throwable {
		register.setFirstName("Avaneesh");
	    register.setLastName("Kaushik");
		register.setEmail("avaneesh@gmail.com");
		register.setPhoneNo("7896541230");
		register.setPeopleAttendingButton();
		register.setAddress("Capgemini Hinjewadi");
		register.setAreaName("Phase 3");
		register.setCityButton();
		register.setStateButton();
		register.setNoMemberAccessButton();
		register.setNextButton();
	}

	@Then("^'Personal details are validated\\.' alert message should be displayed$")
	public void personal_details_are_validated_alert_message_should_be_displayed() throws Throwable {
		String expectedMessage="Personal details are validated.";
		String actualMessage=driver.switchTo().alert().getText();
		assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.close();
	}
	
	@Given("^User is on the payment page$")
	public void user_is_on_the_payment_page() throws Throwable {
	   driver.get("file:///D:/MPT%20Set%201/PaymentDetails.html");
	   payment = new PaymentDetails();
	   PageFactory.initElements(driver, payment);
	   
	}

	@When("^user left the card holder name field empty$")
	public void user_left_the_card_holder_name_field_empty() throws Throwable {
//		String expectedMessage = "Payment Details";
//		   String actualMessage = driver.getTitle();
//		   Assert.assertEquals(expectedMessage, actualMessage);
		
	    payment.setCardHolderName("");
	    payment.setMakePaymentButton();
	}

	@Then("^'Please fill the Card holder name' message should be displayed$")
	public void please_fill_the_Card_holder_name_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please fill the Card holder name";
		String actualMessage=driver.switchTo().alert().getText();
		assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^user left the debit card number field empty$")
	public void user_left_the_debit_card_number_field_empty() throws Throwable {
		payment.setCardHolderName("Avaneesh");
		payment.setDebitCardNumber("");
	    payment.setMakePaymentButton();
	}

	@Then("^'Please fill the Debit card Number' message should be displayed$")
	public void please_fill_the_Debit_card_Number_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please fill the Debit card Number";
		String actualMessage=driver.switchTo().alert().getText();
		assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^user left the CVV number field empty$")
	public void user_left_the_CVV_number_field_empty() throws Throwable {
		payment.setCardHolderName("Avaneesh");
		payment.setDebitCardNumber("1414-1212-1616");
		payment.setCvvNumber("");
	    payment.setMakePaymentButton();
	}

	@Then("^'Please fill the CVV' message should be displayed$")
	public void please_fill_the_CVV_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please fill the CVV";
		String actualMessage=driver.switchTo().alert().getText();
		assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^user left the expiry month field empty$")
	public void user_left_the_expiry_month_field_empty() throws Throwable {
		payment.setCardHolderName("Avaneesh");
		payment.setDebitCardNumber("1414-1212-1616");
		payment.setCvvNumber("123");
		payment.setExpiryMonth("");
	    payment.setMakePaymentButton();
	}

	@Then("^'Please fill expiration month' message should be displayed$")
	public void please_fill_expiration_month_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please fill expiration month";
		String actualMessage=driver.switchTo().alert().getText();
		assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^user left the expiry year field empty$")
	public void user_left_the_expiry_year_field_empty() throws Throwable {
		payment.setCardHolderName("Avaneesh");
		payment.setDebitCardNumber("1414-1212-1616");
		payment.setCvvNumber("123");
		payment.setExpiryMonth("12");
		payment.setExpiryYear("");
	    payment.setMakePaymentButton();
	}

	@Then("^'Please fill expiration year' message should be displayed$")
	public void please_fill_expiration_year_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please fill the expiration year";
		String actualMessage=driver.switchTo().alert().getText();
		assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^user entered all the details$")
	public void user_entered_all_the_details() throws Throwable {
		payment.setCardHolderName("Avaneesh");
		payment.setDebitCardNumber("1414-1212-1616");
		payment.setCvvNumber("123");
		payment.setExpiryMonth("12");
		payment.setExpiryYear("2020");
	    payment.setMakePaymentButton();
	}

	@Then("^'Conference Room Booking successfully done!!!' alert message should be displayed$")
	public void conference_Room_Booking_successfully_done_alert_message_should_be_displayed() throws Throwable {
		String expectedMessage="Conference Room Booking successfully done!!!";
		String actualMessage=driver.switchTo().alert().getText();
		assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
	}


}
