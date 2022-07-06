package com.iu.control;

import java.util.Scanner;

public class Control1_ex2 {

	public static void main(String[] args) {
		// 정수입력
		// 홀수입니다 짝수입니다 출력
		// 단일 if 한번만 사용
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		String result = "홀수입니다";
	
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();	
			
			if (num%2==0) {
				result="짝수입니다";
			}
		// result = num%2==0 ? "짝수입니다" : "홀수입니다";
		System.out.println(result);

 }

}
