package ess1_package2;

import tst2.other_tst;

public class ExampleInPackage2 {
    private String name1 = "private";
            String name2 = "package";
    protected String name3 = "protected";
    public String name4 = "public";

    public static void tst6(){
        System.out.println("tst6");
    }

    public String getName1(){
        return name1;
    }

    public void setName1(String name1){
        this.name1 = name1;
    }

    public static void main(String[] args){
        other_tst tstim = new other_tst();
        tstim.tst8();
    }

}
