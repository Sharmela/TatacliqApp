package Genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage extends BaseTest
{
	public static void Elementpresent(WebElement Element,WebDriver driver)
	{
		try
		{
			WebDriverWait w = new WebDriverWait(driver, 10);
			w.until(ExpectedConditions.visibilityOf(Element));
			Reporter.log("pass");
		}
		catch(Exception e)
		{
			Reporter.log("Fail");
			Assert.fail();
		}
		
	}
	public void verifytitle(String s)
	{
		try
		{
			WebDriverWait w = new WebDriverWait(driver, 10);
			w.until(ExpectedConditions.titleContains(s));
			Reporter.log("pass");
		}
		catch(Exception e)
		{
			Reporter.log("Fail");
			Assert.fail();
		}
	}
	public static void EleClick(WebElement Element,WebDriver driver)
	{
		try
		{
			WebDriverWait w = new WebDriverWait(driver, 10);
			w.until(ExpectedConditions.elementToBeClickable(Element));
			Reporter.log("pass");
		}
		catch(Exception e)
		{
			Reporter.log("Fail");
			Assert.fail();
		}
	}
}
