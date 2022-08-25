package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinition {

    GuruPage guruPage = new GuruPage();

    @And("print {string} col values")
    public void printColValues(String reqCol) {
        List<WebElement> requestedList =guruPage.reqList;
        // liste web elementlerden oluşuyor
        int reqValueRow = -1;
        for (int i =0; i<requestedList.size();i++){
            if (requestedList.get(i).getText().equals(reqCol)){
                reqValueRow=i+1;
                break;
            }
        }
        if (reqValueRow!=-1){
            // başlık bulunursa -1 olmayacak, bulunmazsa -1 kalır
            List<WebElement> reqRowElements=
                    Driver.getDriver().findElements(
                    By.xpath("//tbody//tr//td["+reqValueRow+"]"));
            for (WebElement each:reqRowElements
                 ) {
                System.out.println(each.getText());
            }
        }else System.out.println("heading not found");
    }
}
