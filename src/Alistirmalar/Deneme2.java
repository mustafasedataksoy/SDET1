package Alistirmalar;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız. //*[text()='Samsung galaxy s6']
3- Sepete ekleyiniz. [class='btn btn-success btn-lg']
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */


public class Deneme2 extends BaseDriver {



    @Test

    public void Test1()
    {
        driver.get("https://www.demoblaze.com/index.html");

        WebElement samsung=driver.findElement(By.xpath(" //*[text()='Samsung galaxy s6']"));
        samsung.click();

        WebElement sepeteEkle=driver.findElement(By.cssSelector("[class='btn btn-success btn-lg']"));
        sepeteEkle.click();






    }
}
