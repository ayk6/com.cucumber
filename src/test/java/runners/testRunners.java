package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\avahm\\Desktop\\Selenium\\com.cucumber\\src\\test\\resources\\features"
,glue = "stepDefinition")
public class testRunners {
}
