package drivers.strategies;

import drivers.strategies.DriverStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome implements DriverStrategy {
    @Override
    public WebDriver setStrategy(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        //setting to true, causes issues
        options.setExperimentalOption("useAutomationExtension",false);
        options.addArguments("--no-sandbox");
        return new ChromeDriver(options);
    }

}
