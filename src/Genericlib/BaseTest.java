package Genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Constatnt
{
public WebDriver driver;
	
	@BeforeMethod
	public void openapp()
	{
		System.setProperty(key, value);
		driver=new FirefoxDriver();
		driver.get("https://www.tatacliq.com/");
	}
	
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
}
