package core;

import control.WebControl;
import org.openqa.selenium.WebDriver;

public class WebPageBase {

    public WebDriver driver;
    public WebControl control;

    public WebPageBase(WebDriver driver) {
        this.driver = driver;
        control = new WebControl(driver);
    }
}
