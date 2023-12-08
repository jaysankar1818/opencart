package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	

@FindBy(xpath="//input[@id='input-email']") 
@CacheLookup private WebElement txtEMailAddress;

@FindBy(xpath="//input[@id='input-password']") 
@CacheLookup private WebElement txtpassword;

@FindBy(xpath="//input[@value='Login']") 
@CacheLookup private WebElement btnlogin;
	
	
	public void setEmail(String email)
	{
		txtEMailAddress.sendKeys(email);
	}
	
	public void setPassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
		
	public void clickLogin()
	{
		btnlogin.click();
	}

	
	
	

}
