package com.yedam.ref;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numAry = { 2, 4, 3, 5, 6 };
	
		
		
		int result = addAry(new int[] {2,3,4});
		System.out.println(result);
	}



	public static int addAry(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum;

	}

}
