#Author: Wilmar SAnchez
#Creacion de formulario
@tag
Feature: Validacion formulario ColotLib
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Caso100_Validacion de formulario
    Given Ingreso a navegador
    And Iniciar sesion <usuario><contrasena>
    When Seleccionar formularios
    And Diligenciar Formulario uno<required> <select> <multiple_select> <url> <e-mail>  <password> <confirm_password> <minimum_field_size> <maximum_field_size> <number>  <ip> <date> <date_earlier>

    Examples: 
      | usuario | contrasena | required | select | multiple_select | url    | mail   | password | confirm_password | minimum_field_size | maximum_field_size | ip     | number   | date   | date_earlier |
      | "demo"  | "demo"     | "demo"   | "demo" | "demo"          | "demo" | "demo" | "demo"   | "demo"           | "demo"             | "demo"             | "demo" | "number" | "date" | "date"       |
