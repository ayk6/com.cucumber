package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPracticePage;
import utilities.Driver;

import javax.swing.*;

public class AutomationPracStepDefinition {
    AutomationPracticePage automationPracticePage = new AutomationPracticePage();
    Faker faker = new Faker();
    @And("click sign in")
    public void clickSignIn() {
        automationPracticePage.singInButton.click();
    }

    @And("send email on create an account")
    public void sendEmailOnCreateAnAccount() {
        automationPracticePage.emailTextBox.sendKeys(faker.internet().emailAddress());
    }

    @And("click create an account")
    public void clickCreateAnAccount() {
        automationPracticePage.createAccountButton.click();
    }

    @And("send user data")
    public void sendUserData() {
        Actions actions= new Actions(Driver.getDriver());
        actions.click(automationPracticePage.gender)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys("15")
                .sendKeys(Keys.TAB)
                .sendKeys("January")
                .sendKeys(Keys.TAB)
                .sendKeys("2001")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                .sendKeys("Alaska")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys("United States")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB)
                .sendKeys("ALSK").perform();
    }

    @And("click register")
    public void clickRegister() {
        automationPracticePage.registerButton.click();
    }

    @And("verify creating account")
    public void verifyCreatingAccount() {
        Assert.assertTrue(automationPracticePage.positiveResultText.isDisplayed());
    }
}
