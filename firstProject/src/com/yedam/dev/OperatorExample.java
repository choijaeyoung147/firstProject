package com.yedam.dev;

public class OperatorExample {

	public static void main(String[] args) {
		int val1 = 10;
		int result = (-3) + 8 - 5 * 4 + val1++;
		System.out.println(result);
		
		result = 10 % 7; //나머지 계산
		System.out.println(result);
		
		result = 10/7;  // 몫 계산
		System.out.println("나누기 : "+result);
		
		double r1 = 10.0 / 7.0; //실수형 나누기
		System.out.println("나누기2: "+r1);
		
		for(int i=0; i<=10; i++) {
			if(i%2==0) {
				if(i==0)
					continue;
				System.out.println("짝수: "+i);
			}else
				System.out.println("홀수: "+i);
		}
	}

}
