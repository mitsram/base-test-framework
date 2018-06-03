package browser;


public class BrowserFactory {

    public IBrowser getBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            return new Chrome();
        }
        return null;
    }
}
