package opensouceproj.prac;

import java.util.Scanner;

public class num4 {

	public static void main(String[] args) {
		System.out.print("���� 3�� �Է�>>"); 
		Scanner scanner=new Scanner(System.in); 
		int a = scanner.nextInt(); 
		int b = scanner.nextInt(); 
		int c = scanner.nextInt();
	  
	  if((a < b && b < c) || (c < b && b < a))
		  System.out.println("�߰� ���� "+b);
	  else if ((b < a && a < c) || (c < a && a < b)) 
		  System.out.println("�߰� ���� "+a); 
	  else 
		  System.out.println("�߰� ���� "+c);
		

	}

}
