package com.yedam.ref;

public class ArrauExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] iAry = { { 10, 20 }, // iAry[0]
				{ 30, 70, 50 }, // iAry[1]
				{ 60, 30 }, // iAry[2]
				{ 40 } // iAry[3]
		};
		for (int j = 0; j < iAry.length; j++) {
			for (int i = 0; i < iAry[j].length; i++) {
				System.out.println(iAry[j][i] + " ");
			}
			System.out.println();
		}
	}

}
