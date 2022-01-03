package actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;


public class LoginActions extends LoginPage {
    public LoginActions(WebDriver driver) {
        super(driver);
    }

    public void logueoUsuario() {
        getBtnLogueo().click();
        getNombreUsuario().sendKeys("pepito1");
        getPasswordUsuario().sendKeys("1234Aa");
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click()", getBtnLogin());
    }
}
