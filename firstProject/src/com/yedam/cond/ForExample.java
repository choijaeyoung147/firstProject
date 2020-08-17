package com.yedam.cond;

public class ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		

		System.out.println("최종 결과는 " + sum);
		sum = 0;
		for (int a = 0; a < 3; a++) {
			sum = sum + 1;
		}
		sum = 0;
		for (int a = 3; a > 0; a--) {
			sum = sum + 1;
		}
		System.out.println("최종 결과는 " + sum);

		// 9단까지 구구단
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
		
		for(int i=0;i<=10;i++) {
			if(i==0)
				System.out.print("           ");
			for(int x=0;x<=i;x++) {
				System.out.print("*");
				if(x==i) {
					for(int b=0;b<=i;b++) {
						System.out.print("*");
					}
				}
			}
			System.out.println("*");
			for(int j=10;i<j;j--) {
				System.out.print(" ");
			}
		}
		 for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i - 1; j++) { 
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2 + 1); k++) { 
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
