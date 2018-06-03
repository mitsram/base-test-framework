package core;


import control.BaseControl;
import control.MobileControl;
import control.WebControl;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;

public class PageObjectBase<T extends WebDriver> {

    public T driver;
    public BaseControl control;

    public PageObjectBase(T driver)
    {
        this.driver = driver;
        if (driver instanceof AppiumDriver) {
            control = new MobileControl((AppiumDriver)driver);
        } else {
            control = new WebControl(driver);
        }
    }

}
