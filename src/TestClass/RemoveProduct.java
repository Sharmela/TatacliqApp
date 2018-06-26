package TestClass;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Genericlib.BaseTest;
import Genericlib.Excel;
import PageClass.CartPAge;
import PageClass.HomePage;
import PageClass.LogOutOfApp;
import PageClass.LoginToApp;
import PageClass.ProductPage;

public class RemoveProduct extends BaseTest
{
	@Test
	public void removeProductFromCart() throws InterruptedException
	{
		Actions a = new Actions(driver);
	
	    LoginToApp t1 = new LoginToApp(driver);
		t1.signinBtn(driver);
		String u = Excel.ExcelData(epath, "Sheet1", 0 , 1);
		String p = Excel.ExcelData(epath, "Sheet1", 1 , 1);
		t1.userName(u);
		t1.password(p);
		t1.loginBtn();
		HomePage h = new HomePage(driver);
		CartPAge c = new CartPAge(driver);
		ProductPage pp = new ProductPage(driver);
		String s = Excel.ExcelData(epath, "Sheet1", 2 , 1);
		h.search(s);
		c.select();
		pp.add();
		c.removeProduct();
		LogOutOfApp t2 = new LogOutOfApp(driver);
		t2.loggingOut(a);
		Reporter.log("Test class successfully executed",true);
}
}
