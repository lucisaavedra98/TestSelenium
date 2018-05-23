package TestsSelenium.TestsSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PruebasChromeTiempo {

	public static void main(String[] args) {
		DriverSeleniumChrome driver = new DriverSeleniumChrome();
		String cadena;
		final WebDriverWait wait = new WebDriverWait(driver.getDriver(), 20);

		Actions action = new Actions(driver.getDriver());
		try {
			driver.getDriver().get("https://www.eltiempo.es/");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputSearch")));
			driver.getDriver().findElement(By.id("inputSearch")).sendKeys("Ecija");
			driver.getDriver().findElement(By.id("inputSearch")).sendKeys(Keys.ENTER);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Écija, Sevilla")));
			driver.getDriver().findElement(By.partialLinkText("Écija, Sevilla")).click();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@popup_date='23 May, 14:00']")));
			
			driver.getDriver().findElement(By.xpath("//div[@popup_date='23 May, 14:00']")).click();
			cadena = driver.getDriver().findElement(By.className("table_tooltip_forecast")).getText() 
					+ driver.getDriver().findElement(By.className("table_tooltip_feels_like")).getText()
					+ driver.getDriver().findElement(By.className("table_tooltip_prob_rain")).getText()
					+ driver.getDriver().findElement(By.className("table_tooltip_temp_c")).getText()
					+ driver.getDriver().findElement(By.className("table_tooltip_wind_speed")).getText();

			System.out.println(cadena);
			System.out.println("Exito.");
			driver.cerrarProceso();
			
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
