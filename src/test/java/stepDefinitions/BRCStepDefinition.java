package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BRCPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BRCStepDefinition {

    BRCPage brcPage=new BRCPage();
    @Then("Log in yazisina tiklar")
    public void logInYazisinaTiklar() {
        brcPage.loginYazisi.click();
    }

    @And("gecerli username girer")
    public void gecerliUsernameGirer() {
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
    }

    @And("gecerli password girer")
    public void gecerliPasswordGirer() {
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        brcPage.ikinciLoginYazisi.click();
    }

    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfayaGirisYaptiginiKontrolEder() {

        Assert.assertTrue(brcPage.jhonWalkerYazisi.isDisplayed());
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
       Assert.assertTrue(brcPage.ikinciLoginYazisi.isDisplayed());
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcWrongEmail"));
    }

    @And("gecersiz username olarak {string} girer")
    public void gecersizUsernameOlarakGirer(String username) {
        brcPage.emailTextBox.sendKeys(username);

    }

    @And("gecersiz password olarak {string} girer")
    public void gecersizPasswordOlarakGirer(String password) {
        brcPage.passwordTextBox.sendKeys(password);
    }
}
