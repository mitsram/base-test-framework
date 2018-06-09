package platform;

/**
 * Created by mitsram on 13/05/2018.
 */
public class WindowsPlatform implements IPlatform {

    public WindowsPlatform()
    {
        System.out.println("[DEBUG] Test(s) running in Windows...");
    }

    public String getChromeDriverPath() {
        return null;
    }

    public String getGeckoDriverPath() {
        return null;
    }
}
