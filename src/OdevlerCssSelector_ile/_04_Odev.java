package OdevlerCssSelector_ile;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_Odev extends BaseDriver {
    public static void main(String[] args) {

       // Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]

//        Calculate'e tıklayınız.  [id='calculatetest']

//        İlk input'a herhangi bir sayı giriniz. input[type='text'][name='number1']

//        İkinci input'a herhangi bir sayı giriniz.   input[type='text'][name='number2']

//        Calculate button'una tıklayınız. [class='styled-click-button']

//        Sonucu alınız.
//        Sonucu yazdırınız.


        driver.get("https://testpages.herokuapp.com/styled/index.html");

        MyFunc.Bekle(1);
        WebElement calculator=driver.findElement(By.cssSelector("[id='calculatetest']"));
        calculator.click();

        MyFunc.Bekle(1);
        WebElement firstInput=driver.findElement(By.cssSelector("input[type='text'][name='number1']"));
        firstInput.sendKeys("23");

        MyFunc.Bekle(1);
        WebElement secondInput=driver.findElement(By.cssSelector(" input[type='text'][name='number2']"));
        secondInput.sendKeys("33");

        MyFunc.Bekle(1);
        WebElement calculate=driver.findElement(By.cssSelector("input[type='submit'][id='calculate']"));
        calculate.click();


        MyFunc.Bekle(1);
        WebElement answer=driver.findElement(By.cssSelector("[id='answer']"));
        System.out.println("answer = " + answer.getText());

        driverBekleKapat();






    }
}
