package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass 

{
	@Test(groups= {"sanity","master"})
	public void verify_login()
	{
		logger.info("*********Starting TC_002LoginTest**************");
		logger.debug("Capturing application debug logs.......");
		
		try
		{
		
		//Creating HomePage objs	
		HomePage hp= new HomePage(driver);
		hp.ClickMyAccount();
		logger.info("Clicked on home page link my Account");
		hp.ClickLogin(); // login link to get the logging page
		logger.info("Clicked on login link from myAccount Tab");
		
		//Creating LoginPage obj
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin(); // login button after entering password
		logger.info("Clicked on loging button");
	
		// Creating MyAccount page objs
		MyAccountPage macc=new MyAccountPage(driver);
		
		boolean targetPage = macc.ismymsgHeading();
		
		if (targetPage==true)
		{
			logger.info("Login test is passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Login test is Failed");
			Assert.fail();
		}
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("*********Finished TC_002LoginTest**************");	
	}
}
