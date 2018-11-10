package ess1_shape;

public class Shape {
    private int length; // через геттеры
    private long height; // через сеттеры
    public double square;
    public float a;
    public double c;
    public boolean b;
    public int i;

public Shape(){ // Конструктор предназначен, чтобы потом, в перспективе мы могли создать объект класса = экземпляр класса
}

    // ГЕТТЕРЫ назначают значения, а сеттеры присваивают
    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public long getHeight()
    {
        return height;
    }

    public void setHeight(long height)
    {
        this.height = height;
    }

    public void viewShape() {
    System.out.println("Height" + height);
    System.out.println("length" + length);
}
}