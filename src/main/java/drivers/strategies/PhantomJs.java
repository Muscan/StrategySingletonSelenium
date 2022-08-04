package drivers.strategies;

import drivers.strategies.DriverStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PhantomJs implements DriverStrategy {
    //phantom  js is a headless browser
    //good memory performance
    //not supported on all browser
    @Override
    public WebDriver setStrategy(){
        System.setProperty("phantomjs.binary.path","src/main/resources/phantom.exe");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        //make sure js is enabled on browsers for the tests
        desiredCapabilities.setJavascriptEnabled(true);
        WebDriver driver = new PhantomJSDriver(desiredCapabilities);
        return  driver;
    }
}
