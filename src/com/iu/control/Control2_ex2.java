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
		
		int result = ch + num;
		
		//소문자가 범위를 벗어났을 때
		if(result>'z') {
			result = result - 'z'-1; //2
			result = 'a'+result;
			
		}
		//대문자가 범위를 벗어났을 떄
		if(result>'Z' && result<'a') {
			result = result-'Z'-1;
			result = 'A'+result;
			System.out.println("대문자 영역");
		}
		ch = (char)result;
		System.out.println("ch : " + ch);
		// num :1 ch :a 출력 b
		// num :2 ch :a 출력 c
		// num :1 ch :z 출력 a
		// num :2 ch :z 출력 b
		

		
		

	}
	
}

