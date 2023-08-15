package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;
import pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseClass {
	@Test
	public void test1() throws InterruptedException {

		LoginPage login = new LoginPage(driver);
		login.LoginFunction("abc@gmail.com", "G!xXer@1234");
		Thread.sleep(2000);
		WebElement error = driver.findElement(By.id("msg_box"));
		String ActError = error.getText();
		String ExpError = "The email or password you have entered is invalid.";

		Assert.assertEquals(ExpError, ActError);
	}

	@Test
	public void test2() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("nikhiljamdade05@gmail.com", "G!xXer@12");
		Thread.sleep(10000);
	}

	@Test
	public void test4() throws FilloException, InterruptedException {

		Recordset recordset = connection.executeQuery("select * from data where TestName='test4'");
		recordset.next();

		String UserName = recordset.getField("UserName");
		String Password = recordset.getField("Password");

		LoginPage login = new LoginPage(driver);
		login.LoginFunction(UserName, Password);
		Thread.sleep(2000);
	}

}