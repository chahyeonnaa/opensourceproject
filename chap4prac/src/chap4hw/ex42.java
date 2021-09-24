package chap4hw;
import java.util.Scanner;
class Semo{
    int width;
    int height;

    public int getArea()
    {
        return width*height;
    }
}
public class ex42 {
    public static void main(String[] args) {
        Semo rect= new Semo();
        Scanner scanner= new Scanner(System.in);
        System.out.println(">> ");

        rect.width=scanner.nextInt();
        rect.height=scanner.nextInt();

        System.out.println("사각형의 면적은 "+rect.getArea());

    }
}
