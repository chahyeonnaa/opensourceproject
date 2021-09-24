package chap4hw;
class One{
    int radius;
    String name;

    public One(){} // 생성자

    public double getArea()
    {
        return 3.14*radius*radius;
    }

}
public class ex41 {
    public static void main(String[] args) {
        One pizza;
        pizza=new One();
        pizza.radius=10;
        pizza.name="자바피자";
        double area=pizza.getArea();
        System.out.println(pizza.name+"의 면적은 "+area);

        One donut=new One();
        donut.radius=2;
        donut.name="자바도넛";
        area=donut.getArea();
        System.out.println(donut.name+"의 면적은 "+area);

    }
}
