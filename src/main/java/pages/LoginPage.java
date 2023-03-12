package pages;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import common.CommonBaseClass;

public class LoginPage extends CommonBaseClass{

	
	@FindBy(how = How.XPATH, using = "//input[@id='ap_email']")
    private WebElement emailOrMobileInput;
	
	public WebElement getemailOrMobileInput() {
		return emailOrMobileInput;
	}
	
	@FindBy(how = How.XPATH, using = "//label[@for='ap_email']")
    private WebElement emailLabel;
	
	public WebElement getemailLabel() {
		return emailLabel;
	}
}
