package stepDefinitions;

import com.beust.ah.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;

public class datatablesStepDefinitions {

    DataTablesPage dataTablesPage=new DataTablesPage();

    @Then("new butonuna basar")
    public void newButonunaBasar() {
        dataTablesPage.newButonu.click();
    }

    @And("isim bolumune {string} yazar")
    public void isimBolumuneYazar(String isim) {
        dataTablesPage.isim.sendKeys(isim);
    }

    @And("soyisim bolumune {string} yazar")
    public void soyisimBolumuneYazar(String soyisim) {
        dataTablesPage.soyisim.sendKeys(soyisim);
    }

    @And("position bolumune {string} yazar")
    public void positionBolumuneYazar(String position) {
        dataTablesPage.position.sendKeys(position);
    }

    @And("office bolumune {string} yazar")
    public void officeBolumuneYazar(String office) {
        dataTablesPage.office.sendKeys(office);
    }

    @And("extension bolumune {string} yazar")
    public void extensionBolumuneYazar(String extension) {
        dataTablesPage.extension.sendKeys(extension);
    }

    @And("startDate bolumune {string} yazar")
    public void startdateBolumuneYazar(String startDate) {
        dataTablesPage.startDate.sendKeys(startDate);
    }

    @And("salary bolumune {string} yazar")
    public void salaryBolumuneYazar(String salary) {
        dataTablesPage.salary.sendKeys(salary);

    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        dataTablesPage.createButon.click();
    }


    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String isim) {
        dataTablesPage.searchButonu.sendKeys(isim);

    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String isim) {
        Assert.assertTrue(dataTablesPage.aramaSonucIlkElement.getText().contains(isim));
    }
}
