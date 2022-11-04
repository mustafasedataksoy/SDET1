package Odevler;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev_02 {
    public static void main(String[] args) {


//        1) Bu siteye gidin. -> https://demo.applitools.com/
//
//        2) Username kısmına "ttechno@gmail.com" girin.
//
//        3) Password kısmına "techno123." girin.
//
//        4) "Sign in" buttonunan tıklayınız.
//
//        5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.applitools.com/");

        MyFunc.Bekle(3);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ttechno@gmail.com");

        MyFunc.Bekle(2);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("techno123");

        MyFunc.Bekle(2);
        WebElement signIn = driver.findElement(By.id("log-in"));
        signIn.click();

        MyFunc.Bekle(10);
        driver.quit();

    }
}
