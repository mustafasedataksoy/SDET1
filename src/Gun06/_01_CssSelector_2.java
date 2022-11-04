package Gun06;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector_2 extends BaseDriver {


    @Test
    public void test1()
    {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");



        String mesajim="merhaba selenium";
        WebElement enterButon=driver.findElement(By.cssSelector("input[id='user-message']"));
        enterButon.sendKeys(mesajim);


        WebElement showMessage=driver.findElement(By.cssSelector("[type='button'][class='btn btn-default']"));
        showMessage.click();

        WebElement msg=driver.findElement(By.cssSelector("span[id='display']"));

//        if (msg.getText().contains("merhaba selenium"))
//            System.out.println("test passed");
//
//        else
//            System.out.println("test failed");

        Assert.assertTrue(mesajim+"MESAJ BULUNAMADI",msg.getText().contains(mesajim));
        //  ASSERTTRUE : İÇİNDEKİ DEĞER TRUE MU? TRUE İSE HİÇ BİRŞEY YAPMAZ.MESAJ VERMEZ
        // DEĞİLSE BEKLENEN OLMAMIŞSSA HATA MESAJI VERİR.
        // YANİ GENEL KURAL : HATA VAR İSE GÖSTER






        driverBekleKapat();

















    }


}
