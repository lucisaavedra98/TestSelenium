package TestsSelenium.TestsSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prueba3 {

	public static void main(String[] args) throws IOException {
		
		DriverSeleniumFirefox driver = new DriverSeleniumFirefox();
		String resultados;
		
		Actions action = new Actions(driver.getDriver());
		
		
		driver.getDriver().get("https://www.primefaces.org/ultima/dashboard.xhtml");

		WebElement pagina = driver.getDriver().findElement(By.id("menuform:um_components"));
		pagina.click();
		
		pagina = driver.getDriver().findElement(By.partialLinkText("Sample Page"));
		pagina.click();
		
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
		driver.getDriver().findElement(By.id("j_idt51:submitButton")).click();
		
		resultados =  driver.getDriver().findElement(By.className("ui-messages-info-detail")).getText();
		
		if(resultados.equals("Premium Layout")) {
			System.out.println("Formulario validado correctamente");
		}
		
		driver.cerrarProceso();		
	}

}
