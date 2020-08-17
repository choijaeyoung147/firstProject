package com.yedam.oper;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode = 'A';
		if(charCode>= 65 & charCode <= 90) {
			System.out.println("대문자입니다.");
		}
		/*  & : 하나이면 앞에 값이 false 이여도  뒤에꺼 수행 &&  앞에 값이 false 이면  뒤에꺼 수행 x
		 *  | : 하나이면 앞에 값이 true 이여도 뒤에꺼 수행 ||  앞에 값이 true 이면 뒤에꺼 x
		 *  ^ : 둘의 값이 같으면 true 다르면 false
		 */
		int num1 = 10;
		int num2 = 20;
		
		if(num1++ <10 && num2++>20) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(num1++ <10 || num2++>20) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		// 비트연산자 정수값이 오면 비트값 비교후  값 출력 종류 & ,| ,^ ,~ ,<< ,>> ,>>>
		int a = 10, b = 11;
		int result = a & b;
		
		int a1 = 10, b1 = 11;
		int result1 = a | b;
		
		result = a << 2;
		System.out.println("비트이동 결과 "+result);
	}

}
