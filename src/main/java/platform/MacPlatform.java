package platform;

/**
 * Created by mitsram on 13/05/2018.
 */
public class MacPlatform implements IPlatform {

    public MacPlatform()
    {
        System.out.println("[DEBUG] Test(s) running in Mac OS...");
    }

    public String getChromeDriverPath() {
        return null;
    }

    public String getGeckoDriverPath() {
        return null;
    }
}
