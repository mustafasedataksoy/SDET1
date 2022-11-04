package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {


    public static WebDriver driver;

     static
    {
        // İLK ADIMDA ÇALIŞAN  KOD KISIM

        KalanOncekileriKapat();

        Logger logger= Logger.getLogger(""); // sisteme ait bütün logları üreten objeye/servise ulaştım ""
        logger.setLevel(Level.SEVERE); // Sadece errorları göster

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");// ChromeServisi seesiz modda çalıştır.
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
         driver = new ChromeDriver(); // WEB SAYFASINI KONTROL EDEN GÖREVLİ
        // driver.manage().window().setPosition(new point (1650,130));

        //driver.manage().window().maximize(); // EKRANI MAX YAPIYOR.
        driver.manage().deleteAllCookies(); // SİTENİN SENİN BİLGİSAYARINDA YAPTIĞI AYARLAR SİLİNİYOR.BAZEN HER ADIMDA YAPMAK GEREKEBİLİR.
        // SAYFAYI TEMİZLİYOR BAŞLANGIÇ AYARLARINA DÖNÜYOR.


        Duration dr=Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr); // Sadece tüm sayfanın kodlarının bilgisayarınıza inmesi süresiyle ilgili
        //bu eklenmezse Selenium sayfa yüklenene kadar (sonsuza) bekler.: 30 sn süresince sayfanın yüklenmesini bekle yüklenmezse hata ver
        // eğer 2 sn yüklerse 30 sn. beklemez.

         driver.manage().timeouts().implicitlyWait(dr); // Bütün weblementlerin element bazında, elemente özel işlem yapılmadan önce
        // hazır hale gelmesi verilen mühlet yani süre.

        // JAVA HIZLI ÇALIŞIYOR. SELENIUM İLE SENKRONİZE OLMASI İÇİN BUNLARI YAPIYORUZ.

    }

    public static void KalanOncekileriKapat() {

        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {

        }
    }


    public static void driverBekleKapat()
    {

        MyFunc.Bekle(3);
        driver.quit();
    }



}
