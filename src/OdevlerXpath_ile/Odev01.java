package OdevlerXpath_ile;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev01 extends BaseDriver {
    public static void main(String[] args) {


//        1) Bu siteye gidin. ->  http://demoqa.com/text-box
////
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

        driver.get("http://demoqa.com/text-box");

        WebElement fullName=driver.findElement(By.xpath("//input[@id='userName']"));
        fullName.sendKeys("Automation");

        WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("Testing@gmail.com");

        WebElement currentAddress=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAddress.sendKeys("Testing Current Address");

        WebElement permanentAddress=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddress.sendKeys("Testing Permanent Address");

        WebElement submitButton=driver.findElement(By.xpath("//button[@id='submit']"));
        submitButton.click();


        driverBekleKapat();

    }
}
