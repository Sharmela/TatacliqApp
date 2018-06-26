package TestClass;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Genericlib.BaseTest;
import Genericlib.Excel;
import PageClass.HomePage;
import PageClass.LogOutOfApp;
import PageClass.LoginToApp;

public class TrackProduct extends BaseTest
{
	@Test
	public void trackingProduct() throws InterruptedException
	{
		Actions a = new Actions(driver);
		LoginToApp t1 = new LoginToApp(driver);
		t1.signinBtn(driver);
		String u = Excel.ExcelData(epath, "Sheet1", 0 , 0);
		String p = Excel.ExcelData(epath, "Sheet1", 1 , 0);
		t1.userName(u);
		t1.password(p);
		t1.loginBtn();
		HomePage h = new HomePage(driver);
		h.track();
		LogOutOfApp t2 = new LogOutOfApp(driver);
		t2.loggingOut(a);
		Reporter.log("Test class successfully executed",true);
}
}
