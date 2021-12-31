package actions;


import net.serenitybdd.core.annotations.findby.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;


public class LoginActions extends LoginPage {
    public LoginActions(WebDriver driver) {
        super(driver);
    }

    public void logueoUsuario() {
        getBtnLogueo().click();
        getNombreUsuario().sendKeys("pepito1");
        getPasswordUsuario().sendKeys("1234Aa");
        //new WebDriverWait(getDriver(), 10).until(ExpectedConditions.elementToBeClickable(By.id("sign_in_btnundefined"))).click();
        // getBtnLogin().waitUntilPresent();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click()", getBtnLogin());
        //getBtnLogin().click();
    }
}
