package tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverIlkTest {
    @Test
    public void test01() {
        //amazona gidelim
        Driver.getDriver().get("https://amazon.com");

        // amazona gittiğimizi test edelim
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Amazon"));
        Driver.closeDriver();
    }

    @Test
    public void test02() {
        // bestbuy anasayfaya gidelim
        Driver.getDriver().get("https://bestbuy.com");

        // bestbuya gittiğimizi test edelim
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("bestbuy"));
        Driver.closeDriver();
    }
}
