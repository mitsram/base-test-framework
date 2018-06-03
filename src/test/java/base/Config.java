package base;

/**
 * Created by mitsram on 12/05/2018.
 */
public interface Config {

    final String browser = System.getProperty("browser", "chrome");
    final String device = System.getProperty("device", "android");
    final String url = System.getProperty("url","https://mitsram.github.io");
    final String grid = System.getProperty("grid", "false");
    final String gridHub = System.getProperty("hub", "http://" + "localhost" + ":4444/wd/hub");


}
