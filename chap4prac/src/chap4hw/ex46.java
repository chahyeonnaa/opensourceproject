package chap4hw;
class Three {
    int radius;
    public Three(int radius) {
        this.radius = radius;
    }
    public double getArea() {
        return 3.14*radius*radius;
    }
}
public class ex46 {
    public static void main(String[] args) {
        Three [] c;
        c = new Three[5];
        for(int i=0; i<c.length; i++)
            c[i] = new Three(i);
        for(int i=0; i<c.length; i++)
            System.out.print((int)(c[i].getArea()) + " ");
    }
}
