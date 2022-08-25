package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelStepDefinition {
    Workbook workbook;
    @Given("excel data is made available")
    public void excelDataIsMadeAvailable() throws IOException {
        String filePath="src/test/resources/countries.xlsx";
        FileInputStream fis = new FileInputStream(filePath);
        workbook = WorkbookFactory.create(fis);
    }

    @And("print country whose capital is jakarta")
    public void printCountryWhoseCapitalIsJakarta() {
        int rowCount=workbook.getSheet("Sayfa1").getLastRowNum();
        for (int i=0;i<=rowCount;i++){
            if (workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString()
                    .equals("jakarta")){
                System.out.println(
                        workbook.getSheet("Sayfa1").getRow(i).getCell(0).toString());
            }
        }
    }

    @Then("check country number is {int}")
    public void checkCountryNumberIs(int countRY) {
        int actCountRy=workbook.getSheet("Sayfa1").getLastRowNum()-1;
        Assert.assertTrue(countRY==actCountRy);
    }

    @And("check rows are {int}")
    public void checkRowsAre(int row) {
        // fiziken kullanılan satır sayısı
        int actRowCount=workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();
        Assert.assertTrue(row==actRowCount);
    }

    @Then("print {int}. row {int}.col data")
    public void printRowColData(int row, int col) {
        System.out.println(row+". row, "+col+".col data is :"+
                workbook.getSheet("Sayfa1").getRow(row-1).getCell(col-1).toString());
    }
}
