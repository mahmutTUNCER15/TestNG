package tests.day14_testFrameWork;

import org.testng.annotations.Test;

public class c01_TestİlkNG {
    @Test(priority = 6)
    public void ilktest(){
        System.out.println("ilk test calıştı");
    }
    @Test(priority = 9)
    public void ikincitest(){
        System.out.println("ikinci test çalıştı");

    }
    @Test(priority = 44 )
    public void ucuncutest(){
        System.out.println("ücüncü test calıstı");

    }
}
