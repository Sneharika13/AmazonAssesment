package amazonTestCases;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.CommonBaseClass;
import common.ConfigFileReader;
import pages.HomePage;
import pages.KindleProductPage;
import pages.LoginPage;



public class TestCases extends CommonBaseClass{
	
	
	static Properties properties; 
	
	@BeforeMethod
	public void beforeEachTest() {
		openURL(new ConfigFileReader().getProperty("baseURL"));
		
		
	}
	@AfterMethod
	public void afterEachTest() {
		
	}
	
	
	@Test
	public void Validate_Emailid_or_MobileNumber_prompt_When_Clicking_on_Buy_Now() throws Exception {
		
		try
		{
			test = extent.createTest("Validate_Emailid_or_MobileNumber_prompt_When_Clicking_on_Buy_Now");
			UpdateResult(true, "Opened url -->"+ConfigFileReader.getProperty("baseURL"));
			
			
			HomePage homepage=PageFactory.initElements(driver, HomePage.class);
			KindleProductPage KindleProductPage=PageFactory.initElements(driver, KindleProductPage.class);
			LoginPage LoginPage=PageFactory.initElements(driver, LoginPage.class);
			
			
			waitForPageToLoad(9);
			Thread.sleep(3000);
			click(homepage.gethamburgerMenu());
			UpdateResult(true, "Clicked on Hamburger Menu");
			waitForPageToLoad(9);
			Thread.sleep(3000);
			homepage.NavigateMenu("Kindle");
			UpdateResult(true, "Clicked on Main Menu");
			waitForPageToLoad(9);
			Thread.sleep(3000);
			homepage.NavigateSubMenu("Kindle Oasis");
			UpdateResult(true, "Clicked on Sub Menu");
			waitForPageToLoad(9);
			Thread.sleep(3000);
			click(KindleProductPage.getbuyNow());
			UpdateResult(true, "Clicked on Buy Now button");
			waitForPageToLoad(9);
			Thread.sleep(3000);
			String text  = getText(LoginPage.getemailLabel());
			UpdateResult(text.contains(ConfigFileReader.getProperty("emaillabel")), "Validate if email label is present");
			 Assert.assertTrue(text.contains(ConfigFileReader.getProperty("emaillabel")));
			Boolean res = isDisplayed(LoginPage.getemailOrMobileInput());
			UpdateResult(res, "Validate input field is displayed or not");
		waitForPageToLoad(7);
	}catch(Exception e)
		{
		e.printStackTrace();
		UpdateResult(false, "Test Case Failed with a exception");
		}
	}
	
}