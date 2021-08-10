package MERCANTIL.MERCANTIL;
	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;




		public class TT {
			WebDriver driver;
			String driverPath = "D:\\Profiles\\AyC Fotos\\Documentos\\Selenium Web driver JAVA\\MERCANTIL\\Drivers"; //Ubicacion del Driver
			String urlTest ="https://www.mercantilandina.com.ar/"; //Pagina a la cual vamos a acceder

			@BeforeClass
			public void setup(){  //Es un método que no devuelve ningun valor Void
			System.setProperty("webdriver.chrome.driver",driverPath); //Establece donde esta tu ChromeDriver
			driver= new ChromeDriver(); //Lo instancia
			System.out.println("Inicio de suite de pruebas");
			driver.get(urlTest); } //Abre la URL

	
					

}
		
		
