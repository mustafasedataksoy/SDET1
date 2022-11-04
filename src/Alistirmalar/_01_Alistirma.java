package Alistirmalar;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_Alistirma extends BaseDriver {
    public static void main(String[] args) {


        // 1) Bu siteye gidin. ->  http://demoqa.com/text-box
//
//        2) Full Name kısmına "Automation" girin.    // [id='userName']
//
//        3) Email kısmına "Testing@gmail.com" girin.   // [id='userEmail']
//
//        4) Current Address kısmına "Testing Current Address" girin.  // [id='currentAddress']
//
//        5) Permanent Address kısmına "Testing Permanent Address" girin.  // [id='permanentAddress']
//
//        6) Submit butonuna tıklayınız.   // [id='submit']
//
//        7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
//
//        8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.


        driver.get("http://demoqa.com/text-box");


        MyFunc.Bekle(2);
        WebElement fullName=driver.findElement(By.id("userName"));
        fullName.sendKeys("Automation");

        MyFunc.Bekle(2);
        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("Testing@gmail.com");


        MyFunc.Bekle(2);
        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Testing Current Address");


        MyFunc.Bekle(2);
        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Testing Permanent Address");


        MyFunc.Bekle(2);
        WebElement submitButton=driver.findElement(By.id("submit"));
        submitButton.click();







        driverBekleKapat();








    }
}
