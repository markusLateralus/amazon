package steps;

import static org.assertj.core.api.Assertions.assertThatIndexOutOfBoundsException;
import static org.junit.jupiter.api.Assertions.assertTrue;

import creadorContenidoShop.Contacto.RellenarFormulario;
import creadorContenidoShop.Inicio.Navega;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modelos.Contacto;
import net.thucydides.core.annotations.Steps;

public class FomularioContactoStep {

	//declaramos las accciones de las paginas que van a intervenir en la prueba
	@Steps
	Navega navega;  //corresponde a la pagina inicio
	@Steps
	RellenarFormulario rellenarFormulario;
	
	
	
	@Given("el cliente entra en la pagina principal")
	public void el_cliente_entra_en_la_pagina_principal() {
	navega.entrarPaginaPrincipal();
	}
	@Given("se dirige a la pagina Contacto")
	public void se_dirige_a_la_pagina_contacto() {
	 navega.aPaginaContacto();  
	}
	@When("rellena los datos del formulario correctamente")
	public void rellena_los_datos_del_formulario_correctamente() throws InterruptedException {
	rellenarFormulario.conDatosCorrectos();
	}
	@Then("aparece el mensaje correspondiente")
	public void aparece_el_mensaje_correspondiente() {
		assertTrue(rellenarFormulario.comprobarEnvio());
	}

	@When("rellena los datos del formulario nombre {string}, email {string}, titulo {string}, mensaje {string}")
	public void rellena_los_datos_del_formulario_nombre_email_titulo_mensaje(String string, String string2, String string3, String string4) {
	 Contacto contacto=new Contacto();
		rellenarFormulario.conDatos(string,string2,string3,string4);
	}
	


}