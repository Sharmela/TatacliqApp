package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.BasePage;

public class HomePage extends BasePage
{
	@FindBy(xpath="//div[@class='toggle shop_dept']")
	private WebElement deptmnt;
	
	@FindBy(xpath="(//a[.='Men'])[2]")
	private WebElement women;
	
	@FindBy(xpath="(//a[.='Casual Shoes'])[2]")
	private WebElement kandk;
	
	@FindBy(xpath="(//div[@class='home-best-pick-carousel-img'])[6}")
	private WebElement pro;
	
	@FindBy(xpath="//a[.='Puma Halley IDP Dark Grey & Maroon Running Shoes']")
	private WebElement apple;
	
	@FindBy(id="js-site-search-input")
	private WebElement search;
	
	@FindBy(id="searchButton")
	private WebElement icon;
	
	@FindBy(xpath="//a[@onclick='openTrackOrder()']")
	private WebElement tracking;
	
	@FindBy(xpath="(//button[@class='close'])[1]")
	private WebElement close;
	
	@FindBy(linkText="Gift Card")
	private WebElement gift;

    public HomePage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void department(Actions a) throws InterruptedException
	{
		a.moveToElement(deptmnt).perform();	
	}
    public void womenSection(Actions a) throws InterruptedException
    {
		a.moveToElement(women).perform();
    }
    
    public void kurtasKurties(Actions a) throws InterruptedException
    {
		a.moveToElement(kandk).perform();
		kandk.click();
    }
    
    public void checkPro()
	{
		pro.click();
		apple.click();
		
	}
	
    public void search(String s)
	{
		search.sendKeys(s);
		icon.click();
	}
    
    public void track()
	{
		tracking.click();
		close.click();
	}
    
    public void giftCrd()
    {
    	gift.click();
    }
}
