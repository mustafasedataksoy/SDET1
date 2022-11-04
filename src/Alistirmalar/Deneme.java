package Alistirmalar;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Deneme extends BaseDriver {
    public static void main(String[] args) {



        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        List<WebElement>baskentler=driver.findElements(By.id("dropContent"));
        for (WebElement e:baskentler ){

            System.out.println(e.getText());
        }

        System.out.println();
       List<WebElement> ulkeler=driver.findElements(By.id("countries"));
        for (WebElement e:ulkeler){
            System.out.println(e.getText());
        }






        driverBekleKapat();



    }
}
