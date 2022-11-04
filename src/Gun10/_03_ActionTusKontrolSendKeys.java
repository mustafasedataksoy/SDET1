package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionTusKontrolSendKeys extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/auto-complete");

        WebElement element = driver.findElement(By.id("autoCompleteSingleContainer")); // [id='autoCompleteSingleContainer'] autoCompleteSingleInput

        Actions aksiyonlar = new Actions(driver);

        Action aksiyon = aksiyonlar.
                moveToElement(element)  // KUTUCUĞA GİT
                .click()               // İÇİNE TIKLAT
                .keyDown(Keys.SHIFT)   // SHIFT BAS
                .sendKeys("a")         // A YA BAS
                .keyUp(Keys.SHIFT)    //SHIFT BIRAK
                .sendKeys("hmet")      // HMET YAZ
                .build();

        MyFunc.Bekle(2);
        aksiyon.perform();

        driverBekleKapat();


    }
}
