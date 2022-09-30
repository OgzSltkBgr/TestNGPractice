package tests.day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_WebTableDinamikLocate {
    // 3 Test methodu oluşturalım
    HMCWebTablePage hmcWebTablePage;
    HotelMyCampPage hotelMyCampPage;
    @Test
    public void satirYazdirTesti() {
        //1. method satir numarası verdiğimde bana o satırdaki dataları yazdırsın

        //2. Satiri yazdir //tbody//tr[2]
        //7.satiri yazdir //tbody//tr[7]

        hmcWebTablePage=new HMCWebTablePage();
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();

        WebElement ucuncuSatirElementi=hmcWebTablePage.satirGetir(3);

        System.out.println(ucuncuSatirElementi.getText());

        Driver.closeDriver();
    }

    @Test
    public void hucreGetirTesti() {
        // 2. method satır no ve data numarası girdiğimde verdiğim datayı yazdırsın
        hmcWebTablePage=new HMCWebTablePage();
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();

        //2.satirin 4. datasi       //tbody//tr[2]//td[4]
        // 4. satırın 5. datası     //tbody//tr[4]//td[5]

        System.out.println( hmcWebTablePage.hucreWebelementGetir(4,5));

        Driver.closeDriver();
    }

    @Test
    public void sutunYazdirTesti() {
        //3.method sütun numarası verdiğimde bana tum sütunu yazdırsın.
        hmcWebTablePage=new HMCWebTablePage();
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();

        hmcWebTablePage.sutunYazdir(4);

        Driver.closeDriver();
    }
}
