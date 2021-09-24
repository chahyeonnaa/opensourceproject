package chap4hw;

import java.util.Scanner;

class Dictionary {
    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String[] eng = {"love", "baby", "money", "future", "hope"};

    public static String kor2Eng(String word) {
        for (int i = 0; i < kor.length; i++) {
            if (word.equals(kor[i])) { // 배열안에 입력받은 한글단어가 있다면
                System.out.print(word + "은 "); // 출력하고
                return eng[i]; // 영어단어 리턴
            }
        }
        return "false"; // 없으면 false리턴
    }
}
public class num10 {
    public static void main(String[] args) {
        System.out.println("한영 단어 검색 프로그램 입니다");
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("한글단어?");
            String word=sc.next();
            if(word.equals("그만")) break;
            String result = Dictionary.kor2Eng(word); // 입력받은 한글단어를 매칭시키기 위해 넘김, 리턴값을 result 로하였음
            if(result.equals("false")) // false가 리턴되면 없다고 출력
                System.out.println(word+"는 저의 사전에 없습니다.");
            else
                System.out.println(result); // false가 아니면 정상 단어 출력

        }

    }
}
