package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.BasePage;

public class LogOutOfApp extends BasePage
{
	@FindBy(xpath="//span[@class='material-icons']")
	private WebElement hai;
	
	@FindBy(xpath="//a[.=' Sign Out']")
	private WebElement signout;
	
	public LogOutOfApp(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void loggingOut(Actions a) throws InterruptedException
	{
		a.moveToElement(hai).perform();
		a.moveToElement(signout).perform();
		Thread.sleep(10000);
		signout.click();
	}
}
