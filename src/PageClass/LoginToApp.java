package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.BasePage;

public class LoginToApp extends BasePage
{
	@FindBy(xpath="//a[.='Sign In / Sign Up']")
	private WebElement signin;
	
	@FindBy(id="j_username_login")
	private WebElement emailid;
	
	@FindBy(id="j_password_login")
	private WebElement password;
	
	@FindBy(id="accountLoginButton")
	private WebElement login;
	
	public LoginToApp(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void signinBtn(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
		signin.click();
		
	}
	
	public void userName(String u)
	{
		emailid.sendKeys(u);
	}
	
	public void password(String p)
	{	
		password.sendKeys(p);
	}
	
	public void loginBtn()
	{
		login.click();
	}

}
