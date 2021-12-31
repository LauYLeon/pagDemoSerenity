package actions;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class HomeActions extends HomePage {
    public HomeActions(WebDriver driver) {
        super(driver);
    }


    public void seleccionarProducto(String articulo) throws InterruptedException {
        WebElement producto = getDriver().findElement(By.xpath("//div[contains(@id,'" + articulo + "Img')]"));
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click()", producto);
        // producto.click();
        getBtnComprar().click();
        getBtnAddCarrito().click();
    }

    public void validarProducto() {
        getBtnCarritoCompras().click();
        //DETALLES DEL PRODUCTO EN EL CARRITO DE COMPRAS
        String imgProductoPagina = getImgProducto().getAttribute("src");
        String nombreProductoPag = getNombreProducto().getText();
        String colorProductoPag = getColorProducto().getAttribute("title");
        String cantidadProdcutoPag = getCantidadProducto().getText();
        String precioProductoPag = getPrecioProducto().getText();
        // DETALLES DEL PRODUCTO EN EL RECUADRO DE COMPRAS
        String cantidadRecuadro = getCantProductoRecuadro().getText();
        String productRecuadro = cantidadRecuadro.substring(5, 6);
        String precioProducRecuadro = getPrecioProductRecuadro().getText();
        String imagenRecuadto = getImgProductoRecuadro().getAttribute("src");
        String nombreRecuadro = getNombreProductoRecuadro().getText();
        String colorRecuadro = getColorProductoRecuadro().getText();
        //VALIDACIONES
        Assert.assertEquals("La cantidad de producto deberia coinidir",
                productRecuadro, cantidadProdcutoPag);
        Assert.assertEquals("El precio del producto deberia coincidir",
                precioProducRecuadro, precioProductoPag);
        assertThat("El src deberia coincidir", imgProductoPagina, Matchers.is(imagenRecuadto));
        assertThat("El nombre del producto deberia coincidir", nombreProductoPag, Matchers.is(nombreRecuadro));
        assertThat("El color del producto deberia coincidir", colorProductoPag, Matchers.is(colorRecuadro));
        moverSobreProducto(By.id("shoppingCartLink"));
        getBtnCheckOut().click();
    }

    public void ingresarRedSocial(String red) {
        WebElement redSocial = getDriver().findElement(By.xpath("//img[contains(@name,'" + red + "')]"));
        if (red.equals("facebook")) {
            WebElement linkFacebook = getDriver().findElement(By.xpath("(//div[@id='follow']/a)[1]"));
            assertThat("Los links deberian coincidir",
                    "https://www.facebook.com/MicroFocus/", Matchers.is(linkFacebook.getAttribute("href")));
            redSocial.click();
        } else if (red.equals("twitter")) {
            WebElement linkTwitter = getDriver().findElement(By.xpath("(//div[@id='follow']/a)[2]"));
            assertThat("Los links deberian coincidir",
                    "https://twitter.com/MicroFocus", Matchers.is(linkTwitter.getAttribute("href")));
            redSocial.click();

        } else if (red.equals("linkedin")) {
            WebElement linkLinkedin = getDriver().findElement(By.xpath("(//div[@id='follow']/a)[3]"));
            assertThat("Los links deberian coincidir",
                    "https://www.linkedin.com/company/1024?trk=tyah&trkInfo=clickedVertical%3Ashowcase%2CclickedEntityId%3A1024%2Cidx%3A2-1-2%2CtarId%3A145431482.327%2Ctas%3Ahewlett%20packard%20enterprise%20software"
                    , Matchers.is(linkLinkedin.getAttribute("href")));
            redSocial.click();
        }
    }

    public void cantidadRedesSociales() {
        List<WebElement> element = getDriver().findElements(By.xpath("(//div[@id='follow']/a)"));
        int cant = element.size();
        System.out.println("CANTIDAD DE REDES SOCIALES " + cant);
        assertThat("La cantidad deberia ser mayor o igual a 3",
                3, Matchers.greaterThanOrEqualTo(cant));

    }
}
