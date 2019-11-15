package tcs.wilmar.tcs.pom.wilmar.definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import tcs.wilmar.tcs.pom.wilmar.steps.validacionDeFormulario_steps;

public class ValidacionFormulario_definition {

	@Steps
	validacionDeFormulario_steps step;

	@Given("^Iniciar sesion \"([^\"]*)\"\"([^\"]*)\"$")
	public void iniciar_sesion(String usuario, String contrasena) throws Exception {
		step.Iniciar_sesion(usuario, contrasena);
	}

	@When("^Seleccionar formularios$")
	public void seleccionar_formularios() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		step.seleccionar_formularios();

	}

	@When("^Diligenciar Formulario uno\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"(.*)\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void diligenciar_Formulario_uno(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6,
			String arg7, String arg8, String arg9, String arg10, String arg11, String arg12, String arg13)
			throws Exception {
		// Write code here that turns the phrase above into concrete actions
		step.diligenciar_Formulario_uno(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12,
				arg13);
	}
}
