package TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Genericlib.BaseTest;
import Genericlib.Excel;
import PageClass.HomePage;
import PageClass.LogOutOfApp;
import PageClass.LoginToApp;

public class CheckProduct extends BaseTest
{
		@Test
		public void checkingForProduct() throws InterruptedException
		{
		LoginToApp t1 = new LoginToApp(driver);
		t1.signinBtn(driver);
		String u = Excel.ExcelData(epath, "Sheet1", 0 , 1);
		String p = Excel.ExcelData(epath, "Sheet1", 1 , 1);
		t1.userName(u);
		t1.password(p);
		t1.loginBtn();
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,500)");
		
		HomePage h = new HomePage(driver);
		h.checkPro();
		Actions a = new Actions(driver);
		LogOutOfApp t2 = new LogOutOfApp(driver);
		t2.loggingOut(a);
		Reporter.log("Test class successfully executed",true);
		}
	}