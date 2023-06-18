package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.noorteck.qa.utils.Constants;

public class BlazeDemoPage {

	@FindBy(id = "inputName")
	WebElement nameField;
	
	@FindBy(id = "address")
	WebElement addressField;
	
	@FindBy(id = "city")
	WebElement cityField;
	
	@FindBy(id = "state")
	WebElement stateField;
	
	@FindBy(id = "zipCode")
	WebElement zipCodeField;
	
	@FindBy(id = "cardType")
	WebElement cardField;
	
	@FindBy(id = "creditCardNumber")
	WebElement creditCardField;
	
	@FindBy(id = "creditCardYear")
	WebElement yearField;
	
	@FindBy(id = "nameOnCard")
	WebElement nameCardField;
	
	@FindBy(id = "rememberMe")
	WebElement rememberField;
	
	@FindBy(id = "creditCardMonth")
	WebElement monthField;
	
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	WebElement purchaseButton;
	
	@FindBy(xpath = "/html/body/div[2]/div/h1")
	WebElement message;
	
	public BlazeDemoPage() {
		
		PageFactory.initElements(Constants.driver, this);
			
	}
	
	public void enterName(String name) {
		
		nameField.sendKeys(name);
	}
	
	public void enterAddress(String address) {
		
		addressField.sendKeys(address);
	}
	
	public void enterCity(String city) {
		
		cityField.sendKeys(city);
	}
	
	public void enterState(String state) {
		
		stateField.sendKeys(state);
	}
	
	public void enterZip(String zipCode) {
		
		zipCodeField.sendKeys(zipCode);
	}
	
	public void enterCard(String card) {
		
		Select select = new Select(cardField); 
		
		select.selectByVisibleText(card);
		
	}
	
	public void enterCreditNum(String cardNum) {
		
		creditCardField.sendKeys(cardNum);
		
	}
	
	public void cardDate(String cardMonth, String cardYear) {
		
		monthField.clear();
		yearField.clear();
		
		monthField.sendKeys(cardMonth);
		yearField.sendKeys(cardYear);
		
	}
	
	public void nameCard(String nameCard) {
		
		nameCardField.sendKeys(nameCard);
	}
	
	public void selectRemember() {
		
		rememberField.click();
	}
	
	
	public void purchaseFlight() {
		
		purchaseButton.click();
	}

	public void verifyMessage(String message) {
		
		String verifyMessage = "Thank you for your purchase today!";
		
		if(message.equals(verifyMessage)) {
			
			System.out.println("Test case : Passed");
		} else {
			
			System.out.println("Test case: Not Passed");
		}
		
	}
}
