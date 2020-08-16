package com.smoke.test;

import org.openqa.selenium.WebDriver;

import com.generic.code.CNNCheckHyperLinks;

public class SmokeTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		CNNCheckHyperLinks hpl = new CNNCheckHyperLinks();
		WebDriver driver = hpl.setupBrowser();
		hpl.checkMarketLink(driver);
		hpl.checkMediaLink(driver);
		hpl.checkTechLink(driver);
		hpl.checkSuccessLink(driver);
		hpl.checkPerspectiveLink(driver);
		hpl.checkVideoLink(driver);

	}

}
