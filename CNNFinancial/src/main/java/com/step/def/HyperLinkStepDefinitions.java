package com.step.def;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.config.BaseConfig;
import com.generic.code.CNNCheckHyperLinks;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HyperLinkStepDefinitions {
	
	WebDriver driver;
	CNNCheckHyperLinks hpl;

	@Given("User setup the browser")
	public void user_setup_the_browser() throws Throwable {
	    hpl = new CNNCheckHyperLinks();
	    driver = hpl.setupBrowser();
	}

	@Given("User on CNN Business Website")
	public void user_on_CNN_Business_Website() throws Throwable {		
	    assertEquals(driver.getTitle(),BaseConfig.getConfig("MainTitle"));
	
	}

	@When("User Clicks on Market Link")
	public void user_Clicks_on_Market_Link() throws Throwable {
	    hpl.checkMarketLink(driver);
	}

	@When("User Clicks on Tech Link")
	public void user_Clicks_on_Tech_Link() throws Throwable {
		hpl.checkTechLink(driver);
	    
	}

	@When("User Clicks on Media Link")
	public void user_Clicks_on_Media_Link() throws Throwable {
		hpl.checkMediaLink(driver);
	}

	@When("User Clicks on Success Link")
	public void user_Clicks_on_Success_Link() throws Throwable {
	    hpl.checkSuccessLink(driver);
	}

	@When("User Clicks on Perspective Link")
	public void user_Clicks_on_Perspective_Link() throws Throwable {
		hpl.checkPerspectiveLink(driver);
	}

	@When("User Clicks on Video Link")
	public void user_Clicks_on_Video_Link() throws Throwable {
	    hpl.checkVideoLink(driver);
	}

}


