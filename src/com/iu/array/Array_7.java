package com.iu.array;

public class Array_7 {

	public static void main(String[] args) {
		int [] ar = {4,7,1,3,9};
		//내림차순
		for(int i=0;i<ar.length-1;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]<ar[j]) {
					ar[j]=ar[i];
					ar[i]=ar[j];
					
				}
			}
			//i=0 , 1234
			//i=1 , 234
			//i=2 , 34
			//i=3 , 4
		}
		
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}

	}

}
