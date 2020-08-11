package com.yedam.dev;

public class BooleanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l1 = 10L;
		int i1 = 10;
		boolean trueOrFalse = false;
		/* == 같다  =! 같지않다 */
		trueOrFalse = l1==i1;
		if(trueOrFalse) {
			System.out.println("이 내용은 참일 경우에 출력");
		}
		System.out.println(trueOrFalse);
		
		if(l1>=i1) {
			System.out.println("왼쪽이 크거나 같습니다.");
		}
	}

}
