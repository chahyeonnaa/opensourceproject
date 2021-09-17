package Opensource.prac;

import java.util.Scanner;

public class num6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	      int arr[] = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류
	      int money;
	      
	      System.out.print("금액을 입력하시오 >> ");
	      Scanner sc = new Scanner(System.in);
	      money = sc.nextInt();
	      
	      for(int i=0; i<arr.length; i++) {
	         System.out.printf("%d 원 짜리 : %d개 \n",arr[i], money/arr[i]);
	         money = money - (money / arr[i])*arr[i];
	      }
		
	}

}
