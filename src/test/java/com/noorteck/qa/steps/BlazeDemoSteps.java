package com.noorteck.qa.steps;

import org.openqa.selenium.chrome.ChromeDriver;

import com.noorteck.qa.pages.BlazeDemoPage;
import com.noorteck.qa.utils.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BlazeDemoSteps {

	BlazeDemoPage blaze;
	
	
	@Given("User navigates to webpage {string}")
	public void navigateToBlazeDemo(String url) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Constants.driver = new ChromeDriver();
		Thread.sleep(2000);
		Constants.driver.manage().window().maximize();
		Constants.driver.get(url);
		Thread.sleep(2000);
	
		blaze = new BlazeDemoPage();
	}

	@When("User enters name {string}")
	public void enterUserName(String name) {
	
		blaze.enterName(name);
		
	}

	@When("User enters address {string}")
	public void enterUserAddress(String address) {
	
		blaze.enterAddress(address);
	}

	@When("User enters city {string}")
	public void enterUserCity(String city) {
	  blaze.enterCity(city);
	}

	@When("User enters state {string}")
	public void enterUserState(String state) {
	   blaze.enterState(state);
	}

	@When("User enters zipCode {string}")
	public void enterUserZipcode(String zipCode) {
	  blaze.enterZip(zipCode);
	}

	@When("User selects cardType {string}")
	public void addUserCardType(String card) {
	    blaze.enterCard(card);
	}

	@When("User enters credit card number {string}")
	public void enterUserCardNumber(String cardNum) {
	   blaze.enterCreditNum(cardNum);
	}

	@When("User enters month and year {string} {string}")
	public void addMonthandYear(String cardMonth, String cardYear) {
	    
		
		blaze.cardDate(cardMonth, cardYear);
	}

	@When("User enters name on card {string}")
	public void enterCardName(String nameCard) {
	 
		blaze.nameCard(nameCard);
	}

	@When("User clicks remember")
	public void userClicksRemember() {
	
		blaze.selectRemember();
	}

	@When("User click purchase flight button")
	public void userClickFlight() {
	   
		blaze.purchaseFlight();
	}

	@Then("User verify success message {string}")
	public void userVerifyMessage(String message) throws InterruptedException {
	  
		blaze.verifyMessage(message);
		
		Thread.sleep(3000);
		Constants.driver.quit();
	}

	
	}
