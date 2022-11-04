package OdevlerXpath_ile;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev06 extends BaseDriver {
    public static void main(String[] args) {

  //       Bu siteye gidiniz.  https://testpages.herokuapp.com/styled/index.html
//        Fake Alerts'e tıklayınız.
//        Show modal dialog buttonuna tıklayınız.Ok'a tıklayınız. // //input[@id='fakealert']  //button[@id='dialog-ok']
//        Alert kapanmalıdır.




        driver.get("https://testpages.herokuapp.com/styled/index.html");


        MyFunc.Bekle(2);
        WebElement fakeAlerts=driver.findElement(By.xpath("//a[@id='fakealerttest']"));
        fakeAlerts.click();

        MyFunc.Bekle(2);
        WebElement showModalDialog=driver.findElement(By.xpath("//input[@id='fakealert'] "));
        showModalDialog.click();


        MyFunc.Bekle(2);
        WebElement okTikla=driver.findElement(By.xpath("//button[@id='dialog-ok'] "));
        okTikla.click();





        driverBekleKapat();

    }
}
