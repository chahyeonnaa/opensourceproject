package opensouceproj.prac;

import java.util.Scanner;

public class num12 {

	public static void main(String[] args) {
		System.out.print("���� >>");
		Scanner scanner=new Scanner(System.in);
		int a = scanner.nextInt();
		String b = scanner.next();
		int c = scanner.nextInt();

		if(b.equals("+"))
			System.out.print("�������� "+(a+c));
		else if(b.equals("-"))
				System.out.print("�������� "+(a-c));
		else if(b.equals("*"))
				System.out.print("�������� "+(a*c));
		else if(b.equals("/"))
		{
			if(c==0)
				System.out.print("0���� ���� �� �����ϴ�.");
			else
				System.out.print("�������� "+(a/c));
		}
				
	}

}
