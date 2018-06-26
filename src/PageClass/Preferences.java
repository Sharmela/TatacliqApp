package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.BasePage;

public class Preferences extends BasePage
{
	@FindBy(xpath="//span[@class='material-icons']")
	private WebElement hai;
	
	@FindBy(id="giftCard_fromName")
	private WebElement pre;
	
	public Preferences(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void preference(Actions act) throws InterruptedException
	{
		act.moveToElement(hai).perform();
		act.moveToElement(pre).perform();
		pre.click();
	}
}
