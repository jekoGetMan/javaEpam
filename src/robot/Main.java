package robot;

public class Main {

    public static void main(String[] args) {

        //Objects
        Robot robo = new Robot();
        CoffeeRobot coffeeRobo = new CoffeeRobot();
        DanceRobot danceRobo = new DanceRobot();
        CookRobot cookRobo = new CookRobot();

        System.out.println("methods:");
        robo.work();
        coffeeRobo.work();
        danceRobo.work();
        cookRobo.work();

        System.out.println("\nafter handling:");
        Robot[] arr = {robo, coffeeRobo, danceRobo, cookRobo};
        for (Robot tmp : arr){
            tmp.work();
        }
    }
}