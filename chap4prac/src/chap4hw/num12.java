package chap4hw;
import java.util.Scanner;
class Reserve{
    private String S[];
    private String A[];
    private String B[];
    private Scanner sc;
    Reserve() {
        sc = new Scanner(System.in);
        S = new String[10]; // 한 등급당 10명제한
        A = new String[10];
        B = new String[10];
        for(int i=0; i<S.length; i++) {
            S[i] = "___"; // 10자리씩 줄 긋기
            A[i] = "___";
            B[i] = "___";
        }
    }
    public static void printSeat(String seat[]) { // 좌석 출력
        for(int i=0; i<seat.length; i++) {
            System.out.print(" "+seat[i]+" " );
        }
        System.out.println();
    }
    public void allPrint() {  // 조회
        System.out.print("S>>");
        Reserve.printSeat(S);
        System.out.print("A>>");
        Reserve.printSeat(A);
        System.out.print("B>>");
        Reserve.printSeat(B);
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }
    public void choiceSeat() { //좌석 선택(S, A, B)
        while(true) {
            System.out.print("좌석구분 S(1), A(2), B(3)>>");
            int select = sc.nextInt();
            switch(select) {
                case 1:
                    System.out.print("S>>");
                    printSeat(S); // 좌석 현황 보여주기
                    inputSeat(S); // 예약
                    return;
                case 2:
                    System.out.print("A>>");
                    printSeat(A);
                    inputSeat(A);
                    return;
                case 3:
                    System.out.print("B>>");
                    printSeat(B);
                    inputSeat(B);
                    return;
                default:
                    System.out.println("다시 입력해 주세요.");
            }
        }
    }
    public void inputSeat(String seat[]) { // 예약하기
        System.out.print("이름>>");
        String name = sc.next();
        while(true) {
            System.out.print("번호>>");
            int num = sc.nextInt();
            num--;
            if(seat[num].equals("___")) { // 예약하고자 하는 자리가 공석이면,
                seat[num] = name; // 그 자리를 이름으로 채워넣기
                break;
            }
            else {
                System.out.println("다른 좌석을 선택해 주세요.");
            }
        }
    }
    public void d_choiceSeat() { // 예약 취소
        while(true) {
            System.out.print("좌석 S:1, A:2, B:3>>");
            int select = sc.nextInt();
            switch(select) {
                case 1:
                    System.out.print("S>>");
                    printSeat(S); // 좌석 현황 보여주고
                    delete(S); // 취소시키기
                    return;
                case 2:
                    System.out.print("A>>");
                    printSeat(A);
                    delete(A);
                    return;
                case 3:
                    System.out.print("B>>");
                    printSeat(B);
                    delete(B);
                    return;
                default:
                    System.out.println("다시 입력해 주세요.");
            }
        }
    }
    public void delete(String seat[]) { // 취소
        System.out.print("이름>>");
        String name = sc.next();
        for(int i=0; i<seat.length; i++) {
            if(name.equals(seat[i])) { // 일치하는 이름이 있으면, 그 자리를 공석으로 만들기
                seat[i] = "___";
                break;
            }
        }
    }
}
public class num12 {
    public static void main(String[] args) {
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        Scanner sc = new Scanner(System.in);
        Reserve x = new Reserve(); // 객체 생성
        while(true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
            int select = sc.nextInt();
            switch(select) {
                case 1:
                    x.choiceSeat();
                    break;
                case 2:
                    x.allPrint();
                    break;
                case 3:
                    x.d_choiceSeat();
                    break;
                case 4:
                    sc.close();
                    return;
                default :
                    System.out.println("다시 입력해 주세요.");
            }
        }

    }
}
