package homeWorks;

public class displayFigures {

    public static void fig1(){
        System.out.println("\n*************** figure 1 ******************\n");
        int range =5;
        for(int i=1; i <=5; i++){
            for(int length=range; length>0;length--){
                System.out.print("   ");
            }
            for(int k = i; k > 0; k--){
                System.out.print(" * ");
            }
            System.out.println("");
            range--;
        }
    }

        public static void fig2(){

        System.out.println("\n*************** figure 2 ******************\n");
        int range = 1;
        for (int i = 5; i > 0; i--) {

            for (int k = 0; k < i; k++) {
                System.out.print(" * ");
            }
            System.out.println("");
            for (int a = 0; range < a; a++) {
                System.out.print("   ");
            }
            range++;
        }

    }


    public static void fig3(){
        System.out.println("\n*************** figure 3 ******************\n");
        int i;
        int k;

        i = 0;
        while (i < 11){
            k = 0;
            while ((k <= i) && (k < (11 - i)))
            {
                System.out.print(" * ");
                k++;
            }
            System.out.println("");
            i++;
        }
    }


    public static void fig4(){
        System.out.println("\n*************** figure 4 ******************\n");
        int i = 0;
        while (i < 15) {
            int k = 15 / 2 - 1;
            while (k < 15) {
                if ((i > k) || (i + k <= 15)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
                k++;
            }
            System.out.print("\n");
            i++;
        }
  }


    public static void fig5(){
    System.out.println("\n*************** figure 5 ******************\n");
        for (int count = 2; count > 0; --count){
        int i = 0;
        while (i < (20 / 2)){
            int k = 0;
            while (k < 20){
                if (k >= (20 / 2) - i && k <= (20 / 2) + i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                k++;
            }
            System.out.print("\n");
            i++;
        }
      }
    }

        public static void main(String[] args) {
              fig1();
              fig2();
              fig3();
              fig4();
              fig5();
        }
}
