package stepsDefinitions;


import actions.HomeActions;
import actions.LoginActions;
import actions.PagoLineaActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class PagoLineaSteps {
    WebDriver driver;
    HomeActions homeActions = new HomeActions(driver);
    LoginActions loginActions = new LoginActions(driver);
    PagoLineaActions pagoLineaActions = new PagoLineaActions(driver);

    @Given("^que el usuario se encuentre en la pagina principal$")
    public void queElUsuarioSeEncuentreEnLaPaginaPrincipal() {
        homeActions.open();
    }

    @Given("^el usuario realiza el logueo$")
    public void el_usuario_realiza_el_logueo() {
        loginActions.logueoUsuario();
    }

    @When("^selecciona el articulo de tecnologia que desee (.*)$")
    public void seleccionaElArticuloDeTecnologiaQueDesee(String producto) throws InterruptedException {
        homeActions.seleccionarProducto(producto);
    }

    @Then("^el usuario deberia ver el producto seleccionado en el carrito de compras$")
    public void elUsuarioDeberiaVerElProductoSeleccionadoEnElCarritoDeCompras() {
        homeActions.validarProducto();
    }

    @Given("^que el usuario se encuentre en la pantalla de orden de pago$")
    public void queElUsuarioSeEncuentreEnLaPantallaDeOrdenDePago() {
        pagoLineaActions.validarPagoLinea();
    }


    @When("^el usuario verifique la informacion sobre donde debe llegar el producto$")
    public void elUsuarioVerifiqueLaInformacionSobreDondeDebeLlegarElProducto() {
        pagoLineaActions.vaidarCamposEditables();
    }

    @Then("^el usuario deberia poder ver los metodos de pago$")
    public void elUsuarioDeberiaPoderVerLosMetodosDePago() {
        pagoLineaActions.validarMetodosPago();
    }

    @Given("^que el usuario se encuntre en la pantalla de metodo de pago$")
    public void queElUsuarioSeEncuntreEnLaPantallaDeMetodoDePago() {
        pagoLineaActions.pantallaMetodosPago();
    }

    @When("^el usuario escoge el metodo de pago (.*)$")
    public void elUsuarioEscogeElMetodoDePago(String tipoPago){
        pagoLineaActions.seleccionMetodoPago(tipoPago);
    }

    @Then("^el usuario deberia poder ver un mensaje de confirmacion (.*)$")
    public void elUsuarioDeberiaPoderVerUnMensajeDeConfirmacion(String msjConfirmacion) {
        pagoLineaActions.validarMsjConfirmacionCompra(msjConfirmacion);

    }
}
