package TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Genericlib.BaseTest;
import Genericlib.Excel;
import PageClass.HomePage;
import PageClass.LogOutOfApp;
import PageClass.LoginToApp;

public class SelectProduct extends BaseTest
{
	@Test
	public void selectTheProduct() throws InterruptedException
	{
		Actions a = new Actions(driver);
	
		LoginToApp t1 = new LoginToApp(driver);
		t1.signinBtn(driver);
		String u = Excel.ExcelData(epath, "Sheet1", 0 , 0);
		String p = Excel.ExcelData(epath, "Sheet1", 1 , 0);
		String s = Excel.ExcelData(epath, "Sheet1", 5 , 0);
		t1.userName(u);
		t1.password(p);
		t1.loginBtn();
		HomePage h = new HomePage(driver);
		h.search(s);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,500)");
		h.checkPro();
		LogOutOfApp t2 = new LogOutOfApp(driver);
		t2.loggingOut(a);
}
}
