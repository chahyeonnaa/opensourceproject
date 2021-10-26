import java.util.*;
class Student { // 학생을 표현하는 클래스
    int id;
    String tel;
    public Student(int id, String tel) {
        this.id = id; this.tel = tel;
    }
}
public class ex7_7 {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<String, Student>(); // 학생 이름과 "Student 객체"를 쌍으로 저장
        map.put("황기태", new Student(1, "010-111-1111"));
        map.put("이재문", new Student(2, "010-222-2222"));
        map.put("김남윤", new Student(3, "010-333-3333"));
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("검색할 이름?");
            String name = scanner.nextLine(); // 이름 입력받기(입력받은 이름을 name에 넣기)
            if(name.equals("exit"))
                break;
            Student student = map.get(name);  // name에 해당하는 Student 객체 검색
            if(student == null)
                System.out.println(name + "은 없는 사람입니다.");
            else
                System.out.println("id:" + student.id + ", 전화:" + student.tel);
        }
        scanner.close();
    }
}
