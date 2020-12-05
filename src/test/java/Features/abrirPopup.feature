Feature: abrir pestaña PopUp
  esta caracteristica se encarga de abrir otra pagina en el navegador con el formulario

  Scenario:se abre una pestaña nueva con opciones de formulario
    Given navegamos a la pagina del form
    When  seleccionamos la opcion de "generate"
    Then se abre un Popup alert
    And  se presiona el boton ok del alert
