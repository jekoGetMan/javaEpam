package ess1_package2;

public class Parent {
    private String name1 = "private";
            String name2 = "package";
   protected String name3 = "protected";
   public String name4 = "public";

   public static void tst5(){
       System.out.println("tst5");
   }

   public String getName1(){
       return name1;
   }

   public void setName1(String name1){
       this.name1 = name1;
   }

}
