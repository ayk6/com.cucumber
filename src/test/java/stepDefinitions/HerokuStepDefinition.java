package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerkuappPage;
import utilities.Driver;

import java.time.Duration;

public class HerokuStepDefinition {
    HerkuappPage herkuappPage = new HerkuappPage();

    @And("click add element button")
    public void clickElementButton() {
        herkuappPage.addElementButton.click();
    }

    @Then("wait delete button is displayed")
    public void waitDeleteButtonIsDisplayed() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(herkuappPage.deleteElementButton));
    }

    @And("test delete button is displayed")
    public void testDeleteButtonIsDisplayed() {
        Assert.assertTrue(herkuappPage.deleteElementButton.isDisplayed());
    }

    @Then("click delete button")
    public void clickDeleteButton() {
        herkuappPage.deleteElementButton.click();
    }

    @And("test telete button is not displayed")
    public void testTeleteButtonIsNotDisplayed() {
        Assert.assertTrue(herkuappPage.deleteList.isEmpty());
    }
}
