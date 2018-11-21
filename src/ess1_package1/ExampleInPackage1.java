package ess1_package1;

public class ExampleInPackage1 {
    // Создадим 4 поля т.к. у нас 4 модификатора доступа
    private String name1 = "private"; // В рамках класса
    String name2 = "package"; // В рамках одного пакета, по-умолчанию
    protected String name3 = "protected"; // В рамках пакета, а также в классах наследниках
    public String name4 = "public";

    public static void tst7(){
        System.out.println("tst7");
    }
}
