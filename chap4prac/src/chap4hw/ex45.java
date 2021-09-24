package chap4hw;
class Four {
    String title;
    String author;

    void show() {
        System.out.println(title + " " + author);
    }

    public Four() {
        this("", "");
        System.out.println("생성자 호출됨");
    }

    public Four(String title) {
        this(title, "작자미상");
    }

    public Four(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
public class ex45 {
    public static void main(String[] args) {
        Four littlePrince = new Four("어린왕자", "생텍쥐페리");
        Four loveStory = new Four("Bible");
        Four emptyBook = new Four();
        loveStory.show();

    }
}
