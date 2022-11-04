package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _01_IframeGiris extends BaseDriver {

    @Test

    public void Test1()
    {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0); // "frame1" id ve name ve webelement geçişi çok yavas
        WebElement input=driver.findElement(By.cssSelector("#topic+input"));
        input.sendKeys("Türkiye");


        // şu anda frame1 ile gösterilen sayfadayız ,diğer frame2 veya 3 ilk sayfamızdaki
        // locatorleri bulamayız,çünkü driver şuanda frame1 isimli sayfayı DRİVER  etmekte.

        // 1- driver.switchTo().frame(0); --> içteki frame3 e geçiş olur.
        // 2- driver.switchTo().parentFrame();  --> bir önceki sayfaya geri dönerim.
        // 3-driver.switchTo().defaultContent(); --> hangi sayfada olursan ol ilk sayfaya direk geçiş

        driverBekleKapat();






    }



}
