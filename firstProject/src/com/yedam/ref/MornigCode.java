package com.yedam.ref;

public class MornigCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array = new int[5][5];
		int sum=0;
		for(int j=0;j<5;j++) {
			for(int i=0;i<5;i++) {
				if(j<i) {
					array[j][i]= ++sum;
				}else
					array[j][i]= ++sum;
					System.out.printf("%3d",array[i][j]);
				
			}
			System.out.print(sum+" ");
			System.out.println();
		}
	}

}
