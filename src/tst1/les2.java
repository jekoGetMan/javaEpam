package tst1;
import java.util.Scanner;

    public class les2{
        public static void main(String[] args){
            les2.payment(100);
            les2.payment(1000);
        }

        // Создаем метод payment, который принимает суму платежей
        public static void payment(double money){
            double credit = 1000;
            double debts = 0;
            double overPayment = 0;

            if(money > credit){
                overPayment = money - credit;
                System.out.println("Переплата составила:\t" + overPayment + " грн");
                System.out.println("Кредит погашен");
            }
            else if (money == credit){
                System.out.println("Кредит погашен");
            }
            else {
                debts = credit - money;
                System.out.println("Ваш долг:\t" + debts + "грн");
            }
        }
    }