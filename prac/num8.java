package Opensource.prac;

import java.util.Scanner;

public class num8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.print("정수 몇개? >> ");
	     Scanner sc = new Scanner(System.in);
	     int number = sc.nextInt();
	     
	     int arr[] = new int[number];
	      for(int i=0; i<arr.length; i++) {
	         int x = (int)(Math.random()*100+1); //1부터 100사이의 랜덤값 생성
	         
	         int y = 0;
	         for(int j=0; j<arr.length; j++) {
	        	 if(x == arr[j]) {
	        		 y=1;// 이미 생성된 적 있는 값이라면, 탈출
	        		 break;
	        	 }
	         }
	         if(y == 1) {
	        	 i--; // 다시 할당받아야하므로 1을 빼줌
	        	 continue;
	         }
	         arr[i] = x;
	      }
	      
	      for(int i=0; i<arr.length; i++) {
	         System.out.print(arr[i] + " ");
	      }

	}

}
