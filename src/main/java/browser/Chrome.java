package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;


public class Chrome implements IBrowser
{
    HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
    private boolean grid = false;
    private String hubIPAddress;


    public WebDriver getDriver()
    {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        fileAutoDownload(true);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);

        try {
            if (grid) {
                return new RemoteWebDriver(new URL("http://" + hubIPAddress + ":4444/wd/hub"), options);
            } else {
                return new ChromeDriver(options);
            }
        } catch (MalformedURLException e) {

        }

        return null;
    }

    public void setGrid(String hubIPAddress)
    {
        grid = true;
        this.hubIPAddress = hubIPAddress;
    }


    public void fileAutoDownload(boolean autoDownload)
    {
        String downloadFilepath = "/Users/mitsram/Projects/downloads/";

        if (autoDownload) {
            chromePrefs.put("profile.default_content_settings.popups", 0);
            chromePrefs.put("download.default_directory", downloadFilepath);
            chromePrefs.put("download.prompt_for_download", false);
        }
    }

}
