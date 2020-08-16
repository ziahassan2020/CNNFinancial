package com.generic.code;

import static org.testng.Assert.assertEquals;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.config.BaseConfig;
import com.page.object.model.CNNHyperLinkPage;
import com.util.Highlighter;
import com.util.ScreenShot;

public class CNNCheckHyperLinks {
	
	CNNHyperLinkPage hyperLinkPagePF;
	
	public WebDriver setupBrowser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.navigate().to(BaseConfig.getConfig("URL"));
		driver.get(BaseConfig.getConfig("URL"));
		hyperLinkPagePF = new CNNHyperLinkPage(driver);
		ScreenShot.emptyScreenShotFolder();
		return driver;
	}
	
	public void checkMarketLink(WebDriver driver) throws Throwable {
		
		Highlighter.getcolor(driver, hyperLinkPagePF.getMarketLink(), "red");
		hyperLinkPagePF.getMarketLink().click();
		System.out.println(driver.getTitle());
		assertEquals(driver.getTitle(), BaseConfig.getConfig("MarketTitle"));
		driver.quit();
				
	}
	
	public void checkTechLink(WebDriver driver) throws Throwable {
//		hyperLinkPagePF = new CNNHyperLinkPage(driver);
		Highlighter.getcolor(driver, hyperLinkPagePF.getTechLink(), "red");
		hyperLinkPagePF.getTechLink().click();
		System.out.println(driver.getTitle());
		assertEquals(driver.getTitle(), BaseConfig.getConfig("TechTitle"));
		driver.quit();
				
	}
	
	public void checkMediaLink(WebDriver driver) throws Throwable {
//		hyperLinkPagePF = new CNNHyperLinkPage(driver);
		Highlighter.getcolor(driver, hyperLinkPagePF.getMediaLink(), "red");
		hyperLinkPagePF.getMediaLink().click();
		System.out.println(driver.getTitle());
		assertEquals(driver.getTitle(), BaseConfig.getConfig("MediaTitle"));
		driver.quit();
				
	}
	
	public void checkSuccessLink(WebDriver driver) throws Throwable {
//		hyperLinkPagePF = new CNNHyperLinkPage(driver);
		Highlighter.getcolor(driver, hyperLinkPagePF.getSuccessLink(), "red");
		hyperLinkPagePF.getSuccessLink().click();
		System.out.println(driver.getTitle());
		assertEquals(driver.getTitle(), BaseConfig.getConfig("SuccessTitle"));
		driver.quit();
				
	}
	public void checkPerspectiveLink(WebDriver driver) throws Throwable {
//		hyperLinkPagePF = new CNNHyperLinkPage(driver);
		Highlighter.getcolor(driver, hyperLinkPagePF.getPerspectiveLink(), "red");
		hyperLinkPagePF.getPerspectiveLink().click();
		System.out.println(driver.getTitle());
		assertEquals(driver.getTitle(), BaseConfig.getConfig("PerspectiveTitle"));
		driver.quit();
				
	}
	public void checkVideoLink(WebDriver driver) throws Throwable {
//		hyperLinkPagePF = new CNNHyperLinkPage(driver);
		Highlighter.getcolor(driver, hyperLinkPagePF.getVideoLink(), "red");
		hyperLinkPagePF.getVideoLink().click();
		System.out.println(driver.getTitle());
		assertEquals(driver.getTitle(), BaseConfig.getConfig("VideoTitle"));
		driver.quit();
				
	}

}
