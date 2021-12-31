package stepsDefinitions;

import actions.HomeActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class RedesSocialesSteps {
    WebDriver driver;
    HomeActions homeActions = new HomeActions(driver);

    @Given("^que el usuario se encuentre alguna parte de la pagina$")
    public void queElUsuarioSeEncuentreAlgunaParteDeLaPagina() {
        homeActions.open();
    }

    @Then("^da click sobre alguna red social para seguir a la empresa (.*)$")
    public void da_click_sobre_alguna_red_social_para_seguir_a_la_empresa(String redSocial) {
        homeActions.ingresarRedSocial(redSocial);
    }

    @When("^el usuario observara la cantidad de redes sociales con las que cuenta la pagina$")
    public void elUsuarioObservaraLaCantidadDeRedesSocialesConLasQueCuentaLaPagina() {
        homeActions.cantidadRedesSociales();
    }


}
