package com.yedam.dev;

public class MorningCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = "World";
		String name = "최재영";
		System.out.println(str1 + " " + str2);

		int v1 = 150, v2 = 270;
		int result = add(v1, v2);
		System.out.println("더하기의 결과값: " + result);

		introduce(name);

		int result1 = minus(v1, v2);
		System.out.println("빼기의 결과값: " + result1);

	}

	public static void introduce(String name) {
		System.out.println("안녕하세요 저는" + name + " 입니다");
	}

	public static int add(int x, int y) { // method void가 없으면 리턴값이 필수
		int sum = x + y;
		return sum;
	}

	public static int minus(int x, int y) { // method void가 없으면 리턴값이 필수
		int sum = x - y;
		return sum;
	}

}
