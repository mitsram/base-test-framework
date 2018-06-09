package platform;

/**
 * Created by mitsram on 13/05/2018.
 */
public class PlatformFactory {

    public IPlatform getPlatform()
    {
        if (System.getProperty("os.name").contains("Mac")) {
            return new MacPlatform();
        } else if (System.getProperty("os.name").equalsIgnoreCase("Windows")) {
            return new WindowsPlatform();
        }
        return null;
    }
}
