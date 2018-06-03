package base;

import browser.BrowserFactory;
import browser.IBrowser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.GithubIO;
import pilot.Config;
import platform.IPlatform;
import platform.PlatformFactory;

public class TestBase implements Config {

    protected GithubIO app;
    protected WebDriver driver;
    protected IBrowser browser;
    protected IPlatform platform;


    public TestBase()
    {
        PlatformFactory platformFactory = new PlatformFactory();
        platform = platformFactory.getPlatform();
    }

    @BeforeClass
    public void setup()
    {
        app = new GithubIO(driver);

        BrowserFactory browserFactory = new BrowserFactory();
        browser = browserFactory.getBrowser(browserName);
        driver = browser.getDriver();

    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

}
