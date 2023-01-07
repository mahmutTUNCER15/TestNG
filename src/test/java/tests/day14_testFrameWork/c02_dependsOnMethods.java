package tests.day14_testFrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class c02_dependsOnMethods {

    @Test
    public void ilktest(){
        System.out.println("ilk test calıştı");
    }
    @Test(dependsOnMethods = "ilk test")
    public void ikincitest(){
        System.out.println("ikinci test çalıştı");


    }
    @Test(dependsOnMethods = "ikinci test")
    public void ucuncutest(){
        System.out.println("ücüncü test calıstı");

    }

}
