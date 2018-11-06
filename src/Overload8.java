import java.lang.management.OperatingSystemMXBean;

public class Overload8 {
/*
    static void function(){
        System.out.println("Hello!"); // Первая перегрузка
    }

    static void function(String s){  // Вторая перегрузка
        System.out.println(s);
    }

    static void function(int i){ // Третья перегрузка
        System.out.println(i);
    }

    static void function(double d){ // Четвертая перегрузка
        System.out.println(d);
    }

    static void function (String s, int i){ // Пятая перегрузка
        System.out.println(s + i);
    }

    static void function (int i, String s){ // Шестая перегрузка
        System.out.println(i + s);
    }

    static String function (String s, String b){ // Седьмая перегрузка
        return s;
    }

    public static void main(String[] args) {
        function();
        function("A");
        function(9);
        function(3.5);
        function("ЛОЛ", 5);
        function(1, "Рор");
        function("lol", "gol");
    }
}
*/

/*
    static int difference(int height, int weight) {
        return height - weight;
    }

    public static void main(String[] args) {
        int difference;
        difference = difference(6, 5);
        difference = difference(5, 6);

        System.out.println("Разность равна: " + difference);
    }
*/

 /*   static void operation(){
        operation("val", 10, 12.2);
    }

    static void operation(String value1){
        operation(value1, 10, 12.2);
    }

    static void operation(String value1, int value2){
        operation(value1, value2, 12.2);
    }

    static void operation(String value1, int value2, double value3){
        System.out.println(value1 + ", " + value2 + ", " + value3);
    }

    public static void main(String[] args) {
        operation();
        operation("val");
        operation("lol", 9);
        operation("coul", 1, 5.2);
    }
 */
 // Еще пример из перегрузки. обе функции идентичны кроме параметров.
 /*
 public static void main(String[] args) {
     if (args.length > 0) // Если через консоль были введены аргументы
         System.out.println(args[0]);
     else { // Иначе -
         main(); // использовать обычный метод с названием main(),а не свой, который принимает массив string
     }
 }
    public static void main() {
        System.out.println("Its usual thing");
    }
*/

/* static void first(){
     System.out.println("1");
     second();
     System.out.println("3");
 }

 static void second(){
     System.out.println("2");
 }

 public static void main(String[] args) {
    first();
 }
*/
    public static void main(String[] args)
    {
        recursion(2);
    }

     public static void recursion(int counter) {
    // counter = 2
    counter--; // декремент будет только после повторного обращения
         System.out.println("A" + counter);

         if (counter != 0) // 1 != 0
             recursion(counter);
         System.out.println("B" + counter);
     }
}

