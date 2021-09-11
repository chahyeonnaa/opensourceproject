package opensouceproj.prac;

import java.util.Scanner;

public class num4 {

	public static void main(String[] args) {
		System.out.print("정수 3개 입력>>"); 
		Scanner scanner=new Scanner(System.in); 
		int a = scanner.nextInt(); 
		int b = scanner.nextInt(); 
		int c = scanner.nextInt();
	  
	  if((a < b && b < c) || (c < b && b < a))
		  System.out.println("중간 값은 "+b);
	  else if ((b < a && a < c) || (c < a && a < b)) 
		  System.out.println("중간 값은 "+a); 
	  else 
		  System.out.println("중간 값은 "+c);
		

	}

}
