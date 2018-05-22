package TestsSelenium.TestsSelenium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prueba2 {

	public static void main(String[] args) throws IOException {
		
		DriverSeleniumFirefox driver = new DriverSeleniumFirefox();
		String resultados;
		
//		final WebDriverWait wait = new WebDriverWait(driver.getDriver(),20);
		
//		driver.getDriver().get("https://www.google.com/");
//
//		driver.getDriver().findElement(By.id("lst-ib")).sendKeys("primefaces showcase");
//		
//		// driver.getDriver().findElement(By.id("lst-ib")).submit();
//		
//		driver.getDriver().findElement(By.name("btnK")).click();
//		
//		resultados = driver.getDriver().findElement(By.id("resultStats")).getText();
//		System.out.println(resultados);
//		
//		WebElement pagina = driver.getDriver().findElement(By.partialLinkText("PrimeFaces ShowCase"));
//		
//		pagina.click();
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SubMenu-Data")));
//		
//		pagina = driver.getDriver().findElement(By.id("SubMenu-Data"));
//		pagina.click();
//		
//		pagina = driver.getDriver().findElement(By.partialLinkText("• DataTable"));
//		
//		pagina.click();
//		
//		System.out.println("");
//		
//		List<WebElement> registros = driver.getDriver().findElements(By.className("ui-column-title"));
//		
//		for (WebElement elemento : registros) {
//			System.out.println(elemento.getText());
//			System.out.println("");
//		}
//		
		
		driver.getDriver().get("https://www.google.com/");

		driver.getDriver().findElement(By.id("lst-ib")).sendKeys("primefaces showcase");
		
		// driver.getDriver().findElement(By.id("lst-ib")).submit();
		
		driver.getDriver().findElement(By.name("btnK")).click();
		
		resultados = driver.getDriver().findElement(By.id("resultStats")).getText();
		System.out.println(resultados);
		
		WebElement pagina = driver.getDriver().findElement(By.partialLinkText("DataTable"));
		
		pagina.click();
		
		System.out.println("");
		
		List<WebElement> registros = driver.getDriver().findElements(By.className("ui-column-title"));
		
		for (WebElement elemento : registros) {
			System.out.println(elemento.getText());
			System.out.println("");
		}
		
		
		driver.cerrarProceso();
	}

}
