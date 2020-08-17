package com.yedam.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 0;
		byte byteValue = 10;
		char charValue = 'A';
		short shortValue = 0;
		double doubleValue = 0;

		// int 4byte, char 2byte, short 2byte, double 8byte
		intValue = byteValue; // 자동 형변환
		intValue = charValue; // 자동 형변환
		shortValue = (short) charValue; // 같은 크기라도 에러남 강제 형변환 해주어야됨
		doubleValue = byteValue; // 자동 형변환

		int intValue2 = 10;
		char charValue2 = 'A';
		double doubleValue2 = 5.7;
		String strValue = "A";

		int var1 = 0;
		byte var2 = 0;
		char var3 = ' ';
		double var5 = 0;

		var5 = (double) intValue2;
		var2 = (byte) intValue2;
		var1 = (int) doubleValue2;
		// var3 = (char)strValue; String은 문자열로 문자하나 값이 아니라서 ??

		int va1 = 10;
		long va2 = 10000000000L;
		// char va3=''; 문자하나 값이라 아무것도 안 들어갈 수 는 없다 ?
		double va4 = 10;
		float va5 = 10;

		byte b = 10;
		float f = 2.5F;
		double d = 2.5;

		byte rb = (byte)(b + b); // 기본형이 int라 형변환
		int ri = 5 + b;
		float rf = 5 + f;
		double rd = 5 + d;

	}

}
