package car;

public class wheel {
    private int num;
    private int width;
    private int D;

    public int getNum() {
        return num;
    }

    public int getWidth() {
        return width;
    }

    public int getD() {
        return D;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setD(int d) {
        D = d;
    }

    public wheel(int num, int width, int D) {
        this.num = num;
        this.width = width;
        this.D = D;
    }

    public void action(){
        this.num *= 4;
        this.width *= 2;
        this.D /= 3;
    }

    @Override
    public String toString() {
        return "\nWHEEL: " +  "number = " + num + ", width = " + width + ", D = " + D;
    }
}

