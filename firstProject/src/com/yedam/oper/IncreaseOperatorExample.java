package com.yedam.oper;

public class IncreaseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = false;
		int var1 = 0;
		
		var1++;
		for(int i = 0 ; i < 3 ; i++) {
			run=!run;
			if(run) {
			var1++;
			}
		}
		System.out.println(var1);
		
		
	}

}
