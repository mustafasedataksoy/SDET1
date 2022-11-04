package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Odev extends BaseDriver {
    public static void main(String[] args) {

         // lOCATOR BULMA

        driver.get("https://formsmarts.com/form/yu?mode=h5");


        MyFunc.Bekle(2);
        WebElement business=driver.findElement(By.cssSelector("[type='radio'][value='Business']"));
        business.click();


        MyFunc.Bekle(2);
        WebElement dropDownDiscover=driver.findElement(By.cssSelector("select[id$='_4588']"));
        dropDownDiscover.click();


        MyFunc.Bekle(2);
        WebElement optionOnlineAdvertising=driver.findElement(By.cssSelector("option[value='Online Advertising']"));
        optionOnlineAdvertising.click();

        MyFunc.Bekle(2);
        WebElement buttonEverday=driver.findElement(By.cssSelector("[type='radio'][value='Every Day']"));
        buttonEverday.click();


        MyFunc.Bekle(2);
        WebElement goodRadio=driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        goodRadio.click();

        MyFunc.Bekle(2);
        WebElement howlongDropdown=driver.findElement(By.cssSelector("select[id$='4597']"));
        howlongDropdown.click();

        MyFunc.Bekle(2);
        WebElement secenek4=driver.findElement(By.cssSelector("select[id$='_4597'] > :nth-child(4)"));
        secenek4.click();




        driverBekleKapat();
    }
}
