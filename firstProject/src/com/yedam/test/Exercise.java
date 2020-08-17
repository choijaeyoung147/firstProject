package com.yedam.test;

import java.util.Scanner;

// 스캐너 예제
public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int balance = 0;
		int input = 0;
		int output = 0;
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("----------------------------");
			System.out.println("선택> ");
			int menu = scanner.nextInt();
			
			
			if(menu == 1) {
				System.out.println("예금선택");
				input =  scanner.nextInt();
				balance = balance+input;
				System.out.println("예금은 :"+balance);
				
			}else if(menu == 2) {
				System.out.println("출금선택");
				output = scanner.nextInt();
				balance = balance-output;
				System.out.println("출금액 :"+output);
				
			}else if(menu == 3) {
				System.out.println("잔고선택");
				System.out.println("잔고는 :"+balance);
			
			}else if(menu == 4)
				run = false;
			else
				System.out.println("잘못 입력 했습니다 ");
		}
		System.out.println("프로그램 종료");
}
}
