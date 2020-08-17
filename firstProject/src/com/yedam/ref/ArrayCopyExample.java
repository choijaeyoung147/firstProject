package com.yedam.ref;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] origAry;
		origAry = new int[] {3,6,9,2,4};
		int[] cpyAry =new int[5];
		
//		for(int i=0;i<origAry.length;i++){
//			cpyAry[i]=origAry[i];
//			System.out.println(cpyAry[i]);
//		}
		System.arraycopy(origAry, 0, cpyAry, 1,4); //배열 복사
		
		for(int i=0;i<origAry.length;i++){
			System.out.println(cpyAry[i]);
		}
		// 배열의 크기만큼 반복 
		for(int num : cpyAry) {
			System.out.println(num);
		}
	}

}
