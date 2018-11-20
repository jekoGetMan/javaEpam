package tst2;
    public class tst_opp{

            private int length;
            private int height;
            public double square = 20;
            public float a;
            public float b;
            public float c;

            public int getLength () {
                return length;
            }

            public void setLength ( int length){
                this.length = length;
            }

            public void setHeight ( int height){
                this.height = height;
            }

            public int getHeight () {
                return height;
            }

            public void view () {
                System.out.println("Height" + height);
                System.out.println("length" + length);
            }

            public static void lol () {
                System.out.println("Hello world!");
            }
    }