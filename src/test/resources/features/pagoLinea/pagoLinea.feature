@test
Feature: Yo como usuario del portal Demo
  Quiero comprar en linea productos de tecnologia

  Scenario: el usuario selecciona articulos de tecnologia y realiza el pago en linea
    Given que el usuario se encuentre en la pagina principal
    And el usuario realiza el logueo
    When selecciona el articulo de tecnologia que desee mice
    Then el usuario deberia ver el producto seleccionado en el carrito de compras

  Scenario: el usuario verifica los detalles del envio
    Given que el usuario se encuentre en la pantalla de orden de pago
    When el usuario verifique la informacion sobre donde debe llegar el producto
    Then el usuario deberia poder ver los metodos de pago

  Scenario: el usuario escoge el metodo de pago en linea
    Given que el usuario se encuntre en la pantalla de metodo de pago
    When el usuario escoge el metodo de pago Master Credit
    Then el usuario deberia poder ver un mensaje de confirmacion Thank you for buying with Advantage


