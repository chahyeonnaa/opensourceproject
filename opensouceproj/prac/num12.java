package opensouceproj.prac;

import java.util.Scanner;

public class num12 {

	public static void main(String[] args) {
		System.out.print("연산 >>");
		Scanner scanner=new Scanner(System.in);
		int a = scanner.nextInt();
		String b = scanner.next();
		int c = scanner.nextInt();

		if(b.equals("+"))
			System.out.print("연산결과는 "+(a+c));
		else if(b.equals("-"))
				System.out.print("연산결과는 "+(a-c));
		else if(b.equals("*"))
				System.out.print("연산결과는 "+(a*c));
		else if(b.equals("/"))
		{
			if(c==0)
				System.out.print("0으로 나눌 수 없습니다.");
			else
				System.out.print("연산결과는 "+(a/c));
		}
				
	}

}
