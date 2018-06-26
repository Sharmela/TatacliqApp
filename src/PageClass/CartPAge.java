package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.BasePage;

public class CartPAge extends BasePage
{
	@FindBy(xpath="//a[.='Lego Marvel Super Heroes (PS4)']")
	private WebElement pdt;

	@FindBy(xpath="//span[.='Remove']")
	private WebElement remove;
		
	public CartPAge(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void select()
	{
		pdt.click();
	}
	public void removeProduct()
	{
		remove.click();
	}

}
