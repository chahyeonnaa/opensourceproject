package Opensource.prac;

import java.util.Scanner;

public class num4 {

	public static void main(String[] args) {
	    String st;
	    char c;
	      
	    System.out.print("소문자 알파벳 하나를 입력하시오 >> ");
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

