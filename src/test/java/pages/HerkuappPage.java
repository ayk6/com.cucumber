package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerkuappPage {

    public HerkuappPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@onclick='addElement()']")
    public WebElement addElementButton;

    @FindBy(xpath = "//button[@class='added-manually']")
    public WebElement deleteElementButton;

    @FindBy(xpath = "//button[@class='added-manually']")
    public List<WebElement> deleteList;
}
