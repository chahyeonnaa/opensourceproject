package opensouceproj.prac;

import java.util.Scanner;

public class num8 {

	public static void main(String[] args) {
		System.out.print("���簢���� �����ϴ� �� �� �Է¹ޱ�>>");
		Scanner scanner=new Scanner(System.in);
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		if((x1>=100 && x1<=200) && (x2>=100 && x2<=200) && (y1>=100 && y2<=200) && (y1>=100 && y2<=200))
			System.out.println("�浹!");
		else
			System.out.println("�浹 ��������!");

	}

}
