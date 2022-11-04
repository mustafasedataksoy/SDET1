package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
   1-driver.get("http://chercher.tech/practice/frames); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */
public class _03_IframeSoru extends BaseDriver {



    @Test

    public void Test1()
    {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0); // "frame1"  id ve name ve webelement geçişi çok yavaş
        WebElement input=driver.findElement(By.cssSelector("#topic+input"));
        input.sendKeys("Türkiye");



        driver.switchTo().frame(0); // frame1 içindeki ilk frame geçiş yaptık  :Frame3
        WebElement chkBox=driver.findElement(By.id("a")); // xpath ile //input[@id='a']
        chkBox.click();


        driver.switchTo().parentFrame(); // frame 1 e geçiş
        driver.switchTo().parentFrame(); // ilk sayfaya geçiş


        driver.switchTo().defaultContent(); // yukarıdaki 2 satırın  yerine  direk ilk sayfaya geçiş yaptık.

        driver.switchTo().frame(1); // selectin olduğu frame(frame2),ilk sayfadaki 2. yani index olarak 1 olan frame


        WebElement menu =driver.findElement(By.id("animals"));
        Select ddMenu=new Select(menu);
        ddMenu.selectByIndex(3); // 4 nolu eleman seçildi : son eleman:ddMenu.getOptions().size()-1

        driverBekleKapat();



    }
}
