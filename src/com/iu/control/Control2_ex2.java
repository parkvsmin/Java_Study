package com.iu.control;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		//1
		
		int num = 0;
		char ch = ' '; // => b
		
		Scanner sc = new Scanner (System.in);
		System.out.println("1-5 사이의 숫자 입력");
		num = sc.nextInt(); // 1-5;
		
		
		System.out.println("알파벳을 입력");
		ch = sc.next().charAt(0);
		
		ch = (char)(ch+num);
		System.out.println("ch : " + ch);
		// num :1 ch1 :a 출력 b
		// num :2 ch1 :a 출력 c
		// num :1 ch1 :z 출력 a
		// num :2 ch1 :z 출력 b
		
		System.out.println("알파벳을 출력");
		
		if()
		
		
		
		
		
		
		
		

	}

}
