package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@parametre",
        dryRun = false
)

public class Runner {
     /*
       Bir framework'de bir tek Runner class'i yeterli olabilirir.
       Runner class'inda class body'sinde hic bir sey olmaz.
       Runner class'imizi onemli yapan 2 adet notasyon(annotaion) vardir.
       @RunWith(Cucumber.class) notasyonu Runner class'ina calisma ozelligi katar.B
       Bu notasyon oldugu icin Cucumber framework'umuzde JUnit kullanmayi tercih ediyoruz.
       @CucumberOptions notasyonu ile Runner class'ina neyi nereden bulacagini ve calistiracagini soyluyoruz.

       features : Runner dosyasinin feature dosyalarini nereden bulacagini tarif eder
       glue : stepDefinitions dosyalarini neren bulcagimizi gosterir.
       tags : o an hangi tag'i calistirmak istiyorsak onu belli eder.

       dryRun : iki secenek var:
       dryRun=true; yazdigimizda testimizi calistirmadan sadece eksik adimlari bize verir.
       dryRun=false; yazdigimizda testlerimizi calistirir.


      */
}
