package car;

public class carCase {

    private int width;
    private int length;
    private int height;

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public carCase(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void action(){
        this.height +=  500;
        this.length *= 20;
        this.width /=  5;
    }

    @Override
    public String toString() {
        return "\nCARCASE: " + "length = \t" + length +  ", width = \t" + width +  ", height = \t" + height;

    }
}

