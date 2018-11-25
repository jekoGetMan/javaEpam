package animal;
import java.util.Scanner;

    public class Animal {
        private int speed;
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getSpeed() {
            return speed;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public Animal() {
            Scanner scan = new Scanner(System.in);
            System.out.print("\nname: ");
            this.name = scan.next();
            System.out.print("speed: ");
            this.speed = scan.nextInt();
            System.out.print("age: ");
            this.age = scan.nextInt();
        }
    }

