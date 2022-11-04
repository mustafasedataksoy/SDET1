package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingById {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // WEB SAYFASINI KONTROL EDEN GÖREVLİ
        driver.get("https://form.jotform.com/221934510376353"); // WEB SAYFASINI AÇ

        WebElement name  =driver.findElement(By.id("first_8"));
        name.sendKeys("Sedat");

        WebElement lastname=driver.findElement(By.id("last_8"));
        lastname.sendKeys("Aksoy");
        
        WebElement lastname1=driver.findElement(By.id("sublabel_8_last"));
        System.out.println("lastname1.getText() = " + lastname1.getText());


        WebElement sublabel=driver.findElement(By.id("sublabel_8_first"));
        System.out.println("sublabel = " + sublabel.getText());


        MyFunc.Bekle(5);
        driver.quit();

    }
}
