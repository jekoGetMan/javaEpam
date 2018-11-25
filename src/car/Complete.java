package car;
/*
 Створити клас
Машина, який матиме деякі свої поля та об’єкти класу Кермо, Кузов,Колесо - як поля класу.
Додати методи, які би змінювали стан полів класу , для виконання певних функцій, описати
даний клас(getters, setters, toString). Всі поля повинні бути параметрами в конструкторі.
 */
public class Complete {
    rudder rud = new rudder(2, 4, 8);
    wheel whl = new wheel(2, 4, 8);
    carCase cas = new carCase(300, 400, 34);

    public void action(){
        whl.action();
        rud.action();
        cas.action();
    }

    public void display (){
        System.out.println("\n" + whl.toString() + "\t" + rud.toString() + "\t" + cas.toString());
    }
}

