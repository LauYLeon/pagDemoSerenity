package stepsDefinitions;


import actions.CriteriosMarketingActions;
import actions.HomeActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CriteriosMarketingSteps {
    WebDriver driver;
    HomeActions homeActions = new HomeActions(driver);
    CriteriosMarketingActions criteriosMarketingActions = new CriteriosMarketingActions(driver);

    @Given("^que el usuario este en la pagina principal$")
    public void queElUsuarioEsteEnLaPaginaPrincipal() {
        homeActions.open();
    }

    @When("^carga el contenido$")
    public void cargaElContenido() {
        criteriosMarketingActions.cargueElementos();
    }

    @Then("^visualiza todas la categorias de productos de la pagina$")
    public void visualizaTodasLaCategoriasDeProductosDeLaPagina() {
        criteriosMarketingActions.visualizacionCategoriaProductos();
    }

    @Then("^visualiza el banner de publiciadad$")
    public void visualizaElBannerDePubliciadad() {
        criteriosMarketingActions.bannerPublicidad();
    }

    @Then("^selecciona cualquier opcion del menu (.*)$")
    public void seleccionaCualquierOpcionDelMenu(String opcion) throws InterruptedException {
        criteriosMarketingActions.opcionMenu(opcion);
    }

}
