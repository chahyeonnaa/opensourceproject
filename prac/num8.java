package Opensource.prac;

import java.util.Scanner;

public class num8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.print("���� �? >> ");
	     Scanner sc = new Scanner(System.in);
	     int number = sc.nextInt();
	     
	     int arr[] = new int[number];
	      for(int i=0; i<arr.length; i++) {
	         int x = (int)(Math.random()*100+1); //1���� 100������ ������ ����
	         
	         int y = 0;
	         for(int j=0; j<arr.length; j++) {
	        	 if(x == arr[j]) {
	        		 y=1;// �̹� ������ �� �ִ� ���̶��, Ż��
	        		 break;
	        	 }
	         }
	         if(y == 1) {
	        	 i--; // �ٽ� �Ҵ�޾ƾ��ϹǷ� 1�� ����
	        	 continue;
	         }
	         arr[i] = x;
	      }
	      
	      for(int i=0; i<arr.length; i++) {
	         System.out.print(arr[i] + " ");
	      }

	}

}
