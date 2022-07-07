package com.iu.control;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		//1
		
		int num = 0;
		char ch = ' '; // => b
		
		Scanner sc = new Scanner (System.in);
		num = sc.nextInt(); // 1-5;
		System.out.println("1-5 사이의 숫자 입력");
		
		ch = sc.nextLine().charAt(0);
		System.out.println("알파벳을 입력");
		
		ch = (char)(ch+num);
		System.out.println("ch : " + ch);
		// num :1 ch :a 출력 b
		// num :2 ch :a 출력 c
		// num :1 ch :z 출력 a
		// num :2 ch :z 출력 b
		
		System.out.println("알파벳을 출력");
		
		if((ch>=97) & (ch<=122)); {
			System.out.println("소문자");
		}
		
		//Study Edition
		//Home Edition

		
		
		
		
		
		
		
		

	}

}
