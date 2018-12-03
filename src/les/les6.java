package les;

public class les6 {
    public static void main(String[] args) {

        // упаковка java
        // integer valueOf()
        // String builder/buffet
        // Ouizful.net
        // sql-ex.ru
        // хэш-код. - целочисленное представление объекта
        // метод equals
        // java object 8
        // клонирование java
        // equals сравнивает ссылки
        // String pool
        // Объекты на которые нет ссылок - мусор
        // методы класса object
        // понятие колизия (два разных объекта одинаковое значение хэш-кода)
        // хэщ-код таблица // хэш мап
        // Multithreading
        //getClass getName
        //alt+insert
        //toString
        //ctrl+B - провалиться в метод
        // equals/hashcode - контракт
        // Maven - 1.5
        // Объекты нужно проверять на null ибо NullPointerException
        // Свойства эквивалетности
        // рефлексия
        //NPE null pointer exception
        //транзитивность
        //свойства эквивалентности(equals)
        // Соглашение по хэш коду.
        // Java professional 5 урок.
        //immutable class (String,wrapper)
        // Коллекции
        //instanceof - иерархия
        // Объект сравнивает ссылки
        // String pool в памяти
        //str1.intern();
        // В String pool помещается только если через литералл, если изменяем хотя бы раз, то создается новый объект
        // строки сравнивают значения
        // Pool wrapper (в рамках одного байта)
        // Целочисленные в рамках байта
        // String - immutable/объект
        // Sting builder/buffet
        //append
        // При изменении строки создается новый объект. При StringBuilder не создается новый объект
        // StringBuilder + append > concat и т.д.
        // String buffer > Stringbuilder( нет метода Intern)
        // trim
        //substring
        // Многопоточность
        // java essential 9-10 урок
        // proffessional renewed  5 урок (1-4) коллекции
        // Регулярные выражения javascript
        // java 2018 suumer Enternal training
        // 8 задач + тест
        // reverse строки без использования
        // java EE основы Junit(7 урок) itvdn
        // метод equals
        // mockito Ctrl+B (методы)
        // 5 правил для проверки equals (5 свойств) презентация
        // урок про объекты (последний)
        //

        System.out.println("hello");
        public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Car car = (Car) o;


        }

    }
}
