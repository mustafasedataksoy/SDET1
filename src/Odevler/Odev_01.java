package Odevler;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev_01 {
    public static void main(String[] args) {

//        1) Bu siteye gidin. ->  http://demoqa.com/text-box
//
//        2) Full Name kısmına "Automation" girin.
//
//        3) Email kısmına "Testing@gmail.com" girin.
//
//        4) Current Address kısmına "Testing Current Address" girin.
//
//        5) Permanent Address kısmına "Testing Permanent Address" girin.
//
//        6) Submit butonuna tıklayınız.
//
//        7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
//
//        8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demoqa.com/text-box");

        WebElement fullName=driver.findElement(By.id("userName"));
        fullName.sendKeys("Automation");

        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("Testing@gmail.com");

        WebElement current=driver.findElement(By.id("currentAddress"));
        current.sendKeys("Testing Current Adress ");

        WebElement permanent=driver.findElement(By.id("permanentAddress"));
        permanent.sendKeys("Testing permanent Address");

        WebElement submitButonu=driver.findElement(By.id("submit"));
        submitButonu.click();




        MyFunc.Bekle(10);
        driver.quit();

    }
}
