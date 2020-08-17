package com.yedam.oper;
//비트 반전 연산자
public class BitOpertorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 10;
		int v2 = ~v1;
		System.out.println("v1 : "+v1);
		System.out.println("v2 : "+(v2+1)); // 2의보수=> 0 1 반전후 +1 
		
		byte b1 = 10;
		byte b2 = 5;
		int b3 = b1 % b2;
		int result = 10/4;
		double resultD = 10/4.0;
		
		if(result==2) {
			System.out.println("int는 소수점의 데이터는 손실");
		}
		
		System.out.println("소수점 밑에 까지 출력 할려면 double형 사용 :"+resultD);
	}

}
