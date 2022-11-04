package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.sound.midi.MidiFileFormat;
import javax.xml.ws.WebEndpoint;
import java.util.List;
import java.util.Set;

public class _04_WindowGiris extends BaseDriver {

    @Test

    public void Test1()
    {
        // a[target='_blank'] ayrı sayfa açmak için kullanılıyor.
        driver.get("https://www.selenium.dev/");

        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement link: linkler)
            if (!link.getAttribute("href").contains("mailto")) // email i açmasın dedik burda.mailto (!) geçmiyenleri ac demek
                  link.click();

         // driver.getWindowHandle(); -> AKTİF OLAN TAB IN (WİNDOW) UN ID SİNİ VERİR.
         Set<String> windowIdler=driver.getWindowHandles();// AÇIK OLAN TÜM SAYFALARIN WİN ID LERİ VERİYOR.
         for (String id: windowIdler)
             System.out.println("id = " + id);

        MyFunc.Bekle(5);
        driverBekleKapat();




    }
}
