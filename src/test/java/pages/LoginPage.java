package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "username")
    private WebElementFacade nombreUsuario;
    @FindBy(name = "password")
    private WebElementFacade passwordUsuario;
    @FindBy(id = "sign_in_btnundefined")
    private WebElementFacade btnLogin;
    @FindBy(id = "menuUserLink")
    private WebElementFacade btnLogueo;

    public WebElementFacade getNombreUsuario() {
        return nombreUsuario;
    }

    public WebElementFacade getPasswordUsuario() {
        return passwordUsuario;
    }

    public WebElementFacade getBtnLogin() {
        return btnLogin;
    }

    public WebElementFacade getBtnLogueo() {
        return btnLogueo;
    }
}
