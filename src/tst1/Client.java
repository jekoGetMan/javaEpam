package tst1;

public class Client {

    private static int counter = 3;

    public Client(){
        counter++;
    }

    public static void main(String[] args)
    {
        Client c1 = new Client();
        Client c2 = new Client();
        Client c3 = new Client();


        System.out.println(Client.counter);
    }

}
