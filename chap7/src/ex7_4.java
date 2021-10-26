import java.util.*;
public class ex7_4 {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<Integer>();
        v.add(5); // 5 삽입
        v.add(4); // 4 삽입
        v.add(-1); // -1 삽입
        v.add(2, 100); // 4와 -1 사이에 정수 100 삽입

        Iterator<Integer> it = v.iterator(); // 인덱스 없이 순차 검색 가능
        while(it.hasNext()) { // 모든요소 방문
            int n = it.next(); // 다음요소 리턴
            System.out.println(n);
        }

        int sum = 0;
        it = v.iterator(); // 객체 얻기
        while(it.hasNext()) { // 처음부터 돌면서
            int n = it.next();
            sum += n;
        }
        System.out.println("벡터에 있는 정수 합 : " + sum);
    }
}
