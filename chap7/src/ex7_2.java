import java.util.Vector;
class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
public class ex7_2 {
    public static void main(String[] args) {

        Vector<Point> v = new Vector<Point>(); // Point 객체만을 요소로 가짐

        v.add(new Point(2, 3));
        v.add(new Point(-5, 20));
        v.add(new Point(30, -8));
        v.remove(1); // 인덱스 1의 객체 삭제

        for(int i=0; i<v.size(); i++) { // 벡터 내의 모든 객체 검색
            Point p = v.get(i); // 하나씩 얻어내기
            System.out.println(p); // 얻어낸 것 하나씩 출력
        }
    }
}
