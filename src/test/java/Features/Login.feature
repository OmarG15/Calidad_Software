Feature: login de usuarios
  esta caracteristica se encarga de la funcion de login

  Scenario: Login con usuario y contraseña correcta
    Given navegamos a la pagina de login
    And  introducimos lo siguiente para hacer login
      | username | password      |
      | admin    | adminpassword |
    And hacemos click en el boton de login
    Then pasamos a la siguiente pagina

#  Scenario Outline: Login con usuario y contraseña correcta
#    Given navegamos a la pagina de login
#    And  introducimos <Username> y <Password> para hacer login
#    And hacemos click en el boton de login
#    Then pasamos a la siguiente pagina
#
#    Examples:
#      | Username | Password      |
#      | admin    | adminpassword |
#      | user1    | test1 |
#      | userfail    | fail1 |