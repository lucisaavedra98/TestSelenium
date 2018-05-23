package TestsSelenium.TestsSelenium;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestsUnitarios {
	DriverSeleniumFirefox driver;
	String resultados;
	Actions action;
	
	@Before
	public void inicializar(){
		driver = new DriverSeleniumFirefox();
		action = new Actions(driver.getDriver());
	}
	
	@Test
	public void deberiaRellenarYValidarLosFormularios() throws IOException {
		try {
			driver.getDriver().get("https://www.primefaces.org/ultima/dashboard.xhtml");

			WebElement pagina = driver.getDriver().findElement(By.id("menuform:um_components"));
			pagina.click();
			
			pagina = driver.getDriver().findElement(By.partialLinkText("Sample Page"));
			pagina.click();
			
			action.moveToElement(driver.getDriver().findElement(By.id("j_idt50:dialog2")));
			action.click();
			action.perform();
			
			
			driver.getDriver().findElement(By.id("j_idt50:j_idt101")).sendKeys("Luciano");
			driver.getDriver().findElement(By.id("j_idt50:j_idt105")).sendKeys("usuario");
			driver.getDriver().findElement(By.id("j_idt50:j_idt108")).click();
			
			pagina = driver.getDriver().findElement(By.id("menuform:um_components"));
			pagina.click();
			
			pagina = driver.getDriver().findElement(By.id("menuform:um_messages"));
			pagina.click();
			
			driver.getDriver().findElement(By.id("j_idt51:defaul")).sendKeys("Esto es una prueba");
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
		} 
		catch (Exception e) {
			this.takesScreenshot("C:\\capturas\\fail");
		}
		finally {
			driver.cerrarProceso();
		}
		
	}
	
	
	public void takesScreenshot(String ruta) {
		try {
			System.out.println("Realizando captura");
			TakesScreenshot obj = (TakesScreenshot) driver.getDriver();
			File origen = obj.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
			String date = LocalDateTime.now()+"";
			
			File destino = new File(ruta+"\\fail"+date.replace(":","-")+".png");
			System.out.println("Captura realizada");
			System.out.println("Destino: "+destino);
			try {

				FileUtils.copyFile(origen,destino);
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}


