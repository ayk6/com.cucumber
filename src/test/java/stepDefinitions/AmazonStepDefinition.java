package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinition {
    AmazonPage amazonPage = new AmazonPage();

    @Given("amazon main page")
    public void amazon_main_page() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("search mandosi")
    public void search_mandosi() {
        amazonPage.searchBox.sendKeys("mandosi" + Keys.ENTER);
    }

    @Then("test results contains mandosi")
    public void test_results_contains_mandosi() {
        Assert.assertTrue(amazonPage.resultText.getText().contains("mandosi"));
    }

    @Then("close page")
    public void close_page() {
        Driver.closeDriver();
    }

    @Then("search glass")
    public void search_glass() {
        amazonPage.searchBox.sendKeys("glass" + Keys.ENTER);
    }

    @Then("test results contains glass")
    public void test_results_contains_glass() {
        Assert.assertTrue(amazonPage.resultText.getText().contains("glass"));
    }

    @And("search {string}")
    public void search(String searchedWord) {
        amazonPage.searchBox.sendKeys(searchedWord + Keys.ENTER);
    }

    @And("test results contains {string}")
    public void testResultsContains(String searchedWord) {
        Assert.assertTrue(amazonPage.resultText.getText().contains(searchedWord));
    }

    @Given("{string} page")
    public void page(String requestedUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(requestedUrl));
    }

    @And("test page contains {string}")
    public void testPageContains(String requestedText) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(requestedText));
    }

    @Then("wait {int} seconds")
    public void waitSeconds(int waitingSeconds) {
        try {
            Thread.sleep(waitingSeconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
