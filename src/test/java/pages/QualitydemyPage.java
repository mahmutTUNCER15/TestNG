package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;
import utilities.Driver;

public class QualitydemyPage {

    public Alert kullaniciEmailKutusu;
    public WebElement basariliGirisCoursesLinki;
    public Alert passwordKutusu;
    public HTMLInputElement loginButonu;

    public QualitydemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy(xpath ="//*[text()='Log in]" )
    public WebElement ilkLoginLinki;

    @FindBy(id = "login-email")
    public WebElement kullanıcıEmailKutusu;

    @FindBy(id ="login-password" )
    public WebElement posworKutusu;

    @FindBy(id = "//button[text()='Login']")
    public WebElement loginKutusu;

    @FindBy(linkText = "My courses")
    public WebElement basşarılıGirişLinlki;

}
