package _02_Proje;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _05_Case extends BaseDriver {
    @Test

    public void Test5()
    {

        driver.get("https://shopdemo.e-junkie.com/");
        WebDriverWait bekle = new WebDriverWait(driver, Duration.ofSeconds(15));


        WebElement contactUs=driver.findElement(By.cssSelector("[class='contact']"));
        contactUs.click();

        WebElement nameButton=driver.findElement(By.cssSelector("[id='sender_name']"));
        nameButton.sendKeys("şakir");


        WebElement emailButton=driver.findElement(By.cssSelector("[id='sender_email']"));
        emailButton.sendKeys("mahmut@hotmail.com");


        WebElement subjectButton=driver.findElement(By.cssSelector("[id='sender_subject']"));
        subjectButton.sendKeys("selam");

        WebElement messageButton=driver.findElement(By.cssSelector("[id='sender_message']"));
        messageButton.sendKeys("merhaba dünya");

        WebElement sendButton=driver.findElement(By.cssSelector("[id='send_message_button']"));
        sendButton.click();

        MyFunc.Bekle(5);
        //bekle.until(ExpectedConditions.);
        driver.switchTo().alert().accept();



        driverBekleKapat();


    }
}
