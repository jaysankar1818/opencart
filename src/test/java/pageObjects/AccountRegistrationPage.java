package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
// from line 6 to line 12 is mandatory in all pages to invoke constructor
	public WebDriver driver;
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}

@FindBy(xpath="//input[@id='input-firstname']") 
@CacheLookup private WebElement txtfirstname;

@FindBy(xpath="//input[@id='input-lastname']") 
@CacheLookup private WebElement txtlastname;

@FindBy(xpath="//input[@id='input-email']") 
@CacheLookup private WebElement txtEmail;


@FindBy(xpath="//input[@id='input-telephone']") 
@CacheLookup private WebElement txttelephone;


@FindBy(xpath="//input[@id='input-password']") 
@CacheLookup private WebElement txtpassword;


@FindBy(xpath="//input[@id='input-confirm']") 
@CacheLookup private WebElement txtConfirmPassword;


@FindBy(xpath="//input[@name='agree']") 
@CacheLookup private WebElement chkdPolicy;

@FindBy(xpath="//input[@value='Continue']") 
@CacheLookup private WebElement btnContinue;

@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") 
@CacheLookup private WebElement msgConfirmation;	
	
public void setFirstName(String fname)
{
	txtfirstname.sendKeys(fname);
}

public void setLastName(String lname)
{
	txtlastname.sendKeys(lname);
}

public void setEmail(String email)
{
	txtEmail.sendKeys(email);
}


public void setTelephone(String tel)
{
	txttelephone.sendKeys(tel);
}



public void setPassword(String pwd)
{
	txtpassword.sendKeys(pwd);
}

public void setConfirmPassword(String pwd)
{
	txtConfirmPassword.sendKeys(pwd);
}




public void setPrivacyPolicy()
{
	chkdPolicy.click();
}

public void clickContinue ()
{
	btnContinue.click();
}


public String getConfirmationMsg() {
	try{
		return(msgConfirmation.getText());
	}catch(Exception e) {
		return (e.getMessage());
	}

}
}
