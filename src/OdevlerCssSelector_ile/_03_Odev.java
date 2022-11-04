package OdevlerCssSelector_ile;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Odev extends BaseDriver {
    public static void main(String[] args) {
        //        1) Bu siteye gidin. -> https://www.snapdeal.com/
//
//        2) "teddy bear" aratın ve  Search butonuna tıklayın.   [name='keyword'][id='inputValEnter']  span[class='searchTextSpan']
//
//        3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
//        Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.





        driver.get("https://www.snapdeal.com/");

        MyFunc.Bekle(1);
        WebElement searchBar=driver.findElement(By.cssSelector("[name='keyword'][id='inputValEnter']"));
        searchBar.sendKeys("teddy bear");

        MyFunc.Bekle(1);
        WebElement searchButton= driver.findElement(By.cssSelector("span[class='searchTextSpan']"));
        searchButton.click();

        driverBekleKapat();



    }
}
