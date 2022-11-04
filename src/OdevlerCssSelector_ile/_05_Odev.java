package OdevlerCssSelector_ile;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_Odev extends BaseDriver {
    public static void main(String[] args) {
 //       Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
//        Fake Alerts' tıklayınız.  a[id='fakealerttest']
//        Show Alert Box'a tıklayınız.  input[id='fakealert'][type='button']
//        Ok'a tıklayınız.  button[id='dialog-ok']
//        Alert kapanmalıdır.

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        MyFunc.Bekle(1);
        WebElement fakeAlerts=driver.findElement(By.cssSelector("a[id='fakealerttest']"));
        fakeAlerts.click();

        MyFunc.Bekle(1);
        WebElement showAlert=driver.findElement(By.cssSelector("input[id='fakealert'][type='button']"));
        showAlert.click();

        MyFunc.Bekle(1);
        WebElement okButton=driver.findElement(By.cssSelector("button[id='dialog-ok']"));
        okButton.click();

        driverBekleKapat();





    }
}
