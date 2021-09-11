package opensouceproj.prac;

import java.util.Scanner;

public class num10 {

	public static void main(String[] args) {
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		Scanner scanner=new Scanner(System.in);
		int mx1 = scanner.nextInt();
		int my1 = scanner.nextInt();
		int r1 = scanner.nextInt();
		
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		Scanner scanner1=new Scanner(System.in);
		int mx2 = scanner1.nextInt();
		int my2 = scanner1.nextInt();
		int r2 = scanner1.nextInt();
		double distance=Math.sqrt((mx1-mx2)*(mx1-mx2)+(my1-my2)*(my1-my2));
		
		if(distance<=r1+r2)
			System.out.print("두 원은 서로 겹침");
		else
			System.out.print("두 원은 서로 겹치지 않음");

	}

}
