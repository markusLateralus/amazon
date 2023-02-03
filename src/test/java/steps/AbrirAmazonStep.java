package steps;

import static org.assertj.core.api.Assertions.assertThatIndexOutOfBoundsException;

import inicio.AbrirInicio;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AbrirAmazonStep {
/*
	@Steps
	AbrirInicio abrirInicio;
	
	
	@Given("que soy un potencial cliente de compras")
	public void que_soy_un_potencial_cliente_de_compras() {
	 System.out.println("potencial");
	}
	@When("abro el navegador")
	public void abro_el_navegador() {
	 abrirInicio.abrir();
	}
	@Then("estoy en la pagina principal de amazon {string}")
	public void estoy_en_la_pagina_principal_de_amazon(String string) {
	  abrirInicio.verificarQueEstoyEnAmazon(string);
	}

}*/
	
	
@Given("que soy un potencial cliente de compras")
public void que_soy_un_potencial_cliente_de_compras() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}
@When("abro el navegador")
public void abro_el_navegador() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}
@Then("estoy en la pagina principal de amazon {string}")
public void estoy_en_la_pagina_principal_de_amazon(String string) {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}
}