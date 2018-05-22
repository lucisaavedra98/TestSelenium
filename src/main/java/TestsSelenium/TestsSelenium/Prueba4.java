package TestsSelenium.TestsSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prueba4 {

	public static void main(String[] args) throws IOException {

		DriverSeleniumFirefox driver = new DriverSeleniumFirefox();

		final WebDriverWait wait = new WebDriverWait(driver.getDriver(), 20);

		Actions action = new Actions(driver.getDriver());
		try {
			driver.getDriver().get("https://www.eltiempo.es/");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputSearch")));
			driver.getDriver().findElement(By.id("inputSearch")).sendKeys("Ecija");
			driver.getDriver().findElement(By.id("inputSearch")).sendKeys(Keys.ENTER);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Écija, Sevilla")));
			driver.getDriver().findElement(By.partialLinkText("Écija, Sevilla")).click();

			driver.getDriver().findElement(By.xpath("//div[@popup_date='22 May, 14:00']")).click();
			String var1 = driver.getDriver().findElement(By.className("table_tooltip_forecast")).getText();
			String var2 = driver.getDriver().findElement(By.className("table_tooltip_feels_like")).getText();
			String var3 = driver.getDriver().findElement(By.className("table_tooltip_prob_rain")).getText();
			String var4 = driver.getDriver().findElement(By.className("table_tooltip_temp_c")).getText();
			String var5 = driver.getDriver().findElement(By.className("table_tooltip_wind_speed")).getText();

			System.out.println(var1);
			System.out.println(var2);
			System.out.println(var3);
			System.out.println(var4);
			System.out.println(var5);
			System.out.println("Exito.");
			driver.cerrarProceso();
		} catch (Exception e) {
			System.out.println("Error.");
			driver.cerrarProceso();
		}

	}
}
