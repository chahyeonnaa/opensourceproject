package Opensource.prac;

import java.util.Scanner;

public class num16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      String str[] = {"����", "����", "��"};
	      Scanner sc = new Scanner(System.in);
	      String User, Com;
	      int n; 
	      System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
	      while(true)
	      {
	         System.out.print("���� ���� ��! >> ");
	         User = sc.next();
	         if(User.equals("�׸�")) 
	        	 break;
	         n = (int)(Math.random()*3);
	         Com=str[n];
	         if(User.equals("����")) {
	            if(str[n].equals("����")) {
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Com+" �����ϴ�.");
	               continue;
	            }
	            else if(str[n].equals("����")) {
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Com+" ����ڰ� �����ϴ�.");
	               continue;
	            }
	            else if(str[n].equals("��")) {
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Com+" ����ڰ� �̰���ϴ�.");
	               continue;
	            }
	         }
	         else if(User.equals("����")) {
	            if(str[n].equals("����")) {
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Com+" ����ڰ� �̰���ϴ�.");
	               continue;
	            }
	            else if(str[n].equals("����")) {
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Com+" �����ϴ�.");
	               continue;
	            }
	            else if(str[n].equals("��")) {
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Com+" ����ڰ� �����ϴ�.");
	               continue;
	            }
	         }
	         else if(User.equals("��")) {
	            if(str[n].equals("����")) {
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Com+" ����ڰ� �����ϴ�.");
	               continue;
	            }
	            else if(str[n].equals("����")) {
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Com+" ����ڰ� �̰���ϴ�.");
	               continue;
	            }
	            else if(str[n].equals("��")) {
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Com+" �����ϴ�.");
	               continue;
	            }
	         }
	         System.out.print("����� = "+User+" , ��ǻ�� = "+Com+" ");
	      }
	      System.out.println("������ �����մϴ�...");
	      sc.close();
	   }

	}

