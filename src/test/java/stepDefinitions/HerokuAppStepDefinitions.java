package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuAppPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.time.Duration;

public class HerokuAppStepDefinitions {

    HerokuAppPage herokuAppPage=new HerokuAppPage();
    @And("Add Element butonuna basar")
    public void addElementButonunaBasar() {
        herokuAppPage.onclick.click();
    }

    @Then("{string} butonu gorunur oluncaya kadar bekler")
    public void butonuGorunurOluncayaKadarBekler(String Delete) {
        ReusableMethods.waitForVisibility(herokuAppPage.Delete,5);
    }

    @And("{string} butonu gorunur oldugunu test eder")
    public void butonuGorunurOldugunuTestEder(String Delete) {
        Assert.assertTrue(herokuAppPage.Delete.isDisplayed());
    }

    @Then("{string} butonuna basar")
    public void butonunaBasar(String Delete) {
        herokuAppPage.Delete.click();
    }

    @And("{string} butonunun gorunmedigini test eder")
    public void butonununGorunmediginiTestEder(String Delete)  {
        Assert.assertTrue(herokuAppPage.deleteListi.isEmpty());
    }
}
