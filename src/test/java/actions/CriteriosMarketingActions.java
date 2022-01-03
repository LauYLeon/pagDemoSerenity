package actions;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.CriteriosMarketingPage;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class CriteriosMarketingActions extends CriteriosMarketingPage {
    public CriteriosMarketingActions(WebDriver driver) {
        super(driver);
    }

    public void cargueElementos() {
        getCargueElementos().waitUntilPresent();
    }

    public void visualizacionCategoriaProductos() {
        List<WebElement> productos = getDriver().findElements(By.xpath("//div[@class='container ']"));
        int cantidadProductos = productos.size();
        assertThat("La cantidad deberia ser mayor o igual a 5",
                5, Matchers.greaterThanOrEqualTo(cantidadProductos));
    }

    public void bannerPublicidad() {
        List<WebElement> elementosPublicidad = getDriver().findElements(By.xpath("//div[@class='imgContainer']//img"));
        int cont = 1;
        int cantidadElementos = elementosPublicidad.size() - 1;
        assertThat("La cantidad deberia ser mayor o igual a 3",
                4, Matchers.greaterThanOrEqualTo(cantidadElementos));
        for (int i = 0; i < cantidadElementos; i++) {
            String srcProductos = elementosPublicidad.get(i).getAttribute("src");
            assertThat("Los src deberian coincidir",
                    "https://advantageonlineshopping.com/css/images/Banner" + cont + ".jpg", Matchers.is(srcProductos));
            cont++;
        }
    }

    public void opcionMenu(String opcionMen) {
        List<String> opcionesFeature = new ArrayList<>();
        String[] pruebaSeparar = opcionMen.split(", ");
        List<WebElement> nombreOpciones = getDriver().findElements(By.xpath("//ul[@class='roboto-light desktop-handler']/li[@class='nav-li-Links']"));
        int cantidadOpciones = nombreOpciones.size();
        List<String> menuPagina = new ArrayList<>();
        for (int i = 0; i < cantidadOpciones; i++) {
            String text = nombreOpciones.get(i).getText();
            menuPagina.add(text);
            opcionesFeature.add(pruebaSeparar[i]);
        }
        assertThat("Los titulos deberian coincidir",
                menuPagina, Matchers.equalTo(opcionesFeature));
    }
}
