package tcs.wilmar.tcs.pom.wilmar.steps;
import net.thucydides.core.annotations.Step;
import tcs.wilmar.tcs.pom.wilmar.pageObjects.Login_pageObject;
import tcs.wilmar.tcs.pom.wilmar.pageObjects.validacionDeFormulario_pageObject;

public class validacionDeFormulario_steps {	
	validacionDeFormulario_pageObject pomFormuilarioUno;
	Login_pageObject Login_pageObject;

	@Step
    public void  Iniciar_sesion(String usuario, String contrasena) {
	Login_pageObject.ingresar_usuario(usuario);
	Login_pageObject.ingresar_Contraseña(contrasena);
	Login_pageObject.Click_en_boton_ingresar();
	}
	
	@Step
	public void seleccionar_formularios() {
		pomFormuilarioUno.seleccionar_formularios();
		pomFormuilarioUno.seleccionar_validatiolnform();
	}
	
	@Step
	public void diligenciar_Formulario_uno(String required, String select, String multiple_select, String url, String mail, String password, String confirm_password, String minimum_field_size, String maximum_field_size, String ip, String number, String date, String date_earlier) {
		pomFormuilarioUno.diligenciar_campo_required(required, date_earlier, date_earlier, date_earlier, date_earlier, date_earlier, date_earlier, date_earlier, date_earlier, date_earlier, date_earlier, date_earlier, date_earlier);
	}
	

}
