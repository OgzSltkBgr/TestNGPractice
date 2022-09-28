package tests.day16;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageIlkClass {
    @Test
    public void test01() {
        // Amaozna gidelim
        Driver.getDriver().get("https://amazon.com");

        // arama kutusuna nutella yazıp aratalım
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella", Keys.ENTER);

        // Atama sonuclarının NUtella icerdiğini test edelim
        String actualSonucStr=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(actualSonucStr.contains("Nutella"));

        Driver.closeDriver();
    }

    @Test
    public void test02() {
        //amazona gidelim
        Driver.getDriver().get("https://amazon.com");

        //java için arama yapalım
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("java",Keys.ENTER);

        //sonucun java içerdiğini test edelim
        String sonucYazisiElementi=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(sonucYazisiElementi.contains("java"));
        Driver.closeDriver();
    }
}
