import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class Test_01 {

    //1- https://www.qualitydemy.com/ anasayfasina gidin
    //2- login linkine basin
    // 3- Kullanici email’i olarak valid email girin
    // 4- Kullanici sifresi olarak valid sifre girin
    // 5- Login butonuna basarak login olun
    // 6- Basarili olarak giris yapilabildigini test ediniz

    @Test
    public void test01(){

        Driver.getDriver().get("https://www.qualitydemy.com/");
        QualitydemyPage qualitydemyPage= new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys("ornek@login.com");
        qualitydemyPage.passwordKutusu.sendKeys("123456");
        qualitydemyPage.loginButonu.click();
        Assert.assertTrue(qualitydemyPage.basariliGirisCoursesLinki.isDisplayed());

        Driver.closeDriver();

    }

}
 