package _02_Proje;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _04_Case extends BaseDriver {

    @Test

    public void Test4()
    {

        driver.get(" https://shopdemo.e-junkie.com/ ");
        WebDriverWait bekle = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement addtoToCard = driver.findElement(By.cssSelector("[class='view_product'][onclick=\"return EJProductClick('1595015')\"]"));
        addtoToCard.click();

        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']"));
        bekle.until(ExpectedConditions.visibilityOf(iframe));
        driver.switchTo().frame(iframe);


        WebElement debitButton = driver.findElement(By.cssSelector("button[class='Payment-Button CC']"));
        bekle.until(ExpectedConditions.visibilityOf(debitButton));
        debitButton.click();


        WebElement email=driver.findElement(By.xpath("//input[@placeholder='Email']"));
        email.sendKeys("mahmut@hotmail.com");

        WebElement confirmEmail=driver.findElement(By.xpath("//input[@placeholder='Confirm Email']"));
        confirmEmail.sendKeys("mahmut@hotmail.com");

        WebElement cardName=driver.findElement(By.xpath("//input[@placeholder='Name On Card']"));
        cardName.sendKeys("behçet");


        WebElement phone=driver.findElement(By.xpath("(//input[@placeholder='Optional'])[1]"));
        phone.sendKeys("0900 909 90 90");

        WebElement company=driver.findElement(By.xpath("(//input[@placeholder='Optional'])[2]"));
        company.sendKeys("testerAŞ.");


        WebElement iframe1 = driver.findElement(By.xpath("//div[@class='__PrivateStripeElement']//iframe"));
        bekle.until(ExpectedConditions.visibilityOf(iframe1));
        driver.switchTo().frame(iframe1);

        WebElement cardInput = driver.findElement(By.xpath("//span[@class='InputContainer']//input"));
        cardInput.sendKeys("4242 4242 4242 4242");



        driver.switchTo().defaultContent();
        MyFunc.Bekle(2);
        driver.switchTo().frame(5);


        WebElement payButton=driver.findElement(By.xpath("//button[@class='Pay-Button']"));
        payButton.click();


        //driver.switchTo().defaultContent();
        //driver.switchTo().frame(5);
        MyFunc.Bekle(2);
        WebElement invalidButton = driver.findElement(By.id("SnackBar"));
        bekle.until(ExpectedConditions.visibilityOf(invalidButton));

        Assert.assertTrue("Your order is confirmed. Thank you! yazısı görülmedi",invalidButton.getText().contains("Your order is confirmed. Thank you!"));

        driverBekleKapat();
    }
}
