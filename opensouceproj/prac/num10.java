package opensouceproj.prac;

import java.util.Scanner;

public class num10 {

	public static void main(String[] args) {
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
		Scanner scanner=new Scanner(System.in);
		int mx1 = scanner.nextInt();
		int my1 = scanner.nextInt();
		int r1 = scanner.nextInt();
		
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		Scanner scanner1=new Scanner(System.in);
		int mx2 = scanner1.nextInt();
		int my2 = scanner1.nextInt();
		int r2 = scanner1.nextInt();
		double distance=Math.sqrt((mx1-mx2)*(mx1-mx2)+(my1-my2)*(my1-my2));
		
		if(distance<=r1+r2)
			System.out.print("�� ���� ���� ��ħ");
		else
			System.out.print("�� ���� ���� ��ġ�� ����");

	}

}
