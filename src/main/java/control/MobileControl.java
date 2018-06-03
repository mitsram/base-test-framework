package control;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MobileControl extends BaseControl<MobileElement> {

    public MobileControl(AppiumDriver driver) {
        super(driver);
    }
}
