package chap4hw;
import java.util.Scanner;
class Circle {
    private double x, y;
    private int radius;
    public Circle(double x, double y, int radius) {
        this.x = x; // x,y,radius 받아오기
        this.y =y;
        this.radius = radius;
    }
    public void show() {
        System.out.println("(" + x + "," + y + ")"+ radius);
    }
    public int getRadius() {
        return radius;
    }
}

public class num6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c[] = new Circle[3]; // 3개의 배열
        int max=0;
        for(int i=0; i < c.length; i ++) { // 3쌍 입력받기
            System.out.print("x, y, radius >>");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int radius = sc.nextInt();
            c[i] = new Circle(x, y, radius);
        }
        for(int i=0; i<c.length; i++) // 배열 처음부터 끝까지
            if(max < c[i].getRadius()) // 가장 긴 반지름 찾기
                max = c[i].getRadius();
        for(int i=0; i<c.length; i++)
            if(max == c[i].getRadius()) {
                System.out.print("가장 면적인 큰 원은 ");
                c[i].show();
            }

    }
}
