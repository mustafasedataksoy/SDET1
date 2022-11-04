package OdevlerXpath_ile;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev04 extends BaseDriver {
    public static void main(String[] args) {


//        Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
//        Calculate'e tıklayınız.    // //a[@id='calculate']
//        İlk input'a herhangi bir sayı giriniz.  // //input[@id='number1']
//        İkinci input'a herhangi bir sayı giriniz.  // //input[@id='number2']
//        Calculate button'una tıklayınız. // //input[@id='calculate']
//        Sonucu alınız.
//        Sonucu yazdırınız.


        driver.get("https://testpages.herokuapp.com/styled/index.html");


        MyFunc.Bekle(2);
        WebElement calculateButton=driver.findElement(By.xpath("//a[@id='calculate']"));
        calculateButton.click();

        MyFunc.Bekle(2);
        WebElement firstButton=driver.findElement(By.xpath("//input[@id='number1']"));
        firstButton.sendKeys("40");


        MyFunc.Bekle(2);
        WebElement secondButton=driver.findElement(By.xpath("//input[@id='number2']"));
        secondButton.sendKeys("32");



        MyFunc.Bekle(2);
        WebElement calculate=driver.findElement(By.xpath("//input[@id='calculate']"));
        calculate.click();

        driverBekleKapat();





    }
}
