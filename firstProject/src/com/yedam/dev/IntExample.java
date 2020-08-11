package com.yedam.dev;
public class IntExample {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	int var1 = 10; // 10 진수
	int var2 = 012;// 8진수 12 => 10
	int var3 = 0xA; // 16진수 =>10
	System.out.println(var1);
	System.out.println(var2);
	System.out.println(var3);
	
	byte b1 = 10;
	byte b2 = 10;
	byte result1 = (byte) (b1 + 10); //기본형이 int라서 보다 작은 byte값에 넣을때는 에러발생 강제 형변환 
	int result2 = b2+10; //작은데이터 타입을 큰타입에 넣을때는 자동 형변환이 됨
}

}