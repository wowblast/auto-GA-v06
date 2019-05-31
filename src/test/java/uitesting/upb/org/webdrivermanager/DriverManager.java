package uitesting.upb.org.webdrivermanager;

import org.openqa.selenium.WebDriver;

/**
 * @autor Marcelo Garay
 */
public class DriverManager {
    private WebDriver webDriver;
    private static DriverManager ourInstance = new DriverManager();

    public static DriverManager getInstance() {
        return ourInstance;
    }

    private DriverManager() {
        webDriver = DriverFactory.getWebDriver(BrowserType.CHROME);
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }
}
