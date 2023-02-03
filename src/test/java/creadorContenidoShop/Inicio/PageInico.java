package creadorContenidoShop.Inicio;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://creadordecontenidoshop.com/")
public class PageInico extends PageObject{

	@FindBy(className="cdp-cookies-boton-aviso")
	static WebElement botonCookie;
	
	
	

}
