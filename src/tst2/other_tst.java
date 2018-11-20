package tst2;

public class other_tst  {

    public static void main(String[] args){
        tst_opp link = new tst_opp();
        // Через ссылку мы можем обратится к полям и методам данного массива.
        link.getHeight();
        link.setHeight(200);

        link.view();
    }
}
