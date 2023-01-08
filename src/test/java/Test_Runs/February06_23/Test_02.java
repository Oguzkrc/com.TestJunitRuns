package Test_Runs.February06_23;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.net.URL;
import java.util.Arrays;

public class Test_02 {

    @Test
    public void test01(){

        // amazon anasayfaya gidin
        // amazon anasayfaya gittiginizi dogrulayın
        // Nutella aratin
        // arama sonuclarinin nutella icerdigini dogrulayin
        // Java aratin
        // arama sonuclarinin 1000'den fazla oldugunu dogrulayin

        Driver.getDriver().get("https://www.amazon.com/");
        SoftAssert softAssert= new SoftAssert();
        String expectUrlKelime="Ramazon";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectUrlKelime), "Url amazon içermiyor");
        AmazonPage amazonPage= new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        String aramaSonucYazisi= amazonPage.aramaSonucuElementi.getText();
        softAssert.assertTrue(aramaSonucYazisi.contains("Nutella"),"arama sonucları nutella icermiyor");
        amazonPage.amazonAramaKutusu.clear();
        amazonPage.amazonAramaKutusu.sendKeys("Java"+ Keys.ENTER);


        ReusableMethods.bekle(3);
        System.out.println(amazonPage.aramaSonucuElementi.getText());

        aramaSonucYazisi=amazonPage.aramaSonucuElementi.getText();

        String[] sonucArr= aramaSonucYazisi.split(" ");

        String javaSonucSayisiStr= sonucArr[3];

        javaSonucSayisiStr=javaSonucSayisiStr.replaceAll("\\W","");

        int sonucSayisi= Integer.parseInt(javaSonucSayisiStr);

        softAssert.assertTrue(sonucSayisi>1000);

          softAssert.assertAll();
          Driver.closeDriver();
    }

}
