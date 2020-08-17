package com.yedam.classes;

public class Student {
private int studentNum ;
private String name;
private String major;

public Student() {
	this. studentNum =0;
	this. name="";
	this. major="";
}

public Student(int x) {
	this. studentNum =x;
	this. name="";
	this. major="";
}

public Student(int x,String y) {
	this. studentNum =x;
	this. name=y;
	this. major="";
}

public Student(int studentNum, String name, String major) {
	super();
	this.studentNum = studentNum;
	this.name = name;
	this.major = major;
}

public void  setname(String y) {
	this.name=y;
}

public String getname() {
	return name;
}

public void  setmajor(String z) {
	this.major=z;
}

public String getmajor() {
	return major;
}


public int getstudentNum() {
	return studentNum;
}

@Override
public String toString() {
	return "Student [학번은=" + studentNum + ", 이름은=" + name + ", 전공은=" + major + "]";
}

public void setstudentNum(int x) {
	this.studentNum= x;
}



}
