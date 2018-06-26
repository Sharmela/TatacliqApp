package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.BasePage;


public class ProductPage extends BasePage
{
	@FindBy(xpath="(//img[@class='picZoomer-pic lazy'])[1]")
	private WebElement dress;
	
	@FindBy(xpath="//a[.='UK/IND-8']")
	private WebElement sizeM;
	
	@FindBy(xpath="//button[@id='addToCartButton']")
	private WebElement add;
	
	@FindBy(xpath="//a[@class='mini-cart-link myBag-sticky']")
	private WebElement mybag;
	
	 public ProductPage(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	 
	 public void selePro()
	 {
	    dress.click();
		sizeM.click();
	 }
	 
	    public void add() throws InterruptedException
	    {
	    	Thread.sleep(50000);
			add.click();
		}
	    public void myBag()
	    {
	    	mybag.click();
	    }
}

