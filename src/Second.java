
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
                                                /*THEORY*/
        // Переприсвоить переменные.
        // Сортировка(пузырьок, выборка)
        // инкремент/декремент (последний инкремент не учитывается)
        // a = 4; a = a++ + a++ = 9; a =7; a = ++a + ++a; = 7;
        // Побитовые операции
        // Массивы. Методы.
        // for (i; i<10; i +=4) // итератор, коллекции. fori
        // compile error, runtime error;
        // byte b = 0; while (++b < 0); System.out.println(b); = 128;
        // while - цикл с предусловием.
        // do..while - цикл с постусловием.
        // switch(10) // проваливание, если нет break даже после default
        // buffet reader, scanner.
        // java.util // ctrl + b, поэтому java.util.Scanner;
        // NEW всегда означает объект. // in - поток вводит/ out - поток выводит. 3 потока: in (ввод), out (вывод в консоль), error
        // next - до первого пробела.
        // wrapper - класс оболочка. Простые типы и их родители.
        // parseInt;
        // в switch можно помещать строку.
        // System.nanoTime();
        // (метки: label), continue;
        // Процедуры/методы(треугольник - три раза)
        // классы и объекты
        // Java язык. Java memory modul.
        // Стек. тарелки (взять, положить, длина...)
        // LiFo // FiFo
        // На листочке напистать реализацию стека.
        // metadata
        // Версия java
        // Кеш, нативая memory (native memory)
        // Кеш, потоки. Нативная память, хип(в нем), мусор, стек.Young generation/old generation.
        // Сигнатура метода.
        // Понятие перегрузка(overload)
        // д/з по циклам с помощью методов.
        // exсpetion. try catch конструкция.


                                                /* PRACTICE */
        /*int i;

        i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        */
        //***********************************************************
        /*int a = 10; // Хотябы через байт

        do {
            System.out.println(a);
            a++;
        } while (a < 10);
        */
        //**************************************************************
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        //String str = sc.nextLine();
        /*
        switch(day) {
            case 1: {
                System.out.println("monday");
                break;
            }
            case 2: {
                System.out.println("tuesday");
                break;
            }
            case 3: {
                System.out.println("wednesday");
                break;
            }
            case 4: {
                System.out.println("thursday");
                break;
            }
            case 5: {
                System.out.println("friday");
                break;
            }
            default: {
                System.out.println("Weekend");
                break;
            }
        }
        */

        /*if (day >= 1 && day <= 5)
            System.out.println("Weekday");
        else
            System.out.println("Weekend");
        */

        //int tst = (day >= 1 && day <= 5) ? System.out.println("Weekday") : System.out.println("Weekend");


    }
}
