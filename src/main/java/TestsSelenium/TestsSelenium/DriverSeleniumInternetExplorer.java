package TestsSelenium.TestsSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverSeleniumInternetExplorer extends DriverSelenium {

	public DriverSeleniumInternetExplorer() {
		final StringBuilder path = new StringBuilder();

		path.append("C:\\microsoftwebdriver.exe");

		System.setProperty("webdriver.edge.driver", path.toString());

		// Start Edge Session
		driver = new EdgeDriver();

		driver.manage().window().maximize();
	}

}
