package TestsSelenium.TestsSelenium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Main {

	public static void main(String[] args) throws IOException {
		
		DriverSeleniumFirefox driver = new DriverSeleniumFirefox();
		String resultados;
		
		driver.getDriver().get("https://www.google.com/");

		driver.getDriver().findElement(By.id("lst-ib")).sendKeys("lista convocados seleccion española mundial 2018 rtve");
		
		// driver.getDriver().findElement(By.id("lst-ib")).submit();
		
		driver.getDriver().findElement(By.name("btnK")).click();
		
		resultados = driver.getDriver().findElement(By.id("resultStats")).getText();
		System.out.println(resultados);
		
		WebElement lista = driver.getDriver().findElement(By.partialLinkText("Mundial 2018 | Selección española - RTVE.es"));
		
		lista.click();
		
//		By.partialLinkText("sdfs");
//		By.linkText("");
		System.out.println("");
		
		List<WebElement> registros = driver.getDriver().findElement(By.className("section")).
				findElements(By.tagName("p"));
		
		for (WebElement elemento : registros) {
			System.out.println(elemento.getText());
			System.out.println("");
		}
		
		driver.cerrarProceso();
	}

}
