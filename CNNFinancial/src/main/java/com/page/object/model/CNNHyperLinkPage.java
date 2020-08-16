package com.page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CNNHyperLinkPage {
	
	public CNNHyperLinkPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='Grid-sc-1kcyc0j-0 sc-kjoXOD cxcFax']//*[@name='markets']")
	private WebElement marketLink;
	
	@FindBy(xpath="//*[@class='Grid-sc-1kcyc0j-0 sc-kjoXOD cxcFax']//*[@name='tech']")
	private WebElement techLink;
	
	@FindBy(xpath="//*[@class='Grid-sc-1kcyc0j-0 sc-kjoXOD cxcFax']//*[@name='media']")
	private WebElement mediaLink;
	
	@FindBy(xpath="//*[@class='Grid-sc-1kcyc0j-0 sc-kjoXOD cxcFax']//*[@name='success']")
	private WebElement successLink;
	
	@FindBy(xpath="//*[@class='Grid-sc-1kcyc0j-0 sc-kjoXOD cxcFax']//*[@name='perspectives']")
	private WebElement perspectiveLink;
	
	@FindBy(xpath="//*[@class='Grid-sc-1kcyc0j-0 sc-kjoXOD cxcFax']//*[@name='business-videos']")
	private WebElement videoLink;

	public WebElement getMarketLink() {
		return marketLink;
	}

	public WebElement getTechLink() {
		return techLink;
	}

	public WebElement getMediaLink() {
		return mediaLink;
	}

	public WebElement getSuccessLink() {
		return successLink;
	}

	public WebElement getPerspectiveLink() {
		return perspectiveLink;
	}

	public WebElement getVideoLink() {
		return videoLink;
	}			

}
