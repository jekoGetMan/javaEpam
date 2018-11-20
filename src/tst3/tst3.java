package tst3;

import tst2.*;

public class tst3 extends tst_opp {
    public static void main(String[] args) {
        tst_opp kol = new tst_opp();
        kol.setHeight(1000);
        int test = kol.getHeight();
        System.out.println(kol.square);
        System.out.println(kol.getHeight());
        lol();
    }
}
