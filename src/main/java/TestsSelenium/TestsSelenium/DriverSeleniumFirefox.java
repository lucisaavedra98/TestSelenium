package TestsSelenium.TestsSelenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.internal.ProfilesIni;

//@Component
public class DriverSeleniumFirefox extends DriverSelenium{
	private static final String FIREFOX_PROFILE_DEFAULT = "default";
	
	public DriverSeleniumFirefox() {
		final StringBuilder path = new StringBuilder();
		
		path.append("C:\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", path.toString());
		
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
		
		final FirefoxOptions options = new FirefoxOptions();
		
		// Modo vista consola
		// options.setHeadless(true)
		
		//Profile
		final ProfilesIni profileIni = new ProfilesIni();
		
		options.setProfile(profileIni.getProfile(FIREFOX_PROFILE_DEFAULT));
		
		
		driver = new FirefoxDriver(options);
		
		// maximizar la ventana
		driver.manage().window().maximize();
	}
	
	
}
