package OdevlerXpath_ile;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev03 extends BaseDriver {
    public static void main(String[] args) {

        // 1) Bu siteye gidin. -> https://www.snapdeal.com/
//
//        2) "teddy bear" aratın ve  Search butonuna tıklayın. // //input[@id='inputValEnter']  // //span[@class='searchTextSpan']
//
//        3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
//        Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

        driver.get("https://www.snapdeal.com/");

        MyFunc.Bekle(2);
        WebElement searchBox=driver.findElement(By.xpath("//input[@id='inputValEnter']"));
        searchBox.sendKeys("teddy bear");
        MyFunc.Bekle(2);
        WebElement searcButton=driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
        searcButton.click();



        driverBekleKapat();


    }
}
