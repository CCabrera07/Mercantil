package MERCANTIL.MERCANTIL;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	WebDriver driver;
	String driverPath = "D:\\Profiles\\AyC Fotos\\Documentos\\Selenium Web driver JAVA\\MERCANTIL\\Drivers"; //Ubicacion del Driver
	String urlTest ="https://www.mercantilandina.com.ar/"; //Pagina a la cual vamos a acceder

    @Test
    public void shouldAnswerWithTrue()
    {
    	System.setProperty("webdriver.chrome.driver",driverPath); //Establece donde esta tu ChromeDriver
		driver= new ChromeDriver(); //Lo instancia
		System.out.println("Inicio de suite de pruebas");
		driver.get(urlTest); } //Abre la URL
    }

