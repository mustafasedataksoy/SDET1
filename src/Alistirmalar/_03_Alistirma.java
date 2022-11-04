package Alistirmalar;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Alistirma extends BaseDriver {

    public static void main(String[] args) {

 //       Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
//        Calculate'e tıklayınız.                                                          //a[@id='calculatetest']
//        İlk input'a herhangi bir sayı giriniz.   //input[@id='number1']
//        İkinci input'a herhangi bir sayı giriniz.  //input[@id='number2']
//        Calculate button'una tıklayınız.  //input[@id='calculate']
//        Sonucu alınız.
//        Sonucu yazdırınız.

        driver.get("https://testpages.herokuapp.com/styled/index.html");


        MyFunc.Bekle(2);
        WebElement calculate=driver.findElement(By.xpath("//a[@id='calculatetest']"));
        calculate.click();

        MyFunc.Bekle(2);
        WebElement ilkInput=driver.findElement(By.xpath("//input[@id='number1']"));
        ilkInput.sendKeys("38");


        MyFunc.Bekle(2);
        WebElement ikinciInput=driver.findElement(By.xpath("//input[@id='number2']"));
        ikinciInput.sendKeys("7");

        MyFunc.Bekle(2);
        WebElement calculateButton=driver.findElement(By.xpath("//input[@id='calculate']"));
        calculateButton.click();


        driverBekleKapat();











    }
}
