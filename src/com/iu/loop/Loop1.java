package com.iu.loop;

public class Loop1 {

	public static void main(String[] args) {
		System.out.println("Start");
		
		
		//for(초기식;조건식;증감식){}
		for(int i=0; i<5; i=i+1) { // i++ => i=i+1
			System.out.println("Hello World!");
		}
		int count = 0;
		for(int i=0;i<10;i++) {
			System.out.println("count");
			count++;
		}
		
		System.out.println("Finish");

	}

}
