Feature: ir a la pagina de login de usuarios de manera Fallida
  esta caracteristica se encarga de fallar al acceder a la pagina de login demo

  Scenario: navegador con acceso a internet
    Given abrimos el navegador
    And  introducimos la direccion erronea de "https://demosite.executeautomation.com/LoginDemo.html"
    Then Nos envia un mensaje de error 404