package opensouceproj.prac;

import java.util.Scanner;

public class num6 {

	public static void main(String[] args) {
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�.>>"); 
		Scanner scanner=new Scanner(System.in);
		int a = scanner.nextInt(); 
		
		if((a%10 == 3 | a%10 == 6 | a%10 == 9) && (a/10 == 3 | a/10 == 6 | a/10 == 9))
			System.out.println("�ڼ� ¦¦"); 
		else if((a%10 == 3 | a%10 == 6 | a%10 == 9) | (a/10 == 3 | a/10 == 6 | a/10 == 9)) System.out.println("�ڼ� ¦"); else
			System.out.println("����!"); 
		

	}

}
