package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HmcPage {
    public HmcPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@class='form-control required']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@class='form-control required password']")
    public WebElement passwordTextBox;

    @FindBy(id = "btnSubmit")
    public WebElement loginButton2;

    @FindBy(id = "menuHotels")
    public WebElement hotelManagement;

}
