package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex1 {

	public static void main(String[] args) {
		//분 과 초 입력받음
		//ex) 1, 15
		Scanner sc = new Scanner(System.in);
		System.out.println("분 입력");
		int minute = sc.nextInt(); //1 
		System.out.println("초 입력");
		int second = sc.nextInt(); //15
		
		for(int m=0;m<60;m++) {
			for(int s=0;s<60;s++) {
				System.out.println(m + "분:" + s+"초");
				if(m==minute && s==second) {
					m=1000;
					s=1000;
				System.out.println();
				}
			}
		}
		
	}

}
