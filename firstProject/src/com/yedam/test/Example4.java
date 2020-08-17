package com.yedam.test;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pencils = 534;
		int students = 30;
		 
		//학생 한명이 가지는 연필수
		int pencilsPerStudent=(pencils/students);
		System.out.println("학생 한명이 가지는 연필수: "+pencilsPerStudent);
		
		//남은 연필 수
		int pencilLeft=(pencils%students);
		System.out.println("남은 연필 수: "+pencilLeft);
	}

}
