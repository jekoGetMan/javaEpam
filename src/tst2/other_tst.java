package tst2;

import ess1_shape.*;
import ess1_package2.*;
import ess1_package1.*;

public class other_tst {

    public static void main(String[] args){
        tst_opp link = new tst_opp();
        // Через ссылку мы можем обратится к полям и методам данного массива.
        link.getHeight();
        link.setHeight(200);
        link.view();

        //Первый класс
        Shape link1 = new Shape();
        link1.tst1();
        // Третий объект
        Main1 link2 = new Main1();
        link2.trol();
        //Четвертый объект
        Parent link3 = new Parent();
        link3.tst5();
        link3.setName1("bob");
        System.out.println(link3.getName1());

        ExampleInPackage2 link4 = new ExampleInPackage2();
        link4.tst6();
        link4.setName1("kobra");
        System.out.println(link4.getName1());
        ExampleInPackage1 link5 = new ExampleInPackage1();
        link5.tst7();

    }

    public static void tst8(){
        System.out.println("tst8");
    }
}
