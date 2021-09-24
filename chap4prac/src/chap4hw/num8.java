package chap4hw;
import java.util.Scanner;
class Phone {
    private String name;
    private String tel;
    Phone(String name, String tel) { // 이름과 번호를 저장
        this.name = name;
        this.tel = tel;
    }
    public String getName() { // 메인에서 이름을 사용할 수 있도록 하게 하는 함수
        return name;
    }
    public String getTel() { // 메인에서 번호 사용가능
        return tel;
    }
}
public class num8 {
    public static void main(String[] args) {
        int i;
        System.out.print("인원수 >> ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Phone phone[];
        phone = new Phone[num];
        for(i=0; i<phone.length; i++) { // 입력받은 사람 수 만큼 입력받기
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name = sc.next();
            String tel = sc.next();
            phone[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");
        while(true) { // 그만할때까지 무한반복문 돌리기
            System.out.print("검색할 이름 >>");
            Scanner scr = new Scanner(System.in);
            String name = scr.next();
            for(i=0; i<num; i++) { // 배열 다 돌면서 같은 이름 있는지 확인
                if(name.equals(phone[i].getName())) {
                    System.out.println(name+"의 번호는 "+phone[i].getTel()+" 입니다.");
                    i--;
                    break; // 이름 찾기 반복문 탈출
                }
            }
            if(name.equals("그만")) break;
            if (i == num) System.out.println(name+"이 없습니다.");
        }
    }
}
