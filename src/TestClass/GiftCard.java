package TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Genericlib.BaseTest;
import Genericlib.Excel;
import PageClass.GitftPage;
import PageClass.HomePage;
import PageClass.LogOutOfApp;
import PageClass.LoginToApp;

public class GiftCard extends BaseTest
{
	@Test
	public void giftCardActions() throws InterruptedException
	{
		Actions a = new Actions(driver);
	
		LoginToApp t1 = new LoginToApp(driver);
		t1.signinBtn(driver);
		String u = Excel.ExcelData(epath, "Sheet1", 0 , 1);
		String p = Excel.ExcelData(epath, "Sheet1", 1 , 1);
		String c= Excel.ExcelData(epath, "Sheet1", 0 , 1);
		String i = Excel.ExcelData(epath, "Sheet1", 6 , 1);
		t1.userName(u);
		t1.password(p);
		t1.loginBtn();
		HomePage h = new HomePage(driver);
		h.giftCrd();
		GitftPage g = new GitftPage(driver);
		g.giftCard(c, i);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,200)");
		g.buying(driver);
		j.executeScript("window.scrollBy(0,-200)");
		
		LogOutOfApp t2 = new LogOutOfApp(driver);
		t2.loggingOut(a);
		Reporter.log("Test class successfully executed",true);
}
}
