package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html"},
        features = "src/test/resources/features"
        , glue = "stepDefinitions"
        //,tags = "@test01" belirli tag'a sahip scenario'ları çalıştırmak için
       // ,dryRun = false  eksik adımları oluşturmak için true kullanılır
            // dryRun testi çalıştırmaz- eksik adımları bildirir
        // or ya da and ile birden fazla da çalıştırılabilir
        ,tags = "@guruPrac"
)
public class TestRunner {
}
