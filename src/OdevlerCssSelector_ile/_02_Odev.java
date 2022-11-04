package OdevlerCssSelector_ile;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Odev extends BaseDriver {
    public static void main(String[] args) {
        //        1) Bu siteye gidin. -> https://demo.applitools.com/
//
//        2) Username kısmına "ttechno@gmail.com" girin.  [class=form-control][id='username']
//
//        3) Password kısmına "techno123." girin.      [type='password'][id='password']
//
//        4) "Sign in" buttonunan tıklayınız.
//
//        5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.



        driver.get("https://demo.applitools.com/");

        MyFunc.Bekle(1);
        WebElement username=driver.findElement(By.cssSelector("[class=form-control][id='username']"));
        username.sendKeys("ttechno@gmail.com");

        MyFunc.Bekle(1);
        WebElement password=driver.findElement(By.cssSelector("[type='password'][id='password']"));
        password.sendKeys("techno123.");

        MyFunc.Bekle(1);
        WebElement signButton=driver.findElement(By.cssSelector("[class='btn btn-primary'][id='log-in']"));
        signButton.click();



        driverBekleKapat();





    }
}
