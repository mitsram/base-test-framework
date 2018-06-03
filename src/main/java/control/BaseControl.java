package control;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseControl<T extends WebElement> {

    WebDriver driver;
    private int DEFAULT_WAIT_TIME = 10;

    public BaseControl(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By locator)
    {
        T element = find(locator, DEFAULT_WAIT_TIME);
        element.click();
    }

    public void type(String text, By locator)
    {
        T element = find(locator, DEFAULT_WAIT_TIME);
        element.sendKeys(text);
    }


    /*
     * methods below: Explicit Wait Time
     */

    public void click(By locator, int maxWaitTime)
    {
        T element = find(locator, maxWaitTime);
        element.click();
    }

    public void type(String text, By locator, int maxWaitTime)
    {
        T element = find(locator, maxWaitTime);
        element.sendKeys(text);
    }


    private <T> T find(By locator, int maxWaitTime)
    {
        if (driver == null) {
            // throw null pointer exception for null driver
        }
        if (waitForClickable(locator, maxWaitTime)) {
            return (T) driver.findElement(locator);
        }

        return null;
    }

    private boolean waitForClickable(By locator, int maxWaitTime)
    {
        WebDriverWait wait = new WebDriverWait(driver, maxWaitTime);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(locator));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }


}
