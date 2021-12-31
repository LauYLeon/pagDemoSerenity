package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CriteriosMarketingPage extends BasePage {
    public CriteriosMarketingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//section[@class='ng-scope']")
    private WebElementFacade cargueElementos;
    @FindBy(xpath = "//div[@class='container ']")
    private WebElementFacade contenedorProductos;
    @FindBy(xpath = "//div[@class='imgSection']")
    private WebElementFacade bannerPublicidad;

    public WebElementFacade getCargueElementos() {
        return cargueElementos;
    }

    public WebElementFacade getContenedorProductos() {
        return contenedorProductos;
    }

    public WebElementFacade getBannerPublicidad() {
        return bannerPublicidad;
    }
}
