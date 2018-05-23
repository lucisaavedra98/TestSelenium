package TestsSelenium.TestsSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BigCoockie {

	public static void main(String[] args) {
		DriverSeleniumChrome driver = new DriverSeleniumChrome();
		Actions action = new Actions(driver.getDriver());
		final WebDriverWait wait = new WebDriverWait(driver.getDriver(),20);

		int i=0;
		
		try {
			driver.getDriver().get("http://orteil.dashnet.org/cookieclicker/");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bigCookie")));
			
			while (true) {
			action.moveToElement(driver.getDriver().findElement(By.id("bigCookie")));
			action.click();
			action.perform();
			}
			
			
		} catch (Exception e) {
			System.out.println("Error.");
			try {
				driver.cerrarProceso();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
