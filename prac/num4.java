package Opensource.prac;

import java.util.Scanner;

public class num4 {

	public static void main(String[] args) {
	    String st;
	    char c;
	      
	    System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ� >> ");
	    Scanner sm = new Scanner(System.in);
	    st = sm.next(); 
	    c = st.charAt(0); 
	      
	     for(int i = 0; i<=c-'a'; i++) {
	         for(char j = 'a'; j<= c-i; j++) {
	            System.out.print(j);
	         }
	         System.out.println();
	      }
	      
	   }

	}

