package Alistirmalar;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Case_03 extends BaseDriver {

    @Test

    public void Test3() {

        driver.get(" https://shopdemo.e-junkie.com/");
        WebDriverWait bekle = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement addtoToCard = driver.findElement(By.cssSelector("[class='view_product'][onclick=\"return EJProductClick('1595015')\"]"));
        addtoToCard.click();


        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']"));
        bekle.until(ExpectedConditions.visibilityOf(iframe));
        driver.switchTo().frame(iframe);


        WebElement debitButton = driver.findElement(By.cssSelector("button[class='Payment-Button CC']"));
        bekle.until(ExpectedConditions.visibilityOf(debitButton));
        debitButton.click();


        WebElement iframe1 = driver.findElement(By.xpath("//div[@class='__PrivateStripeElement']//iframe"));
        bekle.until(ExpectedConditions.visibilityOf(iframe1));
        driver.switchTo().frame(iframe1);

        WebElement cardInput = driver.findElement(By.xpath("//span[@class='InputContainer']//input"));
        cardInput.sendKeys("1111 1111 1111 1111");


        driver.switchTo().parentFrame();
        WebElement invalidButton = driver.findElement(By.id("SnackBar"));
        bekle.until(ExpectedConditions.visibilityOf(invalidButton));

        Assert.assertTrue("Your card number is invalid yazısı görülmedi", invalidButton.getText().contains("Your card number is invalid"));


        driverBekleKapat();

       }

}
