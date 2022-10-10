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
    AmazonPage amazonPage =new AmazonPage();

    @Given("kullanici amazon anasayfasinda")
    public void kullaniciAmazonAnasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("kullanici Nutella icin arama yapar")
    public void kullaniciNutellaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
    }

    @And("souclarin Nutella icerdigini test eder")
    public void souclarinNutellaIcerdiginiTestEder() {
        String arananKelime="Nutella";
        String actualAramaSonucElementi=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucElementi.contains(arananKelime));
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici Java icin arama yapar")
    public void kullaniciJavaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Java", Keys.ENTER);
    }

    @And("souclarin Java icerdigini test eder")
    public void souclarinJavaIcerdiginiTestEder() {
        String arananKelime="Java";
        String actualAramaSonucElementi=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucElementi.contains(arananKelime));
    }

    @And("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);
    }

    @Then("souclarin iphone icerdigini test eder")
    public void souclarinIphoneIcerdiginiTestEder() {
        String arananKelime="iphone";
        String actualAramaSonucElementi=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucElementi.contains(arananKelime));
    }


    @And("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String istenenKelime) {
        amazonPage.aramaKutusu.sendKeys(istenenKelime, Keys.ENTER);
    }

    @And("souclarin {string} icerdigini test eder")
    public void souclarinIcerdiginiTestEder(String istenenKelime) {
        String arananKelime=istenenKelime;
        String actualAramaSonucElementi=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucElementi.contains(arananKelime));
    }


    @Given("kullanici {string} anasayfasinda") //amazonUrl
    public void kullaniciAnasayfasinda(String istenenUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @And("url'in {string} icerdigini test eder")
    public void urlInIcerdiginiTestEder(String istenenKelime) {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));
    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int istenenSaniye) {
        try {
            Thread.sleep(istenenSaniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
