package ess1_package1;

//import ess1_package2.ExampleInPackage2; // Имя_пакета.имя_класса
//import ess1_package2.Parent;
// ИЛИ
import ess1_package2.*;

public class Main extends Parent{
    public static void main(String[] args) { // точка входа в систему
        ExampleInPackage1 e1 = new ExampleInPackage1(); // Создали объект класса ExampleInPackage1 и конструктор. Имя класса у нас ExampleInPackage1
        // Выведем содержимое e1
        //System.out.printf(e1.name1); // private. name1 красный из-за инкапсуляции
        System.out.println(e1.name2); // package
        System.out.println(e1.name3); // protected
        System.out.println(e1.name4); // public

        ExampleInPackage2 e2 = new ExampleInPackage2(); // красный, потому он в другом пакете, нужен import

        //System.out.println(e2.name1); // private
        //System.out.println(e2.name2); // package
        //System.out.println(e2.name3); // protected
        System.out.println(e2.name4); // public

        Main p = new Main();

//        System.out.println(p.name1); // private
//        System.out.println(p.name2); // package
        System.out.println(p.name3); // protected
        System.out.println(p.name4); // public
    }
}
