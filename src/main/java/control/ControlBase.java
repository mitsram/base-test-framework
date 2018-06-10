package control;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class ControlBase<T extends WebElement> {

    WebDriver driver;
    private int DEFAULT_WAIT_TIME = 15;

    public ControlBase(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By locator)
    {
        click(locator, DEFAULT_WAIT_TIME);
    }

    public void type(String text, By locator)
    {
        type(text, locator, DEFAULT_WAIT_TIME);
    }

    public boolean isDisplayed(By locator)
    {
        return isDisplayed(locator, DEFAULT_WAIT_TIME);
    }

    public boolean isTextDisplayed(String text, By locator)
    {
        return isTextDisplayed(text, locator, DEFAULT_WAIT_TIME);
    }

    /*
     * methods below: Explicit Wait Time
     */

    public void click(By locator, int maxWaitTime)
    {
        T element = findElement(locator, maxWaitTime);
        element.click();
    }

    public void type(String text, By locator, int maxWaitTime)
    {
        T element = findElement(locator, maxWaitTime);
        element.sendKeys(text);
    }

    public boolean isDisplayed(By locator, int maxWaitTime)
    {
        T element = findVisibleElement(locator, maxWaitTime);
        return element.isDisplayed();
    }

    public boolean isTextDisplayed(String text, By locator, int maxWaitTime)
    {
        T element = findVisibleElement(locator, maxWaitTime);
        if (element.isDisplayed()) {
            if (element.getText().equals(text)) {
                return true;
            }
        }
        return false;
    }

    /*
     * Finding Elements
     * */

    protected <T> T findElement(By locator, int maxWaitTime)
    {
        if (driver == null) {
            // throw null pointer exception for null driver
        }
        if (waitForClickable(locator, maxWaitTime)) {
            return (T) driver.findElement(locator);
        }

        return null;
    }


    protected <T> T findVisibleElement(By locator, int maxWaitTime)
    {
        if (driver == null) {
            // throw null pointer exception for null driver
        }
        if (waitForVisible(locator, maxWaitTime)) {
            return (T) driver.findElement(locator);
        }

        return null;
    }

    /*
     * Waiting for Element
     * */

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

    private boolean waitForVisible(By locator, int maxWaitTime)
    {
        WebDriverWait wait = new WebDriverWait(driver, maxWaitTime);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

}