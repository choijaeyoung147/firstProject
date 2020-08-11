package com.yedam.dev;

// char 개념 유니코드 예제
public class CharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 44032; // 65에 해당되는 unicode값 => A , 44032에 해당되는 unicode값 => 가
		for (int i = 0; i < 6; i++) {
			System.out.print(c1++ + "\t");// 하나씩 증가 되면서 알파벳 순서대로 나옵니다
		}
		char c2 = '가';
		System.out.println((int) c2); // 강제 형변환 나중에 배움,,
	}

}
