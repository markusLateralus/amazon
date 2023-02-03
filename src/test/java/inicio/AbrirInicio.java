package inicio;

import net.thucydides.core.annotations.Step;

public class AbrirInicio {
	
	PageInicio inicio;

	@Step("entro en amazon")
	public void abrir() {
		inicio.open();
	}
	
	@Step("verifico que estoy en amazon")
	public void verificarQueEstoyEnAmazon(String string) {
		System.out.println(string);
	}
}
