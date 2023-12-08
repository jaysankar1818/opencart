package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super (driver); //invoking parent class(constructor from BasePage)
	}
	
	
	
@FindBy(xpath="//span[normalize-space()='My Account']") 
@CacheLookup private WebElement lnkMyAccount;	

@FindBy(xpath="//a[normalize-space()='Register']") 
@CacheLookup private WebElement lnkRegister;

@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']") 
@CacheLookup private WebElement linklogin;


	public void ClickMyAccount()
	{
		lnkMyAccount.click();
	}
	
	public void ClickRegister()
	{
		
		lnkRegister.click();
	}

	
	public void ClickLogin()
	{
		linklogin.click();
	}


}
