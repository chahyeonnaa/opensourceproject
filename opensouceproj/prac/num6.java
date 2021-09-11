package opensouceproj.prac;

import java.util.Scanner;

public class num6 {

	public static void main(String[] args) {
		System.out.print("1~99 사이의 정수를 입력하시오.>>"); 
		Scanner scanner=new Scanner(System.in);
		int a = scanner.nextInt(); 
		
		if((a%10 == 3 | a%10 == 6 | a%10 == 9) && (a/10 == 3 | a/10 == 6 | a/10 == 9))
			System.out.println("박수 짝짝"); 
		else if((a%10 == 3 | a%10 == 6 | a%10 == 9) | (a/10 == 3 | a/10 == 6 | a/10 == 9)) System.out.println("박수 짝"); else
			System.out.println("실패!"); 
		

	}

}
