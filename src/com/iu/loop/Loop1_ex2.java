package com.iu.loop;

import java.util.Scanner;

public class Loop1_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1. 1번 대문자 2번 소문자
		//   1번이면 A~Z출력 2번이면a~z출력
		int num = 0;
		
		//A: 65 Z:90
		//a: 97 z:122
		System.out.println("1번 대문자 2번 소문자");
		int select = sc.nextInt();
		int i = 97;
		int j = 123; //122+1
		
		if(select==1) {
			i=65;
			j=91; //90+1
		}
		
		for(int c=i;c<j;c++) {
			System.out.println((char)c);
		}
		
		if(select == 1) {
			for(int c=65;c<=90;c++)
			System.out.println((char)c);
		} else {
			for(int c=97;c<=122;c++)
			System.out.println((char)c);
		}
		//2. 1~10까지의 합 구하기
		//sum=0;
		//sum=sum+1;
		//sum=sum+2;
		//sum=sum+3;
		// ***
		//sum=sum+10;
		int sum = 0; //합을 담을 변수
		
		for(int start=1; start<=10; start++) {
			sum += start;
		}
		System.out.println("1~10까지의 합 구하기 : " + sum);
		
		//3. ID PW입력해서 로그인 판단
		//   최대 5번까지 시도 가능
		//   로그인 성공하면 그즉시 종료
		int yId=1234; //회원가입시 입력한 ID
		int yPw=5678; //회원가입시 입력한 PW
		
		yId = 1234;
		yPw = 5678;
		boolean check=false;
		int y=0;
		for( y=0;y<5;y++) {
			System.out.println("ID입력");
			int id = sc.nextInt();
			System.out.println("PW입력");
		
			int pw = sc.nextInt();
			
			if(id==yId && pw==yPw) {
				System.out.println("로그인 성공");
				check=!check;
				y=1000;
				break;
			} else {
				System.out.println("로그인 실패");
			}
			
		} //for 끝
		
//		if(y==5) {
//			System.out.println("은행방문");
//		} else {
//			System.out.println("게임시작");
//		}
		
		if(check) {
			System.out.println("게임시작");
		} else {
			System.out.println("은행방문");
		}
		//1. 로그인 성공
		//2. 로그인 5번 전부 실패
		
				System.out.println("Finish");
	}
}
		
		
	

