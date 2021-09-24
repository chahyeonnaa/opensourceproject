package chap4hw;
import java.util.Scanner;
class Chaek {
    String title, author;
    public Chaek(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class ex47 {
    public static void main(String[] args) {
        Chaek [] book = new Chaek[2];
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<book.length; i++) {
            System.out.print("제목>>");
            String title = scanner.nextLine();
            System.out.print("저자>>");
            String author = scanner.nextLine();
            book[i] = new Chaek(title, author);
        }
        for(int i=0; i<book.length; i++)
            System.out.print("(" + book[i].title + ", " + book[i].author + ")");
    }
}
