package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PagoLineaPage extends BasePage {
    public PagoLineaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h3[@class='roboto-regular sticky fixedImportant ng-scope'][contains(.,'ORDER PAYMENT')]")
    private WebElementFacade tituloOrdenPago;
    @FindBy(xpath = "//a[@role='link'][contains(.,'Edit shipping details')]")
    private WebElementFacade btnEditarInfo;
    @FindBy(name = "first_name")
    private WebElementFacade campoNombre;
    @FindBy(name = "last_name")
    private WebElementFacade campoApellido;
    @FindBy(name = "phone_number")
    private WebElementFacade campoTelefono;
    @FindBy(name = "countryListbox")
    private WebElementFacade campoContinente;
    @FindBy(name = "city")
    private WebElementFacade campoCiudad;
    @FindBy(name = "address")
    private WebElementFacade campoDireccion;
    @FindBy(name = "postal_code")
    private WebElementFacade campoCodPostal;
    @FindBy(name = "state_/_province_/_region")
    private WebElementFacade provincia;
    @FindBy(id = "next_btnundefined")
    private WebElementFacade btnNext;
    @FindBy(xpath = "//label[contains(@translate,'Choose_payment_method_below')]")
    private WebElementFacade tituloMetodosPago;
    @FindBy(xpath = "//label[contains(@class,'roboto-regular ng-binding selected')]")
    private WebElementFacade tituloFormaPago;
    @FindBy(id = "pay_now_btn_SAFEPAY")
    private WebElementFacade btnComprarSafePay;
    @FindBy(xpath = "//sec-sender[contains(@sec-send,'payNow_masterCredit()')]/button[contains(@id,'pay_now_btn_ManualPayment')]")
    private WebElementFacade btnComprarMasterCredit;
    @FindBy(xpath = "//button[@id='pay_now_btn_MasterCredit']")
    private WebElementFacade btnPayNowMasterCredit;
    @FindBy(xpath = "//button[contains(@id,'pay_now_btn_ManualPayment')]")
    private WebElementFacade btnPagarAhora;
    @FindBy(xpath = "//label[@class='edit  ng-scope']")
    private WebElementFacade btnEditarMasterCredit;
    @FindBy(xpath = "//input[contains(@id,'creditCard')]")
    private WebElementFacade campoNumeroTarjeta;
    @FindBy(name = "cvv_number")
    private WebElementFacade campoCvvNumero;
    @FindBy(name = "mmListbox")
    private WebElementFacade campoMesExpiracion;
    @FindBy(name = "yyyyListbox")
    private WebElementFacade campoYearExpiracion;
    @FindBy(name = "cardholder_name")
    private WebElementFacade campoNombreTitular;
    @FindBy(xpath = "//span[@class='roboto-regular ng-scope'][contains(.,'Thank you for buying with Advantage')]")
    private WebElementFacade tituloConfirmacionPago;
    @FindBy(xpath = "//div[@class='iconCss iconUser']/following::label[@class='ng-binding'][1]")
    private WebElementFacade nombreOrdenEnvio;
    @FindBy(xpath = "(//label[contains(@class,'ng-binding')])[7]")
    private WebElementFacade nombreDetalles;
    @FindBy(xpath = "//div[@class='innerSeccion']/following::label[@class='ng-binding'][1]")
    private WebElementFacade direccionOrdenEnvio;
    @FindBy(xpath = "(//label[contains(@class,'ng-binding')])[8]")
    private WebElementFacade direccionDetalles;
    @FindBy(xpath = "//div[@class='iconCss iconUser']/following::label[@class='ng-binding'][5]")
    private WebElementFacade telefonoOrdenEnvio;
    @FindBy(xpath = "//div[@class='iconCss iconUser']/following::label[@class='ng-binding'][6]")
    private WebElementFacade modoPagoOrdenEnvio;
    @FindBy(xpath = "//div[@class='iconCss iconUser']/following::label[@class='ng-binding'][8]")
    private WebElementFacade precioProductoOrdenEnvio;
    @FindBy(xpath = "//div[@class='innerSeccion']/following::a[@class='floater ng-binding'][4]")
    private WebElementFacade totalOrdenProducto;
    @FindBy(id = "trackingNumberLabel")
    private WebElementFacade numeroSeguimiento;
    @FindBy(id = "orderNumberLabel")
    private WebElementFacade numeroOrden;
    @FindBy(xpath = "(//a[contains(@ng-click,'Back_to_shipping_details()')])[2]")
    private WebElementFacade btnAnterior;
    @FindBy(xpath = "//button[@id='next_btn']")
    private WebElementFacade btnNext1;


    public WebElementFacade getTituloOrdenPago() {
        return tituloOrdenPago;
    }

    public WebElementFacade getBtnEditarInfo() {
        return btnEditarInfo;
    }

    public WebElementFacade getCampoApellido() {
        return campoApellido;
    }

    public WebElementFacade getCampoNombre() {
        return campoNombre;
    }

    public WebElementFacade getCampoTelefono() {
        return campoTelefono;
    }

    public WebElementFacade getCampoContinente() {
        return campoContinente;
    }

    public WebElementFacade getCampoCiudad() {
        return campoCiudad;
    }

    public WebElementFacade getCampoDireccion() {
        return campoDireccion;
    }

    public WebElementFacade getCampoCodPostal() {
        return campoCodPostal;
    }

    public WebElementFacade getProvincia() {
        return provincia;
    }

    public WebElementFacade getBtnNext() {
        return btnNext;
    }

    public WebElementFacade getTituloMetodosPago() {
        return tituloMetodosPago;
    }

    public WebElementFacade getTituloFormaPago() {
        return tituloFormaPago;
    }

    public WebElementFacade getBtnComprarSafePay() {
        return btnComprarSafePay;
    }

    public WebElementFacade getBtnComprarMasterCredit() {
        return btnComprarMasterCredit;
    }

    public WebElementFacade getBtnEditarMasterCredit() {
        return btnEditarMasterCredit;
    }

    public WebElementFacade getCampoNumeroTarjeta() {
        return campoNumeroTarjeta;
    }

    public WebElementFacade getCampoCvvNumero() {
        return campoCvvNumero;
    }

    public WebElementFacade getCampoMesExpiracion() {
        return campoMesExpiracion;
    }

    public WebElementFacade getCampoYearExpiracion() {
        return campoYearExpiracion;
    }

    public WebElementFacade getCampoNombreTitular() {
        return campoNombreTitular;
    }

    public WebElementFacade getTituloConfirmacionPago() {
        return tituloConfirmacionPago;
    }

    public WebElementFacade getNombreOrdenEnvio() {
        return nombreOrdenEnvio;
    }

    public WebElementFacade getDireccionOrdenEnvio() {
        return direccionOrdenEnvio;
    }

    public WebElementFacade getTelefonoOrdenEnvio() {
        return telefonoOrdenEnvio;
    }

    public WebElementFacade getModoPagoOrdenEnvio() {
        return modoPagoOrdenEnvio;
    }

    public WebElementFacade getPrecioProductoOrdenEnvio() {
        return precioProductoOrdenEnvio;
    }

    public WebElementFacade getTotalOrdenProducto() {
        return totalOrdenProducto;
    }

    public WebElementFacade getNumeroSeguimiento() {
        return numeroSeguimiento;
    }

    public WebElementFacade getNumeroOrden() {
        return numeroOrden;
    }

    public WebElementFacade getNombreDetalles() {
        return nombreDetalles;
    }

    public WebElementFacade getDireccionDetalles() {
        return direccionDetalles;
    }

    public WebElementFacade getBtnAnterior() {
        return btnAnterior;
    }

    public WebElementFacade getBtnNext1() {
        return btnNext1;
    }

    public WebElementFacade getBtnPayNowMasterCredit() {
        return btnPayNowMasterCredit;
    }

    public WebElementFacade getBtnPagarAhora() {
        return btnPagarAhora;
    }
}
