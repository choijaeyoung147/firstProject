package com.yedam.cond;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = (int)(Math.random()*6)+1; 
		// 0 < m < 1 =6곱하면> 0 <= m < 6 => (int) 걸면 0~5사이 정수값에 +1 하면 1~6사이 정수 값
		System.out.println(m);
		switch(m) {
		case 1:
			System.out.println("1번이 나왔습니다 .");
			break;
		case 2:
			System.out.println("2번이 나왔습니다 .");
			break;
		case 3:
			System.out.println("3번이 나왔습니다 .");
			break;
		case 4:
			System.out.println("4번이 나왔습니다 .");
			break;
		case 5:
			System.out.println("5번이 나왔습니다 .");
			break;
		default :
			System.out.println("6번이 나왔습니다 .");
			break;
		}
	}

}
