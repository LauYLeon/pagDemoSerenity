@test
Feature: Yo como mercaderista de DEMO
  Quiero que en la parte inferior de la pagina
  Se observen los links de las redes sociales

  Scenario: El usuario tiene la posisbilidad de seguir la empresa en sus redes sociales
    Given que el usuario se encuentre alguna parte de la pagina
    When el usuario observara la cantidad de redes sociales con las que cuenta la pagina
    Then da click sobre alguna red social para seguir a la empresa twitter