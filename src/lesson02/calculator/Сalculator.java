package lesson02.calculator;

public class Сalculator {
    public static void sum(int a, int b)
    {
        System.out.println(a + b); // процедура ( не возращает)
    }

    public static int sub(int a, int b) // public / static можно не использовать. Без статик нужно создавать объект.
    {
        return a - b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        sum(a, b);

        int sub = sub(a, b);
        System.out.println(sub);
    }
}

