package com.yedam.cond;

public class WhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0,j=1,x=1;
		int sum = 0;
		while (i<10) {
			System.out.println(++i);
			sum+=i;
		}
		System.out.println("1 ~"+i+" 까지 합:" + sum);
		
		while (j<10) {
			x=1;
			while(x<10) {
				System.out.println(j+"*"+x+"="+(j*x));
				x++;
			}
			j++;
			System.out.println();
			
		}
	}

}
