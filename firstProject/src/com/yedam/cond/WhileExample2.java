package com.yedam.cond;

import java.io.IOException;

public class WhileExample2 {
//예외 처리
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		boolean run = true;
		int num = 10;
		int keyCode=0;
		System.out.println("키를 누르세요");
		while (run) {
			
			keyCode = System.in.read();
			if(keyCode ==13 || keyCode == 10) {
			System.out.print("");
			}else {
				System.out.println("키를 누르세요");
				System.out.print(keyCode);
			}
			if(keyCode==57)
				run = false;
//			System.out.println("num: "+num);
//			if(num--==0)
//				run = false; //break;
		}
		System.out.println("프로그램 종료");
	}

}
