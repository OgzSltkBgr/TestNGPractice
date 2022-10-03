package tests.day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.Set;

public class C01_WindowHandleReusableMethods {
    @Test
    public void test01() {
        // https://demoqa.com/browser-windows  adresine gidelim
        Driver.getDriver().get("https://demoqa.com/browser-windows ");

        // new tab butonuna basalim
        String ilkSayfaWindowHAndle=Driver.getDriver().getWindowHandle();
        Driver.getDriver().findElement(By.cssSelector("#tabButton")).click();

        Set<String>handleSeti=Driver.getDriver().getWindowHandles();

        String ikinciSayfaHandle="";

        for (String each :handleSeti
             ) {
            if (!each.equals(ilkSayfaWindowHAndle)){
                ikinciSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaHandle);


        // new tab'a gecip tittle'inin new tab oldugunu test edin
        String expectedTitle="new Tab";
        String actualTitle = Driver.getDriver().getTitle();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle,expectedTitle,"geçmedi");
        softAssert.assertAll();

        Driver.closeDriver();
    }

    @Test
    public void test02() {
        // https://the-internet.herokuapp.com/windows  adresine gidelim
        // new tab butonuna basalim
        // new tab'a gecip tittle'inin new tab oldugunu test edin
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        String ilkSayfaWindowHandle=Driver.getDriver().getWindowHandle();
        Driver.getDriver().findElement(By.xpath("(//a[@target='_blank'])[1]")).click();
        Set<String> handleSeti=Driver.getDriver().getWindowHandles();
        String ikinciSayfaHandle="";
        for (String each:handleSeti) {
            if (!each.equals(ilkSayfaWindowHandle)){
                ikinciSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaHandle);
        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();
        System.out.println("actualTitle=> "+actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
        Driver.closeDriver();
    }

    @Test
    public void windowHandleReusable() throws IOException {
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        Driver.getDriver().findElement(By.xpath("(//a[@target='_blank'])[1]")).click();
        ReusableMethods.switchToWindow("New Window");

        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);
        ReusableMethods.getScreenshot("WindowSwitch");
        Driver.closeDriver();
    }
}
