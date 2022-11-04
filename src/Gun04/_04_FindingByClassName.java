package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _04_FindingByClassName {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // WEB SAYFASINI KONTROL EDEN GÖREVLİ
        driver.get("https://form.jotform.com/221934510376353"); // WEB SAYFASINI AÇ


        WebElement submitButton = driver.findElement(By.className("form-submit-button"));
        System.out.println("submitButton.getText() = " + submitButton.getText());
        submitButton.click();

        // Chrome ctrl+f ye basıldığında inspect bölümünde
        // first_name yazarsak bütün kelimelerde arar
        // #first_name yazarsak bütün ID paramtrelerinde arar
        // .first_name yazarsak bütün CLASS paramatrelerinde arar


        // birden fazla aynı locator a sahip eleman bulursa findElement ne yapar?
        // cevap : ilk elementi  bulur.

        WebElement element = driver.findElement(By.className("form-sub-label"));
        System.out.println("element.getText() = " + element.getText());

        // Bu locator  a ait elemanların hepsini nasıl alırım ?

        List <WebElement> labeller = driver.findElements(By.className("form-sub-label"));
        System.out.println("labeller.size() = " + labeller.size());
        for (WebElement e: labeller)
        {
            System.out.println("e.getText() = " + e.getText());
        }


        // aranılan eleman bulunamazsa : findelement no such element hatası verir.
        // findelements ise size ı 0 olan list verir .yani hata vermez




        MyFunc.Bekle(10);
        driver.quit(); // TÜM SAYFALARI TAMAMEN KAPATIYOR.
    }



}
