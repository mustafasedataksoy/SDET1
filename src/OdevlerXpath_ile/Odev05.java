package OdevlerXpath_ile;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev05  extends BaseDriver {
    public static void main(String[] args) {


//        Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
//        Fake Alerts' tıklayınız.  // //a[@id='fakealerttest']
//        Show Alert Box'a tıklayınız.   // //input[@id='fakealert']
//        Ok'a tıklayınız.    // //button[@id='dialog-ok']
//        Alert kapanmalıdır.

        driver.get("https://testpages.herokuapp.com/styled/index.html");


        MyFunc.Bekle(2);
        WebElement fakeAlerts=driver.findElement(By.xpath("//a[@id='fakealerttest']"));
        fakeAlerts.click();

        MyFunc.Bekle(2);
        WebElement showAlertBox=driver.findElement(By.xpath("//input[@id='fakealert']"));
        showAlertBox.click();

        MyFunc.Bekle(2);
        WebElement okTikla=driver.findElement(By.xpath("//button[@id='dialog-ok']"));
        okTikla.click();

        driverBekleKapat();





    }
}
