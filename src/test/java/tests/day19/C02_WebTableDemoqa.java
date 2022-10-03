package tests.day19;

import org.testng.annotations.Test;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_WebTableDemoqa {
    @Test(groups = {"smoke","regression"})
    public void test01() {
        //Bir Class olusturun D19_WebtablesHomework
        //1. "https://demoqa.com/webtables" sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("DemoqaUrl"));

        DemoqaPage demoqaPage=new DemoqaPage();

        //2. Headers da bulunan department isimlerini yazdirin
        // //theade//th olurdu anacak bu tablo class isimleri ile organize edilmiş
        System.out.println("Baslik satiri elementi : "+demoqaPage.baslikSatiriElementi.getText());

        // ikinci yontem olarak basliklari bir listeye koyabilirim
        // basliklarWebElementiListesi

        //3. 3. sutunun basligini yazdirin
        System.out.println("3.Sutunun basligi : "+demoqaPage.basliklarWebElementiListesi.get(2).getText());

        //4. Tablodaki tum datalari yazdirin
        System.out.println("=========Tum body==========");
        System.out.println("Tablodaki datalar : " + demoqaPage.bodyTekWebElement.getText());

        //5. Tabloda kac cell (data) oldugunu yazdirin
        System.out.println("Tablodaki data sayisi : "+demoqaPage.tumDataWebElementList.size());

        //6. Tablodaki satir sayisini yazdirin
        System.out.println("Tablodaki satir sayisi : "+demoqaPage.tumSatirlarWebElementList.size());

        //7. Tablodaki sutun sayisini yazdirin
        // farklı yoollardan hesaplanabilir ama hucre sayisi / satir sayisi yapıcam
        System.out.println("Tablodaki stun sayisi : "+
                (demoqaPage.tumDataWebElementList.size()/demoqaPage.tumSatirlarWebElementList.size()));

        //8. Tablodaki 3.kolonu yazdirin
        demoqaPage.sutunYazdir(2);

        //9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        demoqaPage.ismeGoreMaasYazdir("Kierra");

        //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini
        //girdigimde bana datayi yazdirsin

        demoqaPage.hucreYazdir(3,1);

        Driver.closeDriver();
    }
}
