package tests.day17;

import org.testng.annotations.Test;
import utilities.Driver;

public class C04_SingletonPattern {
    @Test
    public void test01(){
        // Singleton pattern:  bir class'dan birden fazla obje uretilmesine
        // izin vermeyen bir pattern olarak kabul gormustur

        // Biz Driver class'ini driver uretmek uzere kullaniyoruz
        // Ancak driver class'inda driver isminde bir instance variable da var
        // ve biz obje ureterek bu instance driver'a ulasabiliriz

        // Driver driver1=new Driver();

        // Driver driver2=new Driver();

        // Driver driver3=new Driver();

        // SingletonPattern kabul gormus bir pattern'dir
        // Amac bir class'dan obje uretilmemesini saglamaktir
        // Bunun icin singleton pattern'de koruyacagimiz class'da
        // Parametresiz bir constructor olusturur ve bu constructor'u private yapariz.

    }
}