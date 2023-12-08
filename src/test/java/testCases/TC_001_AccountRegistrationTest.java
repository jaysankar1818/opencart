package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass 
{
	
	
	@Test(groups= {"regression","master"})
	public void verify_account_registration()
	{
		logger.info("*******  Starting TC_001_AccountRegistrationTest ***** ");
		logger.debug("application logs..........");
		try
		{
		HomePage hp = new HomePage(driver);
		hp.ClickMyAccount();
		
		logger.info("Clicked on My Account link");
		hp.ClickRegister();
		logger.info("Clicked on Register link");
		
		logger.info("Entering customer information");
		
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		
		regpage.setFirstName(randomeString().toUpperCase());
		regpage.setLastName(randomeString().toUpperCase());
		regpage.setEmail(randomeString()+"@gmail.com");
		regpage.setTelephone(randomeAlphaNumeric());
		
		String password = randomeAlphaNumeric();
		
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		 
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		logger.info("Clicked on continue");
		
		String confirmationmsg = regpage.getConfirmationMsg();
		logger.info("Validating Expected Message.......");
		
		if (confirmationmsg.equals("Your Account Has Been Created!"))
		{
			logger.info("Test Passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Test Failed");
			logger.debug("debug logs.....");
			Assert.fail();
		}
		
		}
		catch (Exception e)
		{
			logger.error("test Failed");
			Assert.fail();
			
		}
		
		logger.info("*******  Ended TC_001_AccountRegistrationTest ***** ");
		
	}
		
}
