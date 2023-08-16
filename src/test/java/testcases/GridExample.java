package testcases;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridExample {

	@Test
	public void testgrid() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setPlatform(Platform.WINDOWS);
		capabilities.setBrowserName("chrome");
		URL hubURL = new URL("http://192.168.29.135:4444/wd/hub"); // Client URL
		WebDriver driver = new RemoteWebDriver(hubURL, capabilities);
		driver.get("https://www.simplilearn.com");
		driver.quit();
	}
}
