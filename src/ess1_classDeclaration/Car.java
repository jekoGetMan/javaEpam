package ess1_classDeclaration;

import tst2.tst_opp;

public class Car {
    private String model;
    private int maxSpeed;
    private int year;
    private int speed;


    public Car() {

    }

    public Car(String model, int maxSpeed, int year, int speed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.speed = speed;
    }

    public String getModel(){
        return model;
    }


    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public static void main(String[] args){
        tst_opp someLink = new tst_opp();
        someLink.lol();
    }

}