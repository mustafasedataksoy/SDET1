package Odevler;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev_03 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");

//        1) Bu siteye gidin. -> https://www.snapdeal.com/
//
//        2) "teddy bear" aratın ve  Search butonuna tıklayın.
//
//        3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
//        Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

        MyFunc.Bekle(1);
        WebElement searcButton=driver.findElement(By.id("inputValEnter"));
        searcButton.sendKeys("Tedy bear");

        MyFunc.Bekle(1);
        WebElement tikla=driver.findElement(By.className("searchTextSpan"));
        tikla.click();


        MyFunc.Bekle(10);
        driver.quit();



    }
}
