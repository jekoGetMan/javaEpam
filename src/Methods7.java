public class Methods7 {
    /*
    static byte additional (byte argument){
    argument = (byte) (argument + 1); // лучше писать argument++ или argument += 1; Тогда система сама неявно переводит к типу byte
    return argument;
}
// Все методы должны быть статическими, для того, чтобы мы могли обратиться из статического main к другим методам

    public static void main(String[] args) {
        byte a = 1; // addition(1) - тут система думает, что мы передаем int, поэтому будет ошибка.
        System.out.println(additional(a));
    }
    */
    /* Triangles */
    // Если мы хотим несколько раз вывести фигуру в цикле, то не обязательно каждый раз дублировать цикл, но можно просто создать
    // метод и вызывать этот метод из майн с соответствующими параметрами.
    static void rect(int a) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rect(5);
        rect (8);
        rect (9);
    }
}


