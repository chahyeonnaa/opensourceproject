package chap4hw;
class Two{
    int radius;
    String name;

    public Two() {
        radius = 1;
        name = "";
    }

    public Two(int r, String n) {
        radius = r;
        name = n;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}
public class ex43 {
    public static void main(String[] args) {
        Two pizza = new Two(10, "자바피자");
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);
        Two donut = new Two();
        donut.name = "도넛피자";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
