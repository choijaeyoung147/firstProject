package com.yedam.classes;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		Calculator cal = new Calculator();
		sum=cal.add(10, 50);
		
		System.out.println(sum);
		
		sum=cal.add(10.9, 50.5);
		System.out.println(sum);
		
		cal.getArea(5);
		cal.getArea(3.4);
		//System.out.println("가로 4, 세로 5의 넓이는 :"+ cal.getRectagle(4, 5));
		
		System.out.println(cal.getRectagle(4, 5));
	}

}
