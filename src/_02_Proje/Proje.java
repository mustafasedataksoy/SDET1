package _02_Proje;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Proje extends BaseDriver {



    @Test

    public void Test1()
    {

        driver.get("https://shopdemo.e-junkie.com/");

        MyFunc.Bekle(2);
        WebElement addtoToCard=driver.findElement(By.cssSelector("[class='view_product'][onclick=\"return EJProductClick('1595015')\"]")) ;
        addtoToCard.click();

        MyFunc.Bekle(2);
        WebElement iframe=driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']"));
        driver.switchTo().frame(iframe);

         // //button[@class='Apply-Button Show-Promo-Code-Button']

        //iframe[@class='EJIframeV3 EJOverlayV3']
        WebElement addProm=driver.findElement(By.xpath("//button[@class='Apply-Button Show-Promo-Code-Button']"));
        addProm.click();


        MyFunc.Bekle(2);
        WebElement input=driver.findElement(By.xpath("//input[@class='Promo-Code-Value']"));
        input.sendKeys("100");


        MyFunc.Bekle(2);
        WebElement aplly=driver.findElement(By.xpath("//button[text()='Apply']"));
        aplly.click();

        MyFunc.Bekle(2);
        WebElement uyari=driver.findElement(By.id("SnackBar"));

        Assert.assertTrue("Invalid promo code yazısı görülmedi",uyari.getText().contains("Invalid promo code"));



        WebDriverWait bekle=new WebDriverWait(driver, Duration.ofSeconds(13));
        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));


        MyFunc.Bekle(2);
        driverBekleKapat();
    }
    @Test

    public void Test2()
    {

        driver.get(" https://shopdemo.e-junkie.com/");

        MyFunc.Bekle(2);
        WebElement addtoToCard=driver.findElement(By.cssSelector("[class='view_product'][onclick=\"return EJProductClick('1595015')\"]")) ;
        addtoToCard.click();

        MyFunc.Bekle(2);
        WebElement iframe=driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']"));
        driver.switchTo().frame(iframe);

        WebDriverWait bekle=new WebDriverWait(driver, Duration.ofSeconds(13));
        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='Payment-Button CC']")));



        WebElement debitButton=driver.findElement(By.cssSelector("button[class='Payment-Button CC']"));
        bekle.until(ExpectedConditions.visibilityOf(debitButton));
        debitButton.click();



        driver.switchTo().parentFrame();
        driver.switchTo().frame(5);



        WebElement payButton=driver.findElement(By.xpath("//button[@class='Pay-Button']"));
        payButton.click();

        driverBekleKapat();

    }
    @Test

    public void Test3()
    {

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
    @Test

    public void Test5() {

        driver.get("https://shopdemo.e-junkie.com/");
        WebDriverWait bekle = new WebDriverWait(driver, Duration.ofSeconds(15));


        WebElement contactUs = driver.findElement(By.cssSelector("[class='contact']"));
        contactUs.click();

        WebElement nameButton = driver.findElement(By.cssSelector("[id='sender_name']"));
        nameButton.sendKeys("şakir");


        WebElement emailButton = driver.findElement(By.cssSelector("[id='sender_email']"));
        emailButton.sendKeys("mahmut@hotmail.com");


        WebElement subjectButton = driver.findElement(By.cssSelector("[id='sender_subject']"));
        subjectButton.sendKeys("selam");

        WebElement messageButton = driver.findElement(By.cssSelector("[id='sender_message']"));
        messageButton.sendKeys("merhaba dünya");

        WebElement sendButton = driver.findElement(By.cssSelector("[id='send_message_button']"));
        sendButton.click();

        MyFunc.Bekle(5);
        //bekle.until(ExpectedConditions.);
        driver.switchTo().alert().accept();


        driverBekleKapat();

    }

    }
