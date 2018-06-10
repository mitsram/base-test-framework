package core;

import control.MobileControl;
import control.WebControl;
import io.appium.java_client.AppiumDriver;

public class MobilePageBase {

    public AppiumDriver driver;
    public MobileControl control;

    public MobilePageBase(AppiumDriver driver)
    {
        this.driver = driver;
        control = new MobileControl(driver);
    }
}
