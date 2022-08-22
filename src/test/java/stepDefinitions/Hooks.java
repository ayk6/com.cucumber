package stepDefinitions;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    // cucumber'da before ve after methodlar step definitions içinde ise
    // her durumda çalışır (test.ng extends halinde çalışır)
    // bu yüzden before after ihtiyaç olmadıkça kullanılmaz
    // test sonucunu ss almak için aftermethod kullanılabilir

    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()){
            scenario.attach(screenshot,"image.png","screeenshots");
        }
        Driver.closeDriver();
    }
}
