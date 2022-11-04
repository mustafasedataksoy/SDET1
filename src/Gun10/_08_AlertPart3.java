package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _08_AlertPart3 extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe1 = driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
        clickMe1.click();

        MyFunc.Bekle(2);
        driver.switchTo().alert().sendKeys("ismet");
        driver.switchTo().alert().accept();
        MyFunc.Bekle(2);

        WebElement txtActual=driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue("Beklenen yazı gözükmedi ",txtActual.getText().contains("ismet"));

        driverBekleKapat();
    }






}
