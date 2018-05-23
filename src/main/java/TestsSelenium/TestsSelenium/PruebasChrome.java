package TestsSelenium.TestsSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PruebasChrome {

	public static void main(String[] args) {
		DriverSeleniumChrome driver = new DriverSeleniumChrome();
		driver.getDriver().get("https://www.google.com/");
		final WebDriverWait wait = new WebDriverWait(driver.getDriver(),20);
		
		
		String resultados;
		
		Actions action = new Actions(driver.getDriver());
		
		
		driver.getDriver().get("https://www.primefaces.org/ultima/dashboard.xhtml");

		WebElement pagina = driver.getDriver().findElement(By.id("menuform:um_components"));
		pagina.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Sample Page")));
		action.moveToElement(driver.getDriver().findElement(By.partialLinkText("Sample Page")));
		action.click();
		action.perform();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_idt50:dialog2")));
		action.moveToElement(driver.getDriver().findElement(By.id("j_idt50:dialog2")));
		action.click();
		action.perform();
		//driver.getDriver().findElement(By.id("j_idt50:dialog2")).click();
		
		
		driver.getDriver().findElement(By.id("j_idt50:j_idt101")).sendKeys("Luciano");
		driver.getDriver().findElement(By.id("j_idt50:j_idt105")).sendKeys("usuario");
		driver.getDriver().findElement(By.id("j_idt50:j_idt108")).click();
		
		pagina = driver.getDriver().findElement(By.id("menuform:um_components"));
		pagina.click();
		
		pagina = driver.getDriver().findElement(By.id("menuform:um_messages"));
		pagina.click();
		
		driver.getDriver().findElement(By.id("j_idt51:default")).sendKeys("Esto es una prueba");
		driver.getDriver().findElement(By.id("j_idt51:txt")).sendKeys("texto");
		driver.getDriver().findElement(By.id("j_idt51:icon")).sendKeys("icono");
		driver.getDriver().findElement(By.id("j_idt51:inline")).sendKeys("ERROR FATAL");
		driver.getDriver().findElement(By.id("j_idt51:mtext_label")).click();
		driver.getDriver().findElement(By.id("j_idt51:mtext_2")).click();
		driver.getDriver().findElement(By.id("j_idt51:micon")).sendKeys("ERROR MAXIMO");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_idt51:submitButton")));
		action.moveToElement(driver.getDriver().findElement(By.id("j_idt51:submitButton")));
		action.click();
		action.perform();		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ui-messages-info-detail")));
		resultados =  driver.getDriver().findElement(By.className("ui-messages-info-detail")).getText();
		
		if(resultados.equals("Premium Layout")) {
			System.out.println("Formulario validado correctamente");
		}
		
		try {
			driver.cerrarProceso();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
