package Test_Runs.February06_23;

import org.testng.annotations.Test;
import utilities.Driver;

public class Test_03 {

    //1- https://www.qualitydemy.com/ anasayfasina gidin
    //2- login linkine basin
    // 3- Kullanici email’i olarak valid email girin
    // 4- Kullanici sifresi olarak valid sifre girin
    // 5- Login butonuna basarak login olun
    // 6- Basarili olarak giris yapilabildigini test ediniz

    @Test
    public void test01(){

        Driver.getDriver().get("https://www.qualitydemy.com/");



    }

}
