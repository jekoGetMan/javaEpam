package animal;

public class Main {
    public static void main(String[] args) {

        Animal a = new Animal();
        System.out.println("Name of animal: " + a.getName() + ", speed of animal: " + a.getSpeed() + " km per hour, age of animal: " + a.getAge() + " year");

        //sets
        a.setSpeed(9);
        a.setAge(1);
        a.setName("HARVEY");


        System.out.println("Name of animal: " + a.getName() + ", speed of animal: " + a.getSpeed() + " km per hour, age of animal: " + a.getAge() + " year");

    }

}
