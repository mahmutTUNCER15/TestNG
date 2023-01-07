package tests.day14_testFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C03_NutellaTesti {

    @Test
    public void test01(){
        //amazon anasayfaya gidin
        Driver.getDriver().get("https://www.amazon.com");

        // amazon anasayfaya gittiğini doğrulayın
        SoftAssert softaseert=new SoftAssert();
        String expecdeturlKelime="amazon";
        String actualUrrl=Driver.getDriver().getCurrentUrl();
        softaseert.assertTrue(actualUrrl.contains(expecdeturlKelime));

        // Nutella aratın
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("nutella"+Keys.ENTER);

        //arama sonuclarının nutella içerdiğini doğrulayın
        String aramaSonuçYazısı=amazonPage.aramaSonucuElementi.getText();
        softaseert.assertTrue(aramaSonuçYazısı.contains("nutella"));
        ReusableMethods.bekle(10);
        //Java aratın
        //arama sonuclarının 1000'den fazla oldugunu dogrulayın
softaseert.assertAll();
Driver.closeDriver();

        // amazon anasayfaya gidin
        Driver.getDriver().get("https://www.amazon.com");
        // nutella icin arama yapin
        //WebElement aramaKutusu= Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
       // AmazonPage amazonPage= new AmazonPage();

        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        // sonuclarin Nutella icerdigini test edin
        // WebElement aramaSonucuElementi= Driver.getDriver().findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        String expectedKelime="Nutella";
        String actualAramaSonucu= amazonPage.aramaSonucuElementi.getText();

        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));

        Driver.closeDriver();

    }
}