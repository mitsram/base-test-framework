package control;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebControl extends ControlBase<WebElement> {

    public WebControl(WebDriver driver) {
        super(driver);
    }
}
