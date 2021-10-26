import java.util.*;
public class ex7_5 {
    public static void main(String[] args) {

        HashMap<String, String> dic = new HashMap<String, String>(); // 영어 단어와 한글 단어의 쌍을 저장

        dic.put("baby", "아기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");

        Scanner scanner = new Scanner(System.in);
        while(true) { // 무한반복문
            System.out.print("찾고 싶은 단어는?");
            String eng = scanner.next(); // 입력받기(변수 eng에 저장)
            if(eng.equals("exit")) {
                System.out.println("종료합니다...");
                break;
            }

            String kor = dic.get(eng); // eng의 키값 얻기
            if(kor == null)
                System.out.println(eng + "는 없는 단어 입니다.");
            else
                System.out.println(kor);
        }
        scanner.close();
    }
}
