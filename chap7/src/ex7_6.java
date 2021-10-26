import java.util.*;
public class ex7_6 {
    public static void main(String[] args) {
        // 사용자 이름과 점수를 기록
        HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
        javaScore.put("김성동", 97);
        javaScore.put("황기태", 88);
        javaScore.put("김남윤", 98);
        javaScore.put("이재문", 70);
        javaScore.put("한원선", 99);
        System.out.println("HashMap의 요소 개수 :" + javaScore.size());

        Set<String> keys = javaScore.keySet();

        Iterator<String> it = keys.iterator(); // 인덱스 없이 순서대로 접근가능
        while(it.hasNext()) { // 처음부터 돌면서 전체 출력
            String name = it.next();
            int score = javaScore.get(name);
            System.out.println(name + " : " + score);
        }
    }
    }
