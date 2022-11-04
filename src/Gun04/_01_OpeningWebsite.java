package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // WEB SAYFASINI KONTROL EDEN GÖREVLİ
        driver.get("https://www.techno.study/"); // WEB SAYFASINI AÇ


        MyFunc.Bekle(5);
         driver.quit(); // TÜM SAYFALARI TAMAMEN KAPATIYOR.
    }
}
