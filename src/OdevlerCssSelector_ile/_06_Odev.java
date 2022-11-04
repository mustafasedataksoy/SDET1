package OdevlerCssSelector_ile;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Base64;

public class _06_Odev extends BaseDriver {
    public static void main(String[] args) {
        //        Bu siteye gidiniz.  https://testpages.herokuapp.com/styled/index.html
//        Fake Alerts'e tıklayınız.  [id='fakealerttest']
//        Show modal dialog buttonuna tıklayınız.Ok'a tıklayınız.  input[value='Show modal dialog'][class='styled-click-button'] button[id='dialog-ok']
//        Alert kapanmalıdır.

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        MyFunc.Bekle(1);
        WebElement fakeAlerts=driver.findElement(By.cssSelector("[id='fakealerttest']"));
        fakeAlerts.click();

        MyFunc.Bekle(1);
        WebElement showmodalDialog=driver.findElement(By.cssSelector("input[value='Show modal dialog'][class='styled-click-button']"));
        showmodalDialog.click();

        MyFunc.Bekle(1);
        WebElement okButton=driver.findElement(By.cssSelector("button[id='dialog-ok']"));
        okButton.click();

        driverBekleKapat();






    }
}
