package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@name='buy_now']")
    private WebElementFacade btnComprar;
    @FindBy(xpath = "//button[@name='save_to_cart']")
    private WebElementFacade btnAddCarrito;
    @FindBy(xpath = "(//img[contains(@class,'imageUrl')])[2]")
    private WebElementFacade imgProducto;
    @FindBy(xpath = "//label[@class='roboto-regular productName ng-binding']")
    private WebElementFacade nombreProducto;
    @FindBy(xpath = "(//label[contains(@class,'ng-binding')])[7]")
    private WebElementFacade cantidadProducto;
    @FindBy(xpath = "//span[contains(@class,'productColor')]")
    private WebElementFacade colorProducto;
    @FindBy(id = "shoppingCartLink")
    private WebElementFacade btnCarritoCompras;
    @FindBy(xpath = "(//p[contains(@class,'price roboto-regular ng-binding')])[2]")
    private WebElementFacade precioProducto;
    @FindBy(xpath = "(//img[contains(@class,'imageUrl')])[1]")
    private WebElementFacade imgProductoRecuadro;
    @FindBy(xpath = "(//h3[contains(@class,'ng-binding')])[1]")
    private WebElementFacade nombreProductoRecuadro;
    @FindBy(xpath = "(//span[@class='ng-binding'])[1]")
    private WebElementFacade colorProductoRecuadro;
    @FindBy(xpath = "(//label[@class='ng-binding'])[1]")
    private WebElementFacade cantProductoRecuadro;
    @FindBy(xpath = "//p[contains(@class,'price roboto-regular ng-binding')]")
    private WebElementFacade precioProductRecuadro;
    @FindBy(id = "checkOutPopUp")
    private WebElementFacade btnCheckOut;

    public WebElementFacade getBtnComprar() {
        return btnComprar;
    }

    public WebElementFacade getBtnAddCarrito() {
        return btnAddCarrito;
    }

    public WebElementFacade getImgProducto() {
        return imgProducto;
    }

    public WebElementFacade getNombreProducto() {
        return nombreProducto;
    }

    public WebElementFacade getCantidadProducto() {
        return cantidadProducto;
    }

    public WebElementFacade getColorProducto() {
        return colorProducto;
    }

    public WebElementFacade getBtnCarritoCompras() {
        return btnCarritoCompras;
    }

    public WebElementFacade getPrecioProducto() {
        return precioProducto;
    }

    public WebElementFacade getCantProductoRecuadro() {
        return cantProductoRecuadro;
    }

    public WebElementFacade getPrecioProductRecuadro() {
        return precioProductRecuadro;
    }

    public WebElementFacade getBtnCheckOut() {
        return btnCheckOut;
    }

    public WebElementFacade getImgProductoRecuadro() {
        return imgProductoRecuadro;
    }

    public WebElementFacade getNombreProductoRecuadro() {
        return nombreProductoRecuadro;
    }

    public WebElementFacade getColorProductoRecuadro() {
        return colorProductoRecuadro;
    }
}
