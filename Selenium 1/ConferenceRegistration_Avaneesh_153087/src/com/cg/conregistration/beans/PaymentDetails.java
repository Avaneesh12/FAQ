package com.cg.conregistration.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentDetails {
	
	
	@FindBy(how = How.ID, id="txtCardholderName")
	WebElement cardHolderName;
	
	@FindBy(how = How.ID, id="txtDebit")
	WebElement debitCardNumber;
	
	@FindBy(how = How.ID, id="txtCvv")
	WebElement cvvNumber;
	
	@FindBy(how = How.ID, id="txtMonth")
	WebElement expiryMonth;
	
	@FindBy(how = How.ID, id="txtYear")
	WebElement expiryYear;
	
	@FindBy(how = How.ID, id="btnPayment")
	WebElement makePaymentButton;
	
	public PaymentDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public void setCardHolderName( String cardHolderName) {
		this.cardHolderName.sendKeys(cardHolderName);
	}

	public void setDebitCardNumber(String debitCardNumber) {
		this.debitCardNumber.sendKeys(debitCardNumber);
	}

	public void setCvvNumber(String cvvNumber) {
		this.cvvNumber.sendKeys(cvvNumber);
	}

	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth.sendKeys(expiryMonth);
	}

	public void setExpiryYear(String expiryYear) {
		this.expiryYear.sendKeys(expiryYear);
	}

	public void setMakePaymentButton() {
		this.makePaymentButton.click();
	}

}
