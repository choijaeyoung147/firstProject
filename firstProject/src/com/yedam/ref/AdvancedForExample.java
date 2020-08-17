package com.yedam.ref;

import java.util.Arrays;
import java.util.Scanner;

public class AdvancedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int maxVal = 0;
		int[] scores = new int[5];
		
		for(int i = 0; i<scores.length;i++) {
			System.out.println(" 점수 입력 ㄱ:" );
			scores[i]=scanner.nextInt();
		}
		
		Arrays.sort(scores);
		int sum = 0;
		double avg = 0;
		for(int num : scores) {
			sum+=num;
		}
		avg=(double)sum/scores.length;
		
		System.out.println("점수의 평균은 "+avg+"최고점수는:"+scores[scores.length-1]);
	}

}
