package com.iu.loop;

import java.util.Scanner;

public class Loop5_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//ID입력 PW입력
		//로그인 판단 로그인이 성공하면 종료
		//실패하면 다시 입력
		boolean check=true;
		boolean flag=false;
		int yId=1234;
		int yPw=5678;
		int id=1234;
		int pw=5678;
		int select=0;
		while(check) {
			System.out.println("1.로그인");
			System.out.println("2.종 료");
			select=sc.nextInt();
			switch(select) {
			case 1:	
			System.out.println("ID입력");
			System.out.println("PW입력");
			id = sc.nextInt();
			pw = sc.nextInt();
			if(id==yId && pw==yPw) {
				System.out.println("로그인 성공");
				check=!check;
				flag=!flag;
			} else {
				System.out.println("로그인 실패");
			}
			break;
			default :

		} //switch 끝

			//----------------------------------
			//로그인을 안했으면 프로그램이 종료
			//로그인을 성공했으면 게임 시작
			//RPG
			//시작레벨 1
			//만랩   15
			//gold : 1000
			//모든 몬스터의 경험치는 동일
			//1->2  : 3마리
			//2->3  : 6마리
			//3->4  : 9마리
			//4->5  : 12마리
			//...
			//14->15 : ?
			//5랩달성시 축하금으로 1000gold 지급
			//10랩달성시 축하금으로 2000gold 지급
			//15랩달성시 축하금으로 3000gold 지급

	} //while 끝
		
		if(flag) { //flag true면 로그인 성공 false면 로그인 실패
			System.out.println("게임을 시작");
			int level=1;
			int gold=1000;
			
			for(level=1;level<15;level++) {
					if(level%5==0) {
						gold = gold+level/5*1000;
				}
				for(int m=0;m<3*level;m++) {
					System.out.println(m+1+"bye");
				}
				System.out.println("=====");
			}
			gold=gold+3000;
			System.out.println("최종레벨 :" + level);
			System.out.println(("최종골드 :" + gold));
		}
		System.out.println("프로그램을 종료 합니다");
		
				
			}
				
}
	

		



