package ess1_shape;

public class Main1 {
    public static void main(String[] args) {
        Shape shape = new Shape(); // Через Shape() мы обращаемся к конструктору Shape(), который мы объявили в Shape

        System.out.println(shape.a);
        System.out.println(shape.b);
        System.out.println(shape.c);
        System.out.println(shape.i);
        System.out.println(shape);

        shape.square = 24.0; // доступ к public полю. Т.е. мы через ссылку shape обратились к полю public double square и присвоили ему значение
        System.out.println(shape.square);

        shape.setHeight(200);
        shape.getHeight();

        shape.viewShape();

    }

    public static void trol(){
        System.out.println("lol");
    }
}
