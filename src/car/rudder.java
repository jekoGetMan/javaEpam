package car;

public class rudder {

    private int width;
    private int D1;
    private int D2;

    public int getWidth() {
        return width;
    }

    public int getD1() {
        return D1;
    }

    public int getD2() {
        return D2;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setD1(int d1) {
        D1 = d1;
    }

    public void setD2(int d2) {
        D2 = d2;
    }

    public rudder(int width, int D1, int D2) {
        this.width = width;
        this.D1 = D1;
        this.D2 = D2;
    }

    public void action() {
        this.width *= 3;
        this.D1 *= 4;
        this.D2 /= 3;
    }

    @Override
    public String toString() {
        return "\nRUDDER: " + "WIDTH =\t " + width +  ", D1 =\t " + D1 + ", D2 =\t " + D2;
    }
}

