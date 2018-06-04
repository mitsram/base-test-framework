package control;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MobileControl extends BaseControl<MobileElement> {

    public MobileControl(AppiumDriver driver) {
        super(driver);
    }


    public void swipeElementToLeft(MobileElement element)
    {
        Dimension size = element.getSize();
        Point location = element.getLocation();

        int intX = location.getX() + ((int) (size.getWidth() * 0.70));
        int intY = location.getY() + size.getHeight() / 2;

        TouchAction action = new TouchAction((MobileDriver) driver);
        action.longPress(intX, intY).moveTo(1, intY).release().perform();
    }

    public void swipeDown()
    {
        Dimension size = driver.manage().window().getSize();

        int srcY = (int) (size.getHeight() * 0.20);
        int destY = (int) (size.getHeight() * 0.90);
        int intX = size.getWidth() / 2;

        TouchAction action = new TouchAction((MobileDriver) driver);
        action.longPress(intX, srcY).moveTo(intX, destY).release().perform();

    }
}
