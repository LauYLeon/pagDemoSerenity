package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BasePage extends PageObject {
    public BasePage(WebDriver driver) {
        super(driver);
    }

    public void moverSobreProducto(By by){
        Actions actions = new Actions(getDriver());
        actions.moveToElement
                (getDriver().findElement(by)).build().perform();
    }
    public void clickAction(By by){
        Actions actions = new Actions(getDriver());
        actions.moveToElement
                (getDriver().findElement(by)).click();
    }
}
