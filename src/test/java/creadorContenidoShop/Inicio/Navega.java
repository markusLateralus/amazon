package creadorContenidoShop.Inicio;

import net.thucydides.core.annotations.Step;

public class Navega {
	
	PageInico inicio;

	@Step("el cliente entra en la pagina principal")
	public void entrarPaginaPrincipal() {
		inicio.open();
		PageInico.botonCookie.click();
	}
	
	@Step("se dirige a la patina contacto")
	public void aPaginaContacto() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inicio.getDriver().get("https://creadordecontenidoshop.com/contacto/");
	}
}
