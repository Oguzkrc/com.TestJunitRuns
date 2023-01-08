package Test_Runs.February06_23;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class Test_01 {


        @Test
        public void test01() {

            // amazon anasayfaya gidin
            Driver.getDriver().get("https://www.amazon.com");
            // nutella icin arama yapin
            WebElement aramaKutusu= Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
            aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

            // sonuclarin Nutella icerdigini test edin
            WebElement aramaSonucuElementi= Driver.getDriver().findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

            String expectedKelime = "Nutella";
            String actualAramaSonucu =aramaSonucuElementi.getText();

            Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));

            Driver.closeDriver();

        }
    }

