package OdevlerXpath_ile;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev02 extends BaseDriver {
    public static void main(String[] args) {

        //1) Bu siteye gidin. -> https://demo.applitools.com/
//
//        2) Username kısmına "ttechno@gmail.com" girin.  // //input[@id='username']
//
//        3) Password kısmına "techno123." girin.        // //input[@id='password']
//
//        4) "Sign in" buttonunan tıklayınız.       // //a[@id='log-in']
//
//        5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.

        driver.get("https://demo.applitools.com/");

        MyFunc.Bekle(2);
        WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("ttechno@gmail.com");

        MyFunc.Bekle(2);
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("techno123.");

        MyFunc.Bekle(2);
        WebElement signInButton=driver.findElement(By.xpath("//a[@id='log-in']"));
        signInButton.click();





        driverBekleKapat();


    }
}
