package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import common.CommonBaseClass;

public class HomePage extends CommonBaseClass {

	String val = "";
	@FindBy(how = How.XPATH, using = "//a[@id='nav-hamburger-menu']")
    private WebElement hamburgerMenu;
	
	public WebElement gethamburgerMenu() {
		return hamburgerMenu;
	}
	
	
	public void NavigateMenu(String menuvalue)
	{
	 driver.findElement(By.xpath("//a/div[text()='"+menuvalue+"']")).click();
	}
	
	public void NavigateSubMenu(String submenuvalue)
	{
	driver.findElement(By.xpath("//a[text()='"+submenuvalue+"']")).click();	
	}
}
