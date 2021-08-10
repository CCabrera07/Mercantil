package Pruebas;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import Elementos.elementosSeguroHogar;

public class TestBase {
	WebDriver driver;
	String driverPath = "D:\\Profiles\\AyC Fotos\\Documentos\\Selenium Web driver JAVA\\MERCANTIL\\Drivers\\chromedriver.exe";
    String urlTest ="https://www.mercantilandina.com.ar";

@SuppressWarnings("deprecation")
@BeforeSuite
public void test(){

	System.setProperty("webdriver.chrome.driver",driverPath);                                                  
	driver= new ChromeDriver();
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	System.out.println("Prueba Cotizar Hogar");                                                
	driver.get(urlTest);
	}

@AfterTest
public void cerrarPagina(){
driver.quit();
} 

@Test (priority=0)
public void Hogar() throws InterruptedException, IOException{
	
	elementosSeguroHogar objVisitar=new elementosSeguroHogar(driver);
	objVisitar.clickVisitarSitio();
	
	elementosSeguroHogar objSP=new elementosSeguroHogar(driver);
	objSP.clickSP();
	

	elementosSeguroHogar objHogar=new elementosSeguroHogar(driver);
	objHogar.clickHogar();
                
	elementosSeguroHogar objCotizarH=new elementosSeguroHogar(driver);
	objCotizarH.clickCotizarH();
	
	elementosSeguroHogar objFormH = new elementosSeguroHogar(driver);
	objFormH.formularioHogar();
	
	elementosSeguroHogar objListElements = new elementosSeguroHogar(driver);
	objListElements.listarElementos();
	
	elementosSeguroHogar objCostoMensual = new elementosSeguroHogar(driver);
	objCostoMensual.costoMensual();

} 

}