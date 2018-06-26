package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.BasePage;


public class SelectProPage extends BasePage
{
	@FindBy(xpath="//a[.='Lego Marvel Super Heroes (PS4)']")
	private WebElement game;
	
	@FindBy(xpath="(//button[@class='btn-block js-add-to-cart'])[1]")
	private WebElement buy;
	
	public SelectProPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void selectProduct()
	{
	game.click();
	buy.click();
	}
}
