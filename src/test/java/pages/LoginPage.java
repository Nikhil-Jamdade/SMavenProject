package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// this constructor was created in order to pass new driver value everytime we start a new test
	WebDriver pagedriver;

	// ----------------- Objects ------------------------//

	@FindBy(linkText = "Log in")
	WebElement LoginLink;
	@FindBy(className = "email")
	WebElement Email;
	@FindBy(id = "password")
	WebElement Password;
	@FindBy(name = "btn_login")
	WebElement LoginButton;

	// ------------------Methods-------------------------//

	public LoginPage(WebDriver driver) {
		this.pagedriver = driver;
		PageFactory.initElements(pagedriver, this);
	}

	public void LoginFunction(String UserNameVal, String PwdVal) {
		LoginLink.click();
		Email.sendKeys(UserNameVal);
		Password.sendKeys(PwdVal);
		LoginButton.click();
	}
}
