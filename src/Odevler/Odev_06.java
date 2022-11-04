package Odevler;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev_06 {
    public static void main(String[] args) {

//        Bu siteye gidiniz.  https://testpages.herokuapp.com/styled/index.html
//        Fake Alerts'e tıklayınız.
//        Show modal dialog buttonuna tıklayınız.Ok'a tıklayınız.
//        Alert kapanmalıdır.



        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");


        MyFunc.Bekle(2);
        WebElement fakeAlerts=driver.findElement(By.id("fakealerttest"));
        fakeAlerts.click();

        MyFunc.Bekle(2);
        WebElement modelButton=driver.findElement(By.id("modaldialog"));
        modelButton.click();

        MyFunc.Bekle(2);
        WebElement okTikla=driver.findElement(By.id("dialog-ok"));
        okTikla.click();

        driver.quit();
        MyFunc.Bekle(10);



    }
}
