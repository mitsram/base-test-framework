package control;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.OverridingMethodsMustInvokeSuper;
import java.util.List;

public class MobileControl extends ControlBase<MobileElement> {

    public MobileControl(AppiumDriver driver) {
        super(driver);
    }

    public void type(String text, By locator, int maxWaitTime)
    {
        MobileElement element = findElement(locator, maxWaitTime);
        element.setValue(text);
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

    public void swipeRightToLeft()
    {
        Dimension size = driver.manage().window().getSize();

        int srcX = (int) (size.getWidth() * 0.70);
        int srcY = (int) (size.getHeight() * 0.50);

        TouchAction action = new TouchAction((AppiumDriver) driver);
        action.longPress(srcX, srcY).moveTo(5, srcY).release().perform();

    }

    public void swipeUp()
    {
        Dimension size = driver.manage().window().getSize();
        int srcX = (int) (size.getWidth() / 2);
        int srcY = (int) (size.getHeight() / 2);

        TouchAction action = new TouchAction((AppiumDriver) driver);
        action.longPress(srcX, srcY).moveTo(srcX, 1).release().perform();
    }

    public void swipeDown()
    {
        Dimension size = driver.manage().window().getSize();

        int srcY = (int) (size.getHeight() * 0.20);
        int destY = (int) (size.getHeight() * 0.90);
        int intX = size.getWidth() / 2;

        TouchAction action = new TouchAction((AppiumDriver) driver);
        action.longPress(intX, srcY).moveTo(intX, destY).release().perform();

    }
}