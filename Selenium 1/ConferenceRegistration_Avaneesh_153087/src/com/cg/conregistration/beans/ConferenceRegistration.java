package com.cg.conregistration.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ConferenceRegistration {
	
	
	//initialising the WebElement
	@FindBy(how = How.ID, id="txtFirstName")
	WebElement firstName;
	
	@FindBy(how = How.ID, id="txtLastName")
	WebElement lastName;
	
	@FindBy(how = How.ID, id="txtEmail")
	WebElement email;
	
	@FindBy(how = How.ID, id="txtPhone")
	WebElement phoneNo;
	
	@FindBy(how = How.CSS, css="body > form > table > tbody > tr:nth-child(5) > td:nth-child(2) > select > option:nth-child(2)")
	WebElement peopleAttendingButton;
	
	@FindBy(how = How.ID, id="txtAddress1")
	WebElement address;
	
	@FindBy(how = How.ID, id="txtAddress2")
	WebElement areaName;
	
	@FindBy(how = How.XPATH, xpath="//select[@name=\"city\"]//following::option[2]")
	WebElement cityButton;
	
	@FindBy(how = How.XPATH, xpath="//select[@name=\"state\"]//following::option[2]")
	WebElement stateButton;
	
	@FindBy(how = How.CSS, css="body > form > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=\"radio\"]")
	WebElement noMemberAccessButton;
	
	@FindBy(how = How.CSS, css="body > form > table > tbody > tr:nth-child(14) > td > a")
	WebElement nextButton;
	
	//generating constructor
	public ConferenceRegistration() {
		// TODO Auto-generated constructor stub
	}
	
	//generating the Getters and Setters of the WebElement
	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}

	
	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}

	public void setEmail(String email) {
		this.email.sendKeys(email); 
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo.sendKeys(phoneNo);
	}

	public void setPeopleAttendingButton() {
		this.peopleAttendingButton.click();
	}

	
	public void setAddress(String address) {
		this.address.sendKeys(address);
	}

	public void setAreaName(String areaName) {
		this.areaName.sendKeys(areaName);
	}

	public void setCityButton() {
		this.cityButton.click();
	}


	public void setStateButton() {
		this.stateButton.click();
	}

	public void setNoMemberAccessButton() {
		this.noMemberAccessButton.click();
	}

	public void setNextButton() {
		this.nextButton.click();
	}
	
	
	
}
