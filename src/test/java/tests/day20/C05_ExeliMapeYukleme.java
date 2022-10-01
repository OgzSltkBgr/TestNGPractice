package tests.day20;

import org.testng.annotations.Test;
import utilities.ReusableMethods;

public class C05_ExeliMapeYukleme {
    @Test
    public void test01() {
        // dosya yolu ve sayfa ismi verilen bir excel sheet'i map olarak kaydeden
    // reusable method olusturalim
        String path="src/test/java/resources/ulkeler.xlsx";
        String sayfaAdi="Sayfa1";

        System.out.println(ReusableMethods.mapOlustur(path, sayfaAdi));

    }
}
