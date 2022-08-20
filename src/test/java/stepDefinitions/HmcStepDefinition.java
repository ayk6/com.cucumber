package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HmcPage;
import utilities.ConfigReader;

public class HmcStepDefinition {
    HmcPage hmcPage = new HmcPage();

    @Then("click login")
    public void click_login() {
        hmcPage.loginButton.click();
    }
    @Then("send valid username")
    public void send_valid_username() {
        hmcPage.usernameTextBox.sendKeys(ConfigReader.getProperty("hmcValidUsername"));
    }
    @Then("send valid password")
    public void send_valid_password() {
        hmcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("hmcValidPassword"));;
    }
    @Then("click login button")
    public void click_login_button() {
        hmcPage.loginButton2.click();
    }
    @Then("check logging in")
    public void check_logging() {
        Assert.assertTrue(hmcPage.hotelManagement.isDisplayed());
    }

    @And("send wrong username")
    public void sendWrongUsername() {
        hmcPage.usernameTextBox.sendKeys(ConfigReader.getProperty("hmcWrongUsername"));
    }

    @And("send wrong password")
    public void sendWrongPassword() {
        hmcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("hmcWrongPassword"));
    }

    @Then("check failed logging in")
    public void checkFailedLoggingIn() {
        Assert.assertTrue(hmcPage.loginButton2.isDisplayed());
    }
}
