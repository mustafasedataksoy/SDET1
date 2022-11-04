package OdevlerCssSelector_ile;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_Odev  extends BaseDriver {
    public static void main(String[] args) {
//        1) Bu siteye gidin. ->  http://demoqa.com/text-box
//
//        2) Full Name kısmına "Automation" girin.    [type='text'][id='userName']
//
//        3) Email kısmına "Testing@gmail.com" girin.  [type='email'][id='userEmail']
//
//        4) Current Address kısmına "Testing Current Address" girin.  [class='form-control'][id='currentAddress']
//
//        5) Permanent Address kısmına "Testing Permanent Address" girin.  [class='form-control'][id='permanentAddress']
//
//        6) Submit butonuna tıklayınız.  [class='btn btn-primary'][id='submit']
//
//        7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
//
//        8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.


        driver.get("http://demoqa.com/text-box");

        MyFunc.Bekle(2);
        WebElement fullName=driver.findElement(By.cssSelector("[type='text'][id='userName']"));
        fullName.sendKeys("Automation");

        MyFunc.Bekle(2);
        WebElement email=driver.findElement(By.cssSelector("[type='email'][id='userEmail']"));
        email.sendKeys("Testing@gmail.com");

        MyFunc.Bekle(2);
        WebElement currentAddress=driver.findElement(By.cssSelector("[class='form-control'][id='currentAddress']"));
        currentAddress.sendKeys("Testing Current Address");

        MyFunc.Bekle(2);
        WebElement permanentAddress=driver.findElement(By.cssSelector("[class='form-control'][id='permanentAddress']"));
        permanentAddress.sendKeys("Testing Permanent Address");

        MyFunc.Bekle(2);
        WebElement submit=driver.findElement(By.cssSelector("[class='btn btn-primary'][id='submit']"));
        submit.click();

        driverBekleKapat();












    }
}
