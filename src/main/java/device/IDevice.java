package device;

import io.appium.java_client.AppiumDriver;

/**
 * Created by mitsram on 15/05/2018.
 */
public interface IDevice {

    public AppiumDriver getDriver();
    public void setGrid(String hubIPAddress);
}
