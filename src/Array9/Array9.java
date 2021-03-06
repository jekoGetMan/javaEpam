package Array9;

public class Array9 {
    public static void main(String[] args) {
//        String name1 = "Alex";
//        String name2 = "Edward";
//        byte[] array = new byte[3]; // явно выдели память под три элемента.
//        // Если обратимся к 4-ому, тогда будет RunTimeError
//        short[] array1 = new short[3];
//        int[] array2 = new int[3];
//        double[] array3 = new double[4]; // При использовании ключевого слова New мы создаем объект.
        // В стеке хранятся простые типы данных, примитивные (8 штук), а также объекты(в Heapе, в куче).
        // В данном случае если наш массив является объектом, то он помещается в хип(в стек), в кучу, а обращаемся мы
        // через ссылку(array), которая находится грубо говоря в стеке, т.е. через array мы будем обращаться в кучу,
        // чтобы узнать значение массива.
        // Если наш массив является объектом(new), то обращаемся мы к нему через ссылку в Heap.
        // Т.е. в Heap находятся наши объекты(когда мы пишем new), а в стеке находятся простые типы данных (8) и ссылки на объекты.
        // Т.к. byte[] array = new byte[3] - объект, то со стека, в котором будет ссылка на наш объект, по ней ссылаемся в кучу.
        // Т.е. мы создали массив типа байт и выделили в памяти 3 элемента.
        // По умолчанию в примитивных типах данных значение в индексах массива по нулям.

//        int[] array = new int[5];
//
//        //array[0] = 1;
//        array[1] = 2;
//        array[2] = 3;
//        array[3] = 4;
//        array[4] = 5;
//
//        System.out.println(array[0]);
////        System.out.println(array[1]);
////        System.out.println(array[2]);
////        System.out.println(array[3]);
////        System.out.println(array[4]);

/*
        int[] array = new int[5]; // массив типа int с размерностью 5;

        // Заполняем массив
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }

//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

        // Специальная запись цикла for для прохождения элементов массива
        // Аналогичная конструкция foreach, используемой в других языках программирования (например c#, PHP)
        // for (int ключ, массив)
        for (int a : array) { //  array:  (0, 2, 4, 6, 8)
                System.out.println(a + " ");
        }

        */
        // int[] array = new int[5];
        // char[] array = new char[5]; // array: {, , , ,}
        // String[] array = new String[5]; // null, null ,null ,null, null // объект
        // Integer[] array = new Integer[5]; // null, null ,null ,null, null // объект
        // Т.е. объекты по-умолчанию содержат в себе значение null, а примитивные типы значение 0;
        int[] array = new int[] {1, 2, 3, 4, 5}; // блок инициализатор
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
