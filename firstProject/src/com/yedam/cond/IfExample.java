package com.yedam.cond;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 80;
		String grade = "";
		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (score >= 80) {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if (score >= 70) {
			if (score >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else {
			grade = "D";
		}
		System.out.println("등급은 " + grade + "입니다.");

	}

}
