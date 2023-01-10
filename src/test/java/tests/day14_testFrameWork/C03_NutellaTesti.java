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

    @Test(groups = "minireg1")
    public void test01(){
        ReusableMethods.bekle(5);
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


    }
}