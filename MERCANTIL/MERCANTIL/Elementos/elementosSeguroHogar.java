package Elementos;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class elementosSeguroHogar {
	WebDriver driver;
    
      @FindBy(xpath="//*[@id=\"cookieModalConsent\"]")
      WebElement btnvisitar;
      
      @FindBy(xpath="//*[@id=\"menu-item-30907\"]")    		  
      WebElement segurosPersonales;
      
      @FindBy(xpath="//*[@id=\"menu-item-30908\"]")
      WebElement hogar;              
      
      @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div/div/div/div[3]/a")
      WebElement btnCotizarH;
      
 	 @FindBy(xpath="//*[@id=\"inputName\"]")
	 WebElement nombreApellidoH;
 	 
	 @FindBy(xpath="//*[@id=\"inputTel\"]")
	 WebElement telefonoH;
	 
	 @FindBy(xpath="//*[@id=\"inputemail\"]")
	 WebElement correroElecH;
	 
	 @FindBy(xpath="//*[@id=\"tipovivienda\"]")
	 WebElement tipoViviendaH;
	 
	 @FindBy(xpath="//*[@id=\"tipovivienda\"]/option[2]")
	 WebElement casaH;
	 
	 @FindBy(xpath="//*[@id=\"superficie\"]")
	 WebElement superficieMH;
	 
	 @FindBy(xpath="//*[@id=\"superficie\"]/option[3]")
	 WebElement superficieMvalorH;
	 
	 @FindBy(xpath="//*[@id=\"ubicacion\"]")
	 WebElement ubicaionH;
	
	 @FindBy(xpath="//*[@id=\"ubicacion\"]/option[2]")
	 WebElement ubicaionCABAH;
	 
	 @FindBy(xpath="//*[@id=\"cotizador-submit\"]")
     WebElement btnCotizarH2;
	 
	 @FindBy(xpath = "//*[@id=\"wc-button\"]")
	 WebElement clicChat;
	 
	@FindBy(xpath = "//*[@id=\"wc-button\"]/div[4]")
    WebElement abrirChat;
	
      
      public elementosSeguroHogar(WebDriver driver){
          this.driver = driver;
          PageFactory.initElements(new AjaxElementLocatorFactory (driver,30), this);
       }
      
      public void clickVisitarSitio() throws InterruptedException, IOException{
    	  btnvisitar.click();
    	  Thread.sleep(1000);      	  
      }                 
      
      public void clickSP() throws IOException, InterruptedException{
    	  segurosPersonales.click();
    	  Thread.sleep(1000);  
      }              
      
      public void clickHogar() throws InterruptedException, IOException{
    	  hogar.click();
    	  Thread.sleep(1000);
      }
      
      public void clickCotizarH() throws InterruptedException, IOException{
    	  btnCotizarH.click();
    	  Thread.sleep(1000);  
      }
      
      public void formularioHogar() throws InterruptedException, IOException{ 
  		Thread.sleep(2000);
  		nombreApellidoH.sendKeys("Cynthia Cabrera");
  		Thread.sleep(2000);
  		telefonoH.sendKeys("115050154328");
  		Thread.sleep(2000);
  		correroElecH.sendKeys("c.cynthia01@gmail.com");
  		Thread.sleep(2000);
  		tipoViviendaH.click();
		Thread.sleep(3000);
		casaH.click();  
		Thread.sleep(2000);
		superficieMH.click(); 
		Thread.sleep(2000);
		superficieMvalorH.click(); 
		Thread.sleep(2000);
		ubicaionCABAH.click();  
		Thread.sleep(2000);
		btnCotizarH2.click();  
		Thread.sleep(2000);
      }

	public void listarElementos() throws InterruptedException {
	    List<WebElement> elements = driver.findElements(By.cssSelector("#cotizador-result > div > table > tbody > tr > td"));
	    
	    for(WebElement element: elements) {
	    	Thread.sleep(2000);
	    	System.out.println("Seguro de hogar - Mercantilandina:" + element.getText());
	    }
	
		}
	
	public void costoMensual() {
	    List<WebElement> costo = driver.findElements(By.id("costo"));
	   	     
		    for(WebElement costos: costo) {
		    	String positivo = costos.getText(); 
		    	String positivo1=positivo.replace("$ ", "");
				int valorC=Integer.parseInt(positivo1);
				
				boolean Entero = isStringInteger(valorC, 10);
		        System.out.println("Es "+valorC+" un entero?  --->  " + Entero);
	  				
				if (valorC > 0) {
					System.out.println(valorC + " Es mayor a cero y positivo");
				}
				else
					System.out.println(valorC + " Es negativo");
		    	}
		    }

	private boolean isStringInteger( int valorC, int i) {
		if (valorC > 0) {
	
		}
		return true;
	}
} 	

