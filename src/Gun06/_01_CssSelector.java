package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Assert; // JAVANIN KENDİ TEST KONTROL VE ORGANİZE SINIFI

public class _01_CssSelector extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");



        WebElement enterButon=driver.findElement(By.cssSelector("input[id='user-message']"));
        enterButon.sendKeys("merhaba selenium.");


        WebElement showMessage=driver.findElement(By.cssSelector("[type='button'][class='btn btn-default']"));
        showMessage.click();

        WebElement msg=driver.findElement(By.cssSelector("span[id='display']"));

//        if (msg.getText().contains("merhaba selenium"))
//            System.out.println("test passed");
//
//        else
//            System.out.println("test failed");

        Assert.assertTrue("MESAJ BULUNAMADI",msg.getText().contains("merhaba selenium"));
        //  ASSERTTRUE : İÇİNDEKİ DEĞER TRUE MU? TRUE İSE HİÇ BİRŞEY YAPMAZ.MESAJ VERMEZ
        // DEĞİLSE BEKLENEN OLMAMIŞSSA HATA MESAJI VERİR.
        // YANİ GENEL KURAL : HATA VAR İSE GÖSTER






        driverBekleKapat();




    }
}
