package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.BasePage;

public class WishList extends BasePage
{
	@FindBy(xpath="(//span[@class='plp-wishlist'])[1]")
	private WebElement sellist;
	
	@FindBy(xpath="//a[@id='myWishlistHeader']")
	private WebElement wish;
	
	public WishList(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void checking() throws InterruptedException
	{
		Thread.sleep(5000);
		sellist.click();
		wish.click();
	}
	
	
}
