package tests.day18;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;

import java.util.List;

public class C02_WebTables {
    HotelMyCampPage hotelMyCampPage;
    HMCWebTablePage hmcWebTablePage;
    @Test
    public void login() {
        //● Bir class oluşturun : C02_WebTables
        //● login( ) metodun oluşturun ve oturum açın.
        //● https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
        //○ Username : manager
        //○ Password : Manager1!
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();

    }

    @Test
    public void table() {
        //● table( ) metodu oluşturun
        //○ Tüm table body'sinin boyutunu(sutun sayisi) bulun. /tbody
        // header kısmında birinci satır ve aşltındaki dataları locate edelim

        hmcWebTablePage=new HMCWebTablePage();
        List<WebElement> headerDatalist=hmcWebTablePage.headerBirinciSatirDatalar;
        System.out.println("tablodaki sütun sayısı ="+headerDatalist.size());

        //○ Table'daki tum body'I ve başlıkları(headers) konsolda yazdırın.

        System.out.println(hmcWebTablePage.tumBodyWebElementi.getText());

        // eger body'i tek bir webelement olarak locate edersek
        // icindeki tum datalari gettext() ile yazdirabiliriz
        // ancak bu durumda bu elementler ayri ayri degil body'nin icindeki tek bir String'in parcalari olurlar
        // dolayisiyla bu elementlere tek tek ulasmamiz mumkun olmaz
        // sadece contains methodu ile body'de olup olmadiklarini test ederiz
        // eger her datayi ayri ayri almak istersek
        //    //tbody//td   sekline locate edip bir list'e atabiliriz.

        List<WebElement> bodyTumDataList=hmcWebTablePage.tumBodyDatalariList;

        System.out.println("bodyTumDataList : "+bodyTumDataList.size());
    }

    @Test(dependsOnMethods = "login")
    public void printRows() {
        //● printRows( ) metodu oluşturun //tr
        //○ table body'sinde bulunan toplam satir(row) sayısını bulun.
        hmcWebTablePage=new HMCWebTablePage();
        System.out.println(hmcWebTablePage.satirlarListesi.size());

        //○ Table body'sinde bulunan satirlari(rows) konsolda yazdırın.
        List<WebElement> satirlarWebElementListesi=hmcWebTablePage.satirlarListesi;
        for (WebElement each:satirlarWebElementListesi) {
            System.out.println(each.getText());
        }

        //○ 4.satirdaki(row) elementleri konsolda yazdırın
        System.out.println("4.satir : "+satirlarWebElementListesi.get(3).getText());
    }
}
