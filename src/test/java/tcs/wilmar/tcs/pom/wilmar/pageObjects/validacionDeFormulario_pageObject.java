package tcs.wilmar.tcs.pom.wilmar.pageObjects;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import tcs.wilmar.tcs.pom.wilmar.utilidades.Utilidades;
public class validacionDeFormulario_pageObject extends PageObject {
	
	Utilidades utilidades = new Utilidades();
	
	
	String btn_fromelements ="//a[@class='dropdown-toggle']";
	String btn_validationform ="//a[contains(text(),'Validation')]";
	String txt_required="//input[@id='req']";
		
	public void seleccionar_formularios() {
		find(By.xpath(btn_fromelements)).click();
	}
	
	public void seleccionar_validatiolnform() {
		find(By.xpath(btn_validationform)).click();
	}
	public void diligenciar_campo_required(String required, String select, String multiple_select, String url, String mail, String password, String confirm_password, String minimum_field_size, String maximum_field_size, String ip, String number, String date, String date_earlier) {
		find(By.xpath(txt_required)).sendKeys(required);
	}

	
}
