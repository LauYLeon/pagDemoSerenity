package actions;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PagoLineaPage;

import javax.xml.bind.SchemaOutputResolver;
import java.util.SortedMap;

public class PagoLineaActions extends PagoLineaPage {
    public PagoLineaActions(WebDriver driver) {
        super(driver);
    }

    public void validarPagoLinea() {
        Assert.assertEquals("El titulo deberia ser igual",
                getTituloOrdenPago().getText(), "ORDER PAYMENT");
    }

    public boolean vaidarCamposEditables() {
        getBtnEditarInfo().click();
        boolean nombre = getCampoNombre().isEnabled();
        boolean apellido = getCampoApellido().isEnabled();
        boolean telefono = getCampoTelefono().isEnabled();
        boolean continente = getCampoContinente().isEnabled();
        boolean ciudad = getCampoCiudad().isEnabled();
        boolean direccion = getCampoDireccion().isEnabled();
        boolean codPostal = getCampoCodPostal().isEnabled();
        boolean provincia = getProvincia().isEnabled();

        if ((nombre && apellido && telefono && continente && ciudad && direccion && codPostal && provincia) == true) {
            return true;
        } else {
            return false;
        }
    }

    public void validarMetodosPago() {
        getBtnNext().click();
        Assert.assertEquals("Los titulos de metodos de pago deberian coincidir",
                getTituloMetodosPago().getText(), "Choose payment method below");
    }

    public void pantallaMetodosPago() {
        Assert.assertEquals("Los titulos de metodos de pago deberian coincidir",
                getTituloFormaPago().getText(), "2. PAYMENT METHOD");

    }

    public void seleccionMetodoPago(String tipoPago) throws InterruptedException {
        if (tipoPago.equals("SafePay")) {
            tipoPago = "safepay";
            getDriver().findElement(By.xpath("(//input[contains(@type,'radio') and @name='" + tipoPago + "'])")).click();
            getBtnComprarSafePay().click();
        } else if (tipoPago.equals("Master Credit")) {
            tipoPago = "masterCredit";
            getDriver().findElement(By.xpath("(//input[contains(@type,'radio') and @name='" + tipoPago + "'])")).click();
            getBtnEditarMasterCredit().click();
            validarCamposConTexto();
            //validarCamposEditablesMasterCre();
        }
    }

    public void validarCamposEditablesMasterCre() {
        boolean numeroTarjeta = getCampoNumeroTarjeta().isEnabled();
        boolean numeroCvv = getCampoCvvNumero().isEnabled();
        boolean mesCaducidad = getCampoMesExpiracion().isEnabled();
        boolean yearCaducidad = getCampoYearExpiracion().isEnabled();
        boolean nombreTitular = getCampoNombreTitular().isEnabled();
        if ((numeroTarjeta && numeroCvv && mesCaducidad && yearCaducidad && nombreTitular) == true) {
            //getBtnComprarMasterCredit().click();
            // clickAction(By.xpath("//button[@id='pay_now_btn_ManualPayment' and @class = 'sec-sender-a ng-scope']"));
            //getDriver().findElement(By.xpath("//button[@id='pay_now_btn_ManualPayment' and @class = 'sec-sender-a ng-scope']")).click();
            JavascriptExecutor js = (JavascriptExecutor) getDriver();
            js.executeScript("arguments[0].click()", getBtnComprarMasterCredit());
        }
    }

    public void validarCamposConTexto() {
        String numeroTarjeta = getCampoNumeroTarjeta().getAttribute("value");
        String numeroCvv = getCampoCvvNumero().getAttribute("value");
        String mesCaducidad = getCampoMesExpiracion().getAttribute("value");
        String yearCaducidad = getCampoYearExpiracion().getAttribute("value");
        String nombreTitular = getCampoNombreTitular().getAttribute("value");
        if (!(numeroTarjeta.isEmpty() && numeroCvv.isEmpty() && mesCaducidad.isEmpty() && yearCaducidad.isEmpty() && nombreTitular.isEmpty())) {
            getBtnAnterior().click();
            getBtnNext1().click();
        }
    }


    public void validarMsjConfirmacionCompra(String msjConfirmacion) throws InterruptedException {
        //WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(getBtnPayNowMasterCredit()));
        //element.click();
        getDriver().findElement(By.xpath("(//h3[contains(@class,'ng-binding')])[1]")).click();
        getDriver().findElement(By.xpath("(//button[contains(@id,'checkOutPopUp')])[1]")).click();
        getBtnNext1().click();
        seleccionMetodoPago("Master Credit");
        getBtnPayNowMasterCredit().waitUntilPresent();
        getBtnPayNowMasterCredit().click();
        getTituloConfirmacionPago().waitUntilPresent();

        Assert.assertEquals("El mensaje de confimacion debria ser igual",
                msjConfirmacion, getTituloConfirmacionPago().getText());
        Assert.assertEquals("El nombre del usuario deberia conincidir",
                getNombreOrdenEnvio().getText(), "pepito Perez");
        Assert.assertEquals("La direccion deberia coincidir",
                getDireccionOrdenEnvio().getText(),"calle 15a # 2a-12");
        String direccion = getDireccionOrdenEnvio().getText();
        String nombre = getNombreOrdenEnvio().getText();
        String telefono = getTelefonoOrdenEnvio().getText();
        String modoPago = getModoPagoOrdenEnvio().getText();
        String precioProduct = getPrecioProductoOrdenEnvio().getText();
        String precioTotal = getTotalOrdenProducto().getText();
        String numeroOrden = getNumeroOrden().getText();
        String numeroSeguimient = getNumeroSeguimiento().getText();

        System.out.println("*** INDFORMACION DE ORDEN DE PAGO ***\n" +
                "NOMBRE : " + nombre + "\n" + "DIRECCION: " + direccion + "\n" +
                "TELEFONO: " + telefono + "\n" + "MODO DE PAGO: " + modoPago + "\n" +
                "PRECIO DE PRODUCTO: " + precioProduct + "\n" + "PRECIO TOTAL: " + precioTotal + "\n" +
                "NUMERO DE ORDEN: " + numeroOrden + "\n" + "NUMERO DE SEGUIMIENTO: " + numeroSeguimient + "\n");

    }
}
