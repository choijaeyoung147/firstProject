package com.yedam.ref;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intAry = {10,20,30,40};
		int sum =0;
		sum = intAry[0] + intAry[1]+intAry[2]+intAry[3];
		intAry[1] = 50;
		sum=0;
		for(int i = 0; i<intAry.length; i++) {
			System.out.println(intAry[i]);
			sum=sum+intAry[i];
		}
		System.out.println(sum);
		
		double []dAry = {2.3 , 4,3};
		String []sAry = {"h","b","v","d"};
		for(int i=0;i<sAry.length;i++) {
			System.out.println(sAry[i]);
		}
		
		String[] scoreAry = new String[5];
		for(int i=0;i<scoreAry.length;i++) {
			System.out.println(scoreAry[i]);
		}
		scoreAry[0] = "one";
		scoreAry[1] = "two";
		for(int i=0;i<scoreAry.length;i++) {
			System.out.println(scoreAry[i]);
		}
		
		int[] mathAry;
		mathAry = new int[] {1,2,3,4};
	}

}
