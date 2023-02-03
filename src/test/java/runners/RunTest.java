package runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		plugin = {"pretty"},
features="src/test/resources/features/FormularioContacto.feature",  //indicamos donde se almacena nuestro archivo feature que va a realizar la prueba
glue= "steps", //unir feature con java
tags="@escenario2") //seleccionamos la etiqueta deseada del archivo feature
public class RunTest {
 
}
