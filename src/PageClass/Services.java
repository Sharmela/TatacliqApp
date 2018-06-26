package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.BasePage;

public class Services extends BasePage
{
	@FindBy(xpath="//a[.='Customer Service']")
	private WebElement cs;
	
	
	public Services(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void proBrand()
	{
		cs.click();
		
	}
}
