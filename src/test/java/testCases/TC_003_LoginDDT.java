package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.DataProviders;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_003_LoginDDT extends BaseClass



{

	
	
@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
public void verify_loginDDT(String email,String password,String exp)
{
		logger.info("***************Starting TC_003_LoginDDT**********");
	try
	{
			HomePage hp= new HomePage(driver);
		hp.ClickMyAccount();
		logger.info("Clicked on home page link my Account");
		hp.ClickLogin(); // login link to get the logging page
		logger.info("Clicked on login link from myAccount Tab");
		
		//Creating LoginPage obj
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(password);
		lp.clickLogin(); // login button after entering password
		logger.info("Clicked on loging button");
	
		// Creating MyAccount page objs
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetPage = macc.ismymsgHeading();
		
		if (exp.equalsIgnoreCase("Valid"))
			{
				if (targetPage==true)
				{
					macc.clicklogout();
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertTrue(false);
				}
			}
				
			if (exp.equalsIgnoreCase("Invalid"))
			{
				if(targetPage==true)
				{
					macc.clicklogout();
					Assert.assertTrue(false);
				}
				else
				{
					Assert.assertTrue(true);
				}
			}
	}
	catch(Exception e)
	{
		Assert.fail();
	}
			logger.info("Finished TC_003_LoginDDT");
	}			
}

