package creadorContenidoShop.Contacto;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class PageContacto extends PageObject{

	@FindBy(xpath="(//input[@name='your-name'])[1]")
	static WebElement campoNombre;
	
	@FindBy(xpath="(//input[@name='your-email'])[1]")
	static WebElement campoEmail;
	@FindBy(xpath="(//input[@name='your-subject'])[1]")
	static WebElement campoTitulo;
	@FindBy(xpath="(//textarea[@name='your-message'])[1]")
	static WebElement campoMensaje;
	@FindBy(xpath="(//input[@value='Enviar'])[1]")
	static WebElement botonEnviar;
	
	@FindBy(xpath="//div[@class=\"wpcf7-response-output\"]")
	static WebElement contenedorMensajeEnviado;
}
