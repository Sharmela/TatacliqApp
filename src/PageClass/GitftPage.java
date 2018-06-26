package PageClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.BasePage;


public class GitftPage extends BasePage
{
	@FindBy(xpath="(//span[@class='btn giftAmountBtns'])[1]")
	private WebElement rupee;
	
	@FindBy(id="toEmailAddress")
	private WebElement e;
	
	@FindBy(id="giftCard_fromName")
	private WebElement fn;
	
	@FindBy(xpath="//button[@class='giftBuyBtn pull-right']")
	private WebElement b;
	
	@FindBy(id="closePop")
	private WebElement cls;
	
	public GitftPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void giftCard(String c,String i)
	{
		
		rupee.click();
		e.sendKeys(c);
		fn.sendKeys(i);
	}
	

	public void buying(WebDriver driver)
	{
		b.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		cls.click();
	}
}
