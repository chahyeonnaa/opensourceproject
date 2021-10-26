import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
public class prac7_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> manage = new HashMap<String, Integer>(); // 이름과 포인트 저장가능
        System.out.println("** 포인트 관리 프로그램입니다 **");
        while(true) {
            System.out.print("이름과 포인트 입력 >> ");
            String name = sc.next(); // 이름 입력
            if(name.equals("그만"))
                break;
            int point = sc.nextInt(); // 포인트 입력
            if(manage.get(name) == null) {
                manage.put(name, point);
            }
            else {
                manage.put(name,  manage.get(name)+point);
            }
            Set<String> key = manage.keySet();
            Iterator<String> it = key.iterator();
            while(it.hasNext()) {
                String people = it.next();
                Integer sum = manage.get(people);
                System.out.print("("+people+","+sum+")");
            }
            System.out.println();
        }
    }
}
