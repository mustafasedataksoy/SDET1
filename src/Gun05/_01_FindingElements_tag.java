package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_FindingElements_tag extends BaseDriver {



    public static void main(String[] args) {

        // driverBaslat();



        driver.get("https://www.hepsiburada.com/");


        List<WebElement>linkler = driver.findElements(By.tagName("a")); // tag ine göre bulma
        // bu bana sayfadaki tüm linkleri verir.
        // FİNDELEMENT İLKİNİ VERİR.  FİNDELEMENT'S HEPSİNİ BULUR

        for (WebElement e:linkler){
            if (e.getText().equals("")) { // KIRIK LİNK YANİ EKRANDA GÖZÜKEN KISIM YOK

                System.out.println("link .getAttribute(href)" + e.getAttribute("href"));
                System.out.println("link.getAttribute(title) =" + e.getAttribute("title"));
                System.out.println("link.getAttribute(rel) =" + e.getAttribute("rel"));
            }
        }


       driverBekleKapat();

    }
}
