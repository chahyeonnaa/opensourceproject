package Opensource.prac;

import java.util.Scanner;

public class num14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
	      Scanner sc = new Scanner(System.in);
	      int score[]  = {95, 88, 76, 62, 55};
	      String name="";
	      int i =0;
	      
	      while(true) {
	         System.out.print("���� �̸� >> ");
	         name = sc.next();
	         if(name.equals("�׸�"))
	        	 break;
	         for(i=0;i<course.length; i++) {
	            if(course[i].equals(name)) {
	               System.out.println(course[i]+"�� ������ "+score[i]);
	               break;
	            }
	         }
	         if(i == course.length) { // ���� �迭�� �ݺ������� �� ������ ��
	            System.out.println("���� �����Դϴ�.");
	         }

	}

}
}
