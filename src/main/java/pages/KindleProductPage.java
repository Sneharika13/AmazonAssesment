package pages;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import common.CommonBaseClass;

public class KindleProductPage extends CommonBaseClass{

	
	@FindBy(how = How.ID, using = "buy-now-button")
    private WebElement buyNow;
	
	public WebElement getbuyNow() {
		return buyNow;
	}
}
