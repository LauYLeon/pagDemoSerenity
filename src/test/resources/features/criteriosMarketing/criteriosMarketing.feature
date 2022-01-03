@test
Feature: Como gerente de Marketing de DEMO
  Quiero un portal web en el que se exhiban
  diferentes productos por categoria

  Scenario: El usuario podra ver los productos por categoria
    Given que el usuario este en la pagina principal
    When carga el contenido
    Then visualiza todas la categorias de productos de la pagina

  Scenario: El usuario verifica los espacios para publicidad
    Given que el usuario este en la pagina principal
    When carga el contenido
    Then visualiza el banner de publiciadad

  Scenario: El usuario identifica el menu de la pagina
    Given que el usuario este en la pagina principal
    When carga el contenido
    Then selecciona cualquier opcion del menu CONTACT US, POPULAR ITEMS, SPECIAL OFFER, OUR PRODUCTS