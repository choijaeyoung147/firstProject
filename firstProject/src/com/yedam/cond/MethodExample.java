package com.yedam.cond;

public class MethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {
			System.out.println(i+"단");
			multiTable(i);
			System.out.println();
		}
		
		multiTable();
		multiTable(1,5); // 1단부터 5단까지 
	
	}
	
	
	public static void multiTable(int a,int b) {
		for(int i= a;i <= b; i++) {
			for(int j =1;j<10;j++) {
				System.out.println(i+" * "+j+" = "+(j*i));
			}
		}
		
	}
	
	public static void multiTable() {
		for (int a = 1; a <= 9; a++) {
			System.out.println(a+"단");
			for (int b = 1; b <= 9; b++) {
				if(b==9) {
					System.out.println(a + "*" + b + " = " + (a * b));
					System.out.println();
				}else
				System.out.println(a + "*" + b + " = " + (a * b));
			}
		}
	
	}
	
	public static void multiTable(int a) {
		int num1 = a;
		for(int i =1;i<10;i++)
			System.out.println(num1+" * "+i+" = "+(num1*i));
	}

}
