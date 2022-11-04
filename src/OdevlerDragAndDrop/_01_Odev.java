package OdevlerDragAndDrop;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _01_Odev extends BaseDriver {
    public static void main(String[] args) {



        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");

        WebElement washington=driver.findElement(By.id("node5"));
        WebElement united=driver.findElement(By.id("box4"));

        MyFunc.Bekle(3);
        Actions actions=new Actions(driver);
        actions.dragAndDrop(washington,united).build().perform();

        MyFunc.Bekle(3);
        driverBekleKapat();
    }
}
