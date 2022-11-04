package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver {


    public static void main(String[] args) {

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        // WEB SAYFASI AÇMA KOMUTU
        MyFunc.Bekle(3);
        WebElement element = driver.findElement(By.linkText("Alerts (JavaScript)"));
        element.click();

        System.out.println(driver.getCurrentUrl()); // O ANDA BULUNDUĞUN URL Yİ VERİYOR.

        MyFunc.Bekle(3);
        driver.navigate().back(); // TARAYICI HİSTORY SİNDEN GERİ GELDİM

        System.out.println(driver.getCurrentUrl()); // O ANDA BULUNDUĞUN URL Yİ VERİYOR.

        MyFunc.Bekle(3);
        driver.navigate().forward();// TARAYICI HİSTORY SİNDEN İLERİ GİTTİM


        System.out.println(driver.getCurrentUrl()); // O ANDA BULUNDUĞUN URL Yİ VERİYOR.

        driverBekleKapat();

    }
}
