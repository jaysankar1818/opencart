package pageObjects;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class miscellaneous {

	//click action....
	//@FindBy(xpath="//button[normalize-space()='Continue']") 
	//@CacheLookup private WebElement btnContinue;
	/*
	public void clickContinue ()
	{
		btnContinue.click();
	}
	*/
	
	//sol1 
	//	btnContinue.click();
		
		//sol2 
		//btnContinue.submit();
		
		//sol3
		//Actions act=new Actions(driver);
		//act.moveToElement(btnContinue).click().perform();
					
		//sol4
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", btnContinue);
		
		//Sol 5
		//btnContinue.sendKeys(Keys.RETURN);
		
		//Sol6  
		//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
	
	//amigos@gmail.com
	//abc123
	
	//astro123@gmail.com
	//abc123
	
	
	
}
