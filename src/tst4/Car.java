package tst4;

public class Car {

    private String model;
    private static int maxSpeed;
    private int year;
    private int speed;

    public Car(String model, int maxSpeed, int year, int speed){
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.speed = speed;
    }

    public int getMaxSpeed(){
        return  maxSpeed;
    }

    public String getModel() {
        return model;
    }
}
