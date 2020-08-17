package com.yedam.classes;

import java.util.Scanner;

public class FriendExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		friend[] fra = null;
		int fs = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1 정보 입력 | 2 리스트 | 3 이름 조회 | 4 이름 조회후 수정 | 9 종료");
			System.out.println("----------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();
			scanner.nextLine();

			if (selectNo == 1) {
				System.out.print("친구 수 :");
				fs = scanner.nextInt();
				scanner.nextLine();

				fra = new friend[fs];
				System.out.println("정보입력 하시오 ");


				for (int i = 0; i < fra.length; i++) {
					friend fr = new friend(" ", 0, " ");
					System.out.print("이름:");
					fr.setName(scanner.nextLine());
					System.out.print("나이:");
					fr.setAge(scanner.nextInt());
					scanner.nextLine();
					System.out.print("폰번호:");
					fr.setPnum(scanner.nextLine());
					fra[i] = fr;
				}

			} else if (selectNo == 2) {
				System.out.println("리스트");
				for (int i = 0; i < fra.length; i++) {
					System.out.println("이름은 " + fra[i].getName() + " 나이는 " + fra[i].getAge() + " 휴대폰번호 " + fra[i].getPnum());
				}
			} else if (selectNo == 3) {
				System.out.print("이름 조회할 이름 입력: ");
				String sname=scanner.nextLine();
				for (int i = 0; i < fra.length; i++) {
					if(fra[i].getName().equals(sname)) {
						System.out.println("이름은 " + fra[i].getName() + " 나이는 " + fra[i].getAge() + " 휴대폰번호 " + fra[i].getPnum());
					}
				}
			} else if (selectNo == 4) {
				System.out.print("조회할 이름: ");
				String sname =scanner.nextLine();
				for (int i = 0; i < fra.length; i++) {
					if(fra[i].getName().equals(sname)) {
						System.out.print("수정할 이름:");
						fra[i].setName(scanner.nextLine());
					}
				}

			} else if (selectNo == 9) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
