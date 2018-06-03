package browser;


import org.openqa.selenium.WebDriver;

public interface IBrowser {

    public WebDriver getDriver();
    public void setGrid(String hubIPAddress);

}
