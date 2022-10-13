package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.PracticeTestPage;
import utilities.Driver;

import java.util.List;

public class PracticeTestPageStepDefiniton {

    PracticeTestPage practiceTestPage=new PracticeTestPage();

    Actions actions=new Actions(Driver.getDriver());

    int down32Toplam;

    int clickTextToplam;

    int sonuc;

    @Given("{string} adresine gidin")
    public void adresineGidin(String url) {
        Driver.getDriver().get(url);
    }

    @Then("{int} defa click me ye tiklayin")
    public void defaClickMeYeTiklayin(int sayi) {

        for (int i = 0; i < sayi; i++) {
            practiceTestPage.clickButton.click();
        }
    }

    @When("{int} defa Space dugmesine basin")
    public void defaSpaceDugmesineBasin(int sayi1) {
        for (int i = 0; i <sayi1 ; i++) {
            actions.sendKeys(Keys.SPACE).perform();
        }
    }

    @When("Down yazisindaki iki basamakli sayilarin hepsini toplayin")
    public void downYazisindakiIkiBasamakliSayilarinHepsiniToplayin() {
       List <WebElement> down32= practiceTestPage.down32;

        for (WebElement w:down32
             ) {
            down32Toplam+=Integer.parseInt(w.getText().replaceAll("\\D",""));

        }

    }

    @Then("Tum click metinlerinin uzunlugunun toplamini onceki toplamdan cikarin")
    public void tumClickMetinlerininUzunlugununToplaminiOncekiToplamdanCikarin() {
       List <WebElement> clickText= practiceTestPage.clickText;

        for (WebElement w:clickText
             ) {
            clickTextToplam+=w.getText().length();
        }

        sonuc=down32Toplam-clickTextToplam;
    }

    @And("sonucun {int} oldugunu dogrulayin")
    public void sonucunOldugunuDogrulayin(int result) {
        Assert.assertEquals("sonuc esit degil",result,sonuc);
    }

   // clickButonLenghtToplam=tphop.clickListesi.stream().map(t->t.getText().length())
    //        .reduce(0, Integer::sum);
}
