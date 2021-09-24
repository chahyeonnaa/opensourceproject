package chap4hw;
class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public void show() { // 넓이와 좌표를 출력
        System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
    }
    public int square() { // 사각형 넓이 리턴
        return (width*height);
    }
    boolean contains(Rectangle r) { //r이 사각형 안에 있는지 확인
        if(x < r.x && y < r.y)
            if((width+x) > (r.x+r.width) && (height+y) > (r.y+r.height))
                return true;
        return false;
    }
}

public class num4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 "+s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다."); // 참이면 출력
        if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
    }
}
