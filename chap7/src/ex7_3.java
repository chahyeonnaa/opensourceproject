import java.util.ArrayList;
import java.util.Scanner;

public class ex7_3 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>(); // 문자열만 삽입가능

        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<4; i++) {
            System.out.print("이름을 입력하세요>>");
            String s = scanner.next();  // 이름4개 입력받기
            a.add(s); // 어레이 리스트에 삽입
        }

        for(int i=0; i<a.size(); i++) { // 모든 이름 출력

            String name = a.get(i); // 하나씩 받아오기
            System.out.print(name + " ");
        }

        int longestIndex = 0;
        for(int i=1; i<a.size(); i++) {
            if(a.get(longestIndex).length() < a.get(i).length()) // 길이 비교해서 가장 긴이름 찾기
                longestIndex = i;
        }
        System.out.println("\n가장 긴 이름은 : " +
                a.get(longestIndex));
    }
}

