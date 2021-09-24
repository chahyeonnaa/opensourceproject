package chap4hw;
import java.util.Scanner;
class Grade { // 점수처리 클래스
    private int math;
    private int science;
    private int english;
    Grade(int math, int science, int english) { // 점수를 과목별로 저장
        this.math = math;
        this.science = science;
        this.english = english;
    }
    public int average() { // 평균
        return (math + science + english) / 3;
    }
}

public class num2 {
    public static void main(String[] args) {

        System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
        Scanner sc = new Scanner(System.in); // 점수 입력
        int math = sc.nextInt();
        int science = sc.nextInt();
        int english = sc.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("평균은 " + me.average());
    }
}