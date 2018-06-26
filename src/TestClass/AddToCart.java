package TestClass;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import Genericlib.BaseTest;
import Genericlib.Excel;
import PageClass.HomePage;
import PageClass.LogOutOfApp;
import PageClass.LoginToApp;
import PageClass.ProductPage;

public class AddToCart extends BaseTest
{
	@Test
	public void addToCart() throws InterruptedException
	{
		Actions a = new Actions(driver);
		LoginToApp t1 = new LoginToApp(driver);
		Thread.sleep(1000);
		t1.signinBtn(driver);
		String u = Excel.ExcelData(epath, "Sheet1", 0 , 1);
		String p = Excel.ExcelData(epath, "Sheet1", 1 , 1);
		t1.userName(u);
		t1.password(p);
		t1.loginBtn();
		HomePage h = new HomePage(driver);
		h.department(a);
		h.womenSection(a);
		h.kurtasKurties(a);
		ProductPage pp = new ProductPage(driver);
		pp.selePro();
		pp.myBag();
		LogOutOfApp t2 = new LogOutOfApp(driver);	
		t2.loggingOut(a);
		Reporter.log("Test class successfully executed",true);
}
}
