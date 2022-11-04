package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
   Senaryo :
   https://chercher.tech/practice/frames sitesine gidiniz
   Ekranda gözüken ilk kutucuğa Türkiye yazınız.
   Daha sonra select in seçeneklerinden animals ı seçiniz.
 */
public class _02_IframelerGecis extends BaseDriver {

       @Test

    public void Test1()
       {
           driver.get("https://chercher.tech/practice/frames ");

           driver.switchTo().frame(0);
           WebElement input=driver.findElement(By.cssSelector("#topic+input"));
           input.sendKeys("Türkiye");

           //driver.switchTo().parentFrame(); 1 kademe içeride olduğumdan yine default page ye ulaşıyor.
           driver.switchTo().defaultContent();// default page yani asıl giriş sayfasına ulaştım ,aynı şekilde
           driver.switchTo().frame(1); // ana sayfadaki 2 . frame (index olarak 1) ulaşıldı.Burası selectin olduğu yer


           WebElement menu =driver.findElement(By.id("animals"));
           Select ddMenu=new Select(menu);
           ddMenu.selectByVisibleText("Avatar");





           driverBekleKapat();


       }

}
