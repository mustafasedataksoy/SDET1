package Odevler;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev_05 {
    public static void main(String[] args) {

//        Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
//        Fake Alerts' tıklayınız.
//        Show Alert Box'a tıklayınız.
//        Ok'a tıklayınız.
//        Alert kapanmalıdır.


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");


        MyFunc.Bekle(2);
        WebElement fakeAlerts=driver.findElement(By.id("fakealerttest"));
        fakeAlerts.click();

        MyFunc.Bekle(2);
        WebElement alertBox= driver.findElement(By.id("fakealert"));
        alertBox.click();

        MyFunc.Bekle(2);
        WebElement okTikla=driver.findElement(By.id("dialog-ok"));
        okTikla.click();


        MyFunc.Bekle(5);
        driver.quit();


    }
}
