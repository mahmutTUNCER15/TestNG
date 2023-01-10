package tests.day18_HhtmReports;

import org.bouncycastle.util.test.TestRandomBigInteger;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class c01HtmlReports extends TestBaseRapor {
    @Test
    public void tests01(){
        extentTest=extentReports.createTest("nutella testi","kullanıcı amazonda nutella arayabılmelı");
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("amazon anasayfaya gidildi");
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("nutella"+Keys.ENTER);
        extentTest.info("arama kutusuna nutella yazıp arama yapıldı");

        String actualSonuçYazısı=amazonPage.aramaSonucuElementi.getText();
        String expecdetKelime="nutella";
        extentTest.info("arama sonuçları kaydedıldı");
        Assert.assertTrue(actualSonuçYazısı.contains(expecdetKelime));
        extentTest.pass("arama sonucları goruntulendı");

    }
}
