package com.yedam.dev;

import java.math.BigDecimal;

public class LongFloatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.MAX_VALUE);
		long l1 = 2147483648L; // 기본형 int의 범위를 벗어나는 값이면 long형 이라는 의미로 L을 붙여야함
		
		float f1 = 0.1234567890123456789F; //실수의 기본형이 double이라 float 사용 할땐 F를 붙여야함
		double d1 =  0.1234567890123456789;
		double d2 =  0.1234567890123456789;
		double d3 = d1 + d2;
		System.out.println("d3 = "+d3); 
		// 정확 하게 계산하기 위한 클래스 
		BigDecimal bd1 = new BigDecimal("0.1234567890123456789");
		BigDecimal bd2 = new BigDecimal("0.1234567890123456789");
		BigDecimal bd3 = bd1.add(bd2);
		System.out.println("bd3 = "+bd3);
		
		
	}

}
