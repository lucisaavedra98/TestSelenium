package TestsSelenium.TestsSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSeleniumChrome extends DriverSelenium {

	public DriverSeleniumChrome() {
		final StringBuilder path = new StringBuilder();

		path.append("C:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", path.toString());

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
}
