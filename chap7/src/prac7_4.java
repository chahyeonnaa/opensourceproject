import java.util.Vector;
import java.util.Scanner;
public class prac7_4 {
    public static void main(String[] args) {
        Vector<Integer> stack = new Vector<Integer>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("강수량 입력 (0 입력시 종료) >> ");
            int num = sc.nextInt(); // 강수량 입력 받기
            if(num == 0)
                break;
            stack.add(num); // 입력받은 강수량 저장
            int avr =0;
            for(int i=0; i<stack.size(); i++) {
                System.out.print(stack.get(i)+" ");
                avr += stack.get(i); // 강수량 합 더해나가기
            }
            System.out.println();
            avr /= stack.size();
            System.out.println("현재 평균 "+avr);
        }

    }
}
