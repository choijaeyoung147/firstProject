package com.yedam.classes;

public class friend {
//필드
private String name;
private int age;
private String pnum;
// 클래스명 직접 올수있음 ;

//생성자
public friend(String name, int age, String pnum) {
	this.name = name;
	this.age = age;
	this.pnum = pnum;
}

//메서드
public String getName() {
	return name;
}
@Override
public String toString() {
	return "friend [name=" + name + ", age=" + age + ", pnum=" + pnum + "]";
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getPnum() {
	return pnum;
}
public void setPnum(String pnum) {
	this.pnum = pnum;
}



}
