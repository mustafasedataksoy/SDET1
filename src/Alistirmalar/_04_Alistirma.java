package Alistirmalar;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_Alistirma extends BaseDriver {
    public static void main(String[] args) {

  //      Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]

//        Fake Alerts' tıklayınız.   //a[@id='alerttest']

//        Show Alert Box'a tıklayınız.  //input[@id='fakealert']

//        Ok'a tıklayınız. //button[@id='dialog-ok']

//        Alert kapanmalıdır.



        driver.get("https://testpages.herokuapp.com/styled/index.html");


        MyFunc.Bekle(1);
        WebElement fakeAlerts=driver.findElement(By.xpath("//a[@id='fakealerttest']"));
        fakeAlerts.click();


        MyFunc.Bekle(1);
        WebElement showAlert=driver.findElement(By.xpath("//input[@id='fakealert']"));
        showAlert.click();

        MyFunc.Bekle(1);
        WebElement okButton=driver.findElement(By.xpath("//button[@id='dialog-ok']"));
        okButton.click();


        driverBekleKapat();
    }
}
